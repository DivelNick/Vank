package divelnick.ru.vank.data.managers.prefs;


import android.content.Context;

import com.orhanobut.hawk.Hawk;

import divelnick.ru.vank.data.managers.prefs.models.AccessToken;

public class PrefsManager {

    private final String VK_ACCESS_TOKEN_KEY = "divelnick.ru.vank.data.managers.VK_ACCESS_TOKEN_KEY";
    private final String INTRO_SHOWN_KEY = "divelnick.ru.vank.data.managers.INTRO_SHOWN_KEY";
    private final String AUTHORIZED_KEY = "divelnick.ru.vank.data.managers.AUTHORIZED_KEY";

    public PrefsManager(Context context) {
        Hawk.init(context).build();
    }

    public void setToken(AccessToken accessToken) {
        Hawk.put(VK_ACCESS_TOKEN_KEY, accessToken);
    }

    public AccessToken getToken() {
        return Hawk.get(VK_ACCESS_TOKEN_KEY);
    }

    public void clearToken() {
        Hawk.delete(VK_ACCESS_TOKEN_KEY);
    }

    public boolean isAuthorized() {
        return Hawk.get(AUTHORIZED_KEY, false);
    }

    public void setAuthorized(boolean isAuthorized) {
        Hawk.put(AUTHORIZED_KEY, isAuthorized);
    }

    public boolean isIntroShown() {
        return Hawk.get(INTRO_SHOWN_KEY, false);
    }

    public void setIntroShown(boolean isShown) {
        Hawk.put(INTRO_SHOWN_KEY, isShown);
    }
}
