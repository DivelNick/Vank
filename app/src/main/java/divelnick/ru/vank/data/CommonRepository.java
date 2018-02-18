package divelnick.ru.vank.data;


import javax.inject.Inject;

import divelnick.ru.vank.App;
import divelnick.ru.vank.data.managers.DbManager;
import divelnick.ru.vank.data.managers.prefs.PrefsManager;
import divelnick.ru.vank.data.managers.prefs.models.AccessToken;
import divelnick.ru.vank.data.network.ApiService;
import divelnick.ru.vank.data.network.RestTransformer;
import divelnick.ru.vank.data.network.response.User;
import divelnick.ru.vank.di.DaggerService;
import divelnick.ru.vank.di.components.DaggerRepositoryComponent;
import divelnick.ru.vank.di.components.RepositoryComponent;
import divelnick.ru.vank.di.modules.NetworkModule;
import io.reactivex.Observable;

public class CommonRepository implements Repository {

    @Inject
    PrefsManager mPrefsManager;

    @Inject
    DbManager mDbManager;

    @Inject
    ApiService mApiService;

    private final RestTransformer mRestTransformer;

    public CommonRepository() {
        //если мы не создаем модули вручную то даггер сам сгенерит создание классов
        //с конструктором по умолчанию в данном случае это NetworkModule
        //LocalModule и PrefsModule поэтому мы не создаем их самостоятельно
        RepositoryComponent repositoryComponent = DaggerService.getComponent(RepositoryComponent.class);
        if (repositoryComponent == null) {
            repositoryComponent = DaggerRepositoryComponent.builder()
                    .appComponent(App.getAppComponent())
                    .networkModule(new NetworkModule())
                    .build();

            DaggerService.registerComponent(RepositoryComponent.class, repositoryComponent);
        }

        repositoryComponent.inject(this);

        mRestTransformer = new RestTransformer<>();
    }

    @SuppressWarnings("unchecked")
    @Override
    public Observable<User> getUser(String user_ids, String fields) {
        return mApiService.usersGet(user_ids, fields)
                .compose((RestTransformer<User>) mRestTransformer);
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
        mPrefsManager.setAuthorized(isAuthorized);
    }

    @Override
    public void setAccessToken(AccessToken accessToken) {
        mPrefsManager.setToken(accessToken);
    }
}
