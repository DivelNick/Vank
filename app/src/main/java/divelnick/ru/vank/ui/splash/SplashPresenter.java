package divelnick.ru.vank.ui.splash;


import javax.inject.Inject;

import dagger.Provides;
import divelnick.ru.vank.base.BasePresenter;
import divelnick.ru.vank.di.DaggerService;

public class SplashPresenter extends BasePresenter<SplashView> {

    @Inject
    SplashModel mSplashModel;

    SplashPresenter() {
        createDaggerComponent();
    }

    @Override
    public void initView() {
        if(!mSplashModel.isIntroShown()){
            getView().showIntro();
        }
    }

    //region------------------------------------DI----------------------------------------------


    @dagger.Module
    class Module {
        @Provides
        @SplashScope
        SplashModel provideSplashModel() {
            return new SplashModel();
        }
    }

    @SplashScope

    @dagger.Component(modules = Module.class)
    interface Component {
        void inject(SplashPresenter splashPresenter);
    }


    private void createDaggerComponent() {
        Component component = DaggerService.getComponent(Component.class);
        if (component == null) {
            component = DaggerSplashPresenter_Component.builder()
                    .module(new Module())
                    .build();
        }
        component.inject(this);
    }

}
