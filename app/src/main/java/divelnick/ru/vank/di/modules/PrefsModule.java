package divelnick.ru.vank.di.modules;


import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import divelnick.ru.vank.data.managers.prefs.PrefsManager;

@Module
public class PrefsModule {
    @Singleton
    @Provides
    PrefsManager providePreferenceManager(Context context){
        return new PrefsManager(context);
    }
}
