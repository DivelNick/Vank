package divelnick.ru.vank.di.modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import divelnick.ru.vank.data.CommonRepository;

@Module
public class ModelModule {

    @Provides
    @Singleton
    CommonRepository provideRepository(){
        return new CommonRepository();
    }
}
