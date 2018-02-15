package divelnick.ru.vank.ui.splash;

import android.os.Bundle;

import javax.inject.Inject;

import dagger.Provides;
import divelnick.ru.vank.R;
import divelnick.ru.vank.base.BaseActivity;
import divelnick.ru.vank.di.DaggerService;

public class SplashActivity extends BaseActivity implements SplashView {

    @Inject
    SplashPresenter mSplashPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        createDaggerComponent();

        mSplashPresenter.takeView(this);
        mSplashPresenter.initView();

    }

    @Override
    public void showIntro() {

    }

    //region----------------------------------DI------------------------------------------

    @dagger.Module
    public class Module{
        @SplashScope
        @Provides
        SplashPresenter providePresenter(){
            return new SplashPresenter();
        }
    }

    @SplashScope
    @dagger.Component(modules = Module.class)
    public interface Component{
        void inject(SplashActivity activity);
    }

    private void createDaggerComponent(){

        Component component = DaggerService.getComponent(Component.class);
        if(component == null){
            component = DaggerSplashActivity_Component.builder()
                    .module(new Module())
                    .build();

            DaggerService.registerComponent(Component.class, component);
        }

        component.inject(this);
    }

    @Override
    protected void onDestroy() {
        if(isFinishing()) {
            mSplashPresenter.dropView();
            DaggerService.unregisterScope(SplashScope.class);
        }
        super.onDestroy();
    }
}
