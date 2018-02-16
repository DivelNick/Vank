package divelnick.ru.vank.data;


import divelnick.ru.vank.data.managers.models.AccessToken;

public interface Repository {

    boolean isIntroShown();

    void setIntroShown(boolean isShown);

    boolean isAuthorized();

    void setAuthorized(boolean isAuthorized);

    void setAccessToken(AccessToken accessToken);
}
