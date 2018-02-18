package divelnick.ru.vank.data;


import divelnick.ru.vank.data.managers.prefs.models.AccessToken;
import io.reactivex.Observable;

public interface Repository {

    boolean isIntroShown();

    void setIntroShown(boolean isShown);

    boolean isAuthorized();

    void setAuthorized(boolean isAuthorized);

    void setAccessToken(AccessToken accessToken);

    Observable getUser(String user_ids, String fields);
}
