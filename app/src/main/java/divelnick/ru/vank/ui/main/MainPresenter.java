package divelnick.ru.vank.ui.main;


import javax.inject.Inject;

import dagger.Provides;
import divelnick.ru.vank.base.BasePresenter;
import divelnick.ru.vank.di.DaggerService;

class MainPresenter extends BasePresenter<MainView> {

    @Inject
    MainModel mMainModel;

    MainPresenter() {
        createDaggerComponent();
    }

    @Override
    public void initView() {

    }


    //region-------------------------------------DI--------------------------------------------
    @dagger.Module
    class Module {
        @MainScope
        @Provides
        MainModel provideMainPresenter(){
            return new MainModel();
        }
    }

    @dagger.Component(modules = Module.class)
    @MainScope
    interface Component{
        void inject(MainPresenter mainActivity);
    }

    private void createDaggerComponent(){
        Component component = DaggerService.getComponent(Component.class);

        if(component == null){
            component = DaggerMainPresenter_Component.builder()
                    .module(new Module())
                    .build();
        }

        component.inject(this);
        DaggerService.registerComponent(Component.class, component);
    }


}
