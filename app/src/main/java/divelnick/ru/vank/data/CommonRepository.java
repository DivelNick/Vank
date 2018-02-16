package divelnick.ru.vank.data;


import javax.inject.Inject;

import divelnick.ru.vank.App;
import divelnick.ru.vank.data.managers.DbManager;
import divelnick.ru.vank.data.managers.PrefsManager;
import divelnick.ru.vank.data.managers.models.AccessToken;
import divelnick.ru.vank.data.network.ApiService;
import divelnick.ru.vank.di.DaggerService;
import divelnick.ru.vank.di.components.DaggerRepositoryComponent;
import divelnick.ru.vank.di.components.RepositoryComponent;
import divelnick.ru.vank.di.modules.NetworkModule;

public class CommonRepository implements Repository{

    @Inject
    PrefsManager mPrefsManager;

    @Inject
    DbManager mDbManager;

    @Inject
    ApiService mApiService;


    public CommonRepository(){
        //если мы не создаем модули вручную то даггер сам сгенерит создание классов
        //с конструктором по умолчанию в данном случае это NetworkModule
        //LocalModule и PrefsModule поэтому мы не создаем их самостоятельно
        RepositoryComponent repositoryComponent = DaggerService.getComponent(RepositoryComponent.class);
        if(repositoryComponent == null){
            repositoryComponent = DaggerRepositoryComponent.builder()
                    .appComponent(App.getAppComponent())
                    .networkModule(new NetworkModule())
                    .build();

            DaggerService.registerComponent(RepositoryComponent.class, repositoryComponent);
        }

        repositoryComponent.inject(this);


    }

    @Override
    public boolean isIntroShown() {
        return mPrefsManager.isIntroShown();
    }

    @Override
    public void setIntroShown(boolean isShown) {
        mPrefsManager.setIntroShown(isShown);
    }

    @Override
    public boolean isAuthorized() {
        return mPrefsManager.isAuthorized();
    }

    @Override
    public void setAuthorized(boolean isAuthorized) {
        mPrefsManager.setAuthotrized(isAuthorized);
    }

    @Override
    public void setAccessToken(AccessToken accessToken) {
        mPrefsManager.setAccessToken(accessToken);
    }
}
