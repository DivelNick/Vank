package divelnick.ru.vank.di.components;

import javax.inject.Singleton;

import dagger.Component;
import divelnick.ru.vank.data.CommonRepository;
import divelnick.ru.vank.di.modules.LocalModule;
import divelnick.ru.vank.di.modules.NetworkModule;

@Singleton
@Component(dependencies = AppComponent.class, modules = {NetworkModule.class, LocalModule.class})
public interface RepositoryComponent {
    void inject(CommonRepository commonRepository);
}
