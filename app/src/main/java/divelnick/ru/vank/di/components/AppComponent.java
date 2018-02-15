package divelnick.ru.vank.di.components;

import android.content.Context;

import dagger.Component;
import divelnick.ru.vank.di.modules.AppModule;

@Component(modules = AppModule.class)
public interface AppComponent {
    Context getContext();
}
