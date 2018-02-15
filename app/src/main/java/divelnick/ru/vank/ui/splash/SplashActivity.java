package divelnick.ru.vank.ui.splash;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import dagger.Provides;
import divelnick.ru.vank.R;
import divelnick.ru.vank.di.DaggerService;

public class SplashActivity extends AppCompatActivity implements SplashView {

    @Inject
    SplashPresenter mSplashPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

    }



    //region----------------------------------DI------------------------------------------

    @dagger.Module
    private class Module{
        @SplashScope
        @Provides
        SplashPresenter providePresenter(){
            return new SplashPresenter();
        }
    }

    @SplashScope
    @dagger.Component(modules = Module.class)
    private interface Component{
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
