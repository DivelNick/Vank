package divelnick.ru.vank.ui.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import com.vk.sdk.VKAccessToken;
import com.vk.sdk.VKCallback;
import com.vk.sdk.VKSdk;
import com.vk.sdk.api.VKError;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.Provides;
import divelnick.ru.vank.R;
import divelnick.ru.vank.base.BaseActivity;
import divelnick.ru.vank.data.managers.prefs.models.AccessToken;
import divelnick.ru.vank.di.DaggerService;
import divelnick.ru.vank.ui.intro.IntroActivity;
import divelnick.ru.vank.ui.main.MainActivity;

public class SplashActivity extends BaseActivity implements SplashView {

    @Inject
    SplashPresenter mSplashPresenter;

    @BindView(R.id.login_btn)
    Button mLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        createDaggerComponent();

        ButterKnife.bind(this);

        mSplashPresenter.takeView(this);
        mSplashPresenter.initView();

    }

    @Override
    public void showIntro() {
        Intent intent = new Intent(SplashActivity.this, IntroActivity.class);
        startActivity(intent);
    }

    @Override
    public void authorize() {
        VKSdk.login(this, "friends,photos,audio,video,pages,status,groups");
    }

    @Override
    public void showLoginBtn() {
        mLoginButton.setVisibility(View.VISIBLE);
        mLoginButton.setOnClickListener((v) -> mSplashPresenter.loginBtnClick());
    }

    @Override
    public void closeSplash(int delay) {
        new Handler().postDelayed(() -> {
            startActivity(new Intent(SplashActivity.this, MainActivity.class));
        }, delay);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (!VKSdk.onActivityResult(requestCode, resultCode, data, new VKCallback<VKAccessToken>() {
            @Override
            public void onResult(VKAccessToken res) {
                // Пользователь успешно авторизовался
                mSplashPresenter.saveAccessToken(new AccessToken(res.secret, res.userId, res.email, res.accessToken));
            }

            @Override
            public void onError(VKError error) {
                // Произошла ошибка авторизации (например, пользователь запретил авторизацию)
                finish();
                //TODO Придумать блять уже что-то
            }
        })) {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }


    //region----------------------------------DI------------------------------------------

    @dagger.Module
    public class Module {
        @SplashScope
        @Provides
        SplashPresenter providePresenter() {
            return new SplashPresenter();
        }
    }

    @SplashScope
    @dagger.Component(modules = Module.class)
    public interface Component {
        void inject(SplashActivity activity);
    }

    private void createDaggerComponent() {

        Component component = DaggerService.getComponent(Component.class);
        if (component == null) {
            component = DaggerSplashActivity_Component.builder()
                    .module(new Module())
                    .build();

            DaggerService.registerComponent(Component.class, component);
        }

        component.inject(this);
    }

    @Override
    protected void onDestroy() {
        if (isFinishing()) {
            mSplashPresenter.dropView();
            DaggerService.unregisterScope(SplashScope.class);
        }
        super.onDestroy();
    }
}
