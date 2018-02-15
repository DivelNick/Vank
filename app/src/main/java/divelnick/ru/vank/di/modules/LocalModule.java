package divelnick.ru.vank.di.modules;

import dagger.Module;

@Module(includes = {
        PrefsModule.class,
        DbModule.class
})
public class LocalModule {
}
