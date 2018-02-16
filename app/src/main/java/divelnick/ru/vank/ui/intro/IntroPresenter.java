package divelnick.ru.vank.ui.intro;


import javax.inject.Inject;

import dagger.Provides;
import divelnick.ru.vank.base.BasePresenter;
import divelnick.ru.vank.di.DaggerService;

public class IntroPresenter extends BasePresenter<IntroView> {

    @Inject
    IntroModel mIntroModel;

    IntroPresenter() {
        createDaggerComponent();
    }

    @Override
    public void initView() {

    }


    //region-------------------------DI--------------------------------------------------
    @dagger.Module
    class Module {
        @Provides
        @IntroScope
        IntroModel provideIntroModel() {
            return new IntroModel();
        }
    }

    @IntroScope
    @dagger.Component(modules = Module.class)
    interface Component {
        void inject(IntroPresenter introPresenter);
    }

    private void createDaggerComponent() {
        Component component = DaggerService.getComponent(Component.class);

        if (component == null) {
            component = DaggerIntroPresenter_Component.builder()
                    .module(new Module())
                    .build();
        }

        component.inject(this);
    }

    //endregion
}
