package divelnick.ru.vank.base;


import javax.inject.Inject;

import divelnick.ru.vank.App;
import divelnick.ru.vank.data.CommonRepository;
import divelnick.ru.vank.di.DaggerService;
import divelnick.ru.vank.di.components.DaggerModelComponent;
import divelnick.ru.vank.di.components.ModelComponent;
import divelnick.ru.vank.di.modules.ModelModule;

public class BaseModel {

    @Inject
    public CommonRepository mRepository;

    public BaseModel() {
        ModelComponent modelComponent = DaggerService.getComponent(ModelComponent.class);
        if (modelComponent == null) {
            modelComponent = DaggerModelComponent.builder()
                    .appComponent(App.getAppComponent())
                    .modelModule(new ModelModule())
                    .build();
            DaggerService.registerComponent(ModelComponent.class, modelComponent);
        }
        modelComponent.inject(this);
    }
}
