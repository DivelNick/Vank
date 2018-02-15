package divelnick.ru.vank.di.modules;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import divelnick.ru.vank.data.managers.DbManager;

@Module
public class DbModule {

    @Singleton
    @Provides
    DbManager provideDatabaseManager(Context context){
        return new DbManager(context);
    }

}
