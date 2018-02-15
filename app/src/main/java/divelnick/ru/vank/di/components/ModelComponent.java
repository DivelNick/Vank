package divelnick.ru.vank.di.components;

import javax.inject.Singleton;

import dagger.Component;
import divelnick.ru.vank.base.BaseModel;
import divelnick.ru.vank.di.modules.ModelModule;

@Singleton
@Component(dependencies = AppComponent.class, modules = ModelModule.class)
public interface ModelComponent {
    void inject(BaseModel baseModel);
}
