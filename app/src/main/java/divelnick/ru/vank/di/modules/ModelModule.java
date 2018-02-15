package divelnick.ru.vank.di.modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import divelnick.ru.vank.data.CommonRepository;
import divelnick.ru.vank.data.Repository;

@Module
public class ModelModule {

    @Provides
    @Singleton
    Repository provideRepository(){
        return new CommonRepository();
    }
}
