package divelnick.ru.vank.ui.splash;


import divelnick.ru.vank.base.BaseModel;
import divelnick.ru.vank.data.managers.prefs.models.AccessToken;

class SplashModel extends BaseModel {

    boolean isIntroShown() {
        return mRepository.isIntroShown();
    }

    boolean isAuthorized(){
        return mRepository.isAuthorized();
    }

    void setAccessToken(AccessToken accessToken){
        mRepository.setAccessToken(accessToken);
    }

    void setAuthorized(boolean isAuthorized){
        mRepository.setAuthorized(isAuthorized);
    }
}
