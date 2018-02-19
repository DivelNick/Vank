package divelnick.ru.vank.ui.main;


import android.os.Bundle;
import android.support.annotation.Nullable;

import javax.inject.Inject;

import dagger.Provides;
import divelnick.ru.vank.R;
import divelnick.ru.vank.base.BaseActivity;
import divelnick.ru.vank.di.DaggerService;

public class MainActivity extends BaseActivity implements MainView {

    @Inject
    MainPresenter mMainPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createDaggerComponent();

        mMainPresenter.takeView(this);
        mMainPresenter.initView();
    }





    //region---------------------------------DI--------------------------------------------

    @dagger.Module
    class Module {
        @MainScope
        @Provides
        MainPresenter provideMainPresenter(){
            return new MainPresenter();
        }
    }

    @dagger.Component(modules = Module.class)
    @MainScope
    interface Component{
        void inject(MainActivity mainActivity);
    }

    private void createDaggerComponent(){
        Component component = DaggerService.getComponent(Component.class);

        if(component == null){
            component = DaggerMainActivity_Component.builder()
                    .module(new Module())
                    .build();
        }

        component.inject(this);
        DaggerService.registerComponent(Component.class, component);
    }


}
