package divelnick.ru.vank.ui.intro;


import android.os.Bundle;
import android.support.annotation.Nullable;

import javax.inject.Inject;

import dagger.Provides;
import divelnick.ru.vank.R;
import divelnick.ru.vank.base.BaseActivity;
import divelnick.ru.vank.di.DaggerService;

public class IntroActivity extends BaseActivity {

    @Inject
    IntroPresenter mIntroPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        createDaggerComponent();
    }


    //region--------------------------------DI-------------------------------------


    @dagger.Module
    class Module {

        @IntroScope
        @Provides
        IntroPresenter provideIntroPresenter() {
            return new IntroPresenter();
        }
    }

    @dagger.Component(modules = Module.class)
    @IntroScope
    interface Component {
        void inject(IntroActivity introActivity);
    }

    private void createDaggerComponent() {

        Component component = DaggerService.getComponent(Component.class);
        if (component == null) {

            component = DaggerIntroActivity_Component.builder()
                    .module(new Module())
                    .build();

            DaggerService.registerComponent(Component.class, component);
        }

        component.inject(this);


    }

}
