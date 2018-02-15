package divelnick.ru.vank.data.managers;


import android.content.Context;

import com.orhanobut.hawk.Hawk;

public class PrefsManager {

    private final String VK_ACCESS_TOKEN_KEY = "divelnick.ru.vank.data.managers.VK_ACCESS_TOKEN_KEY";
    private final String INTRO_SHOWN_KEY = "divelnick.ru.vank.data.managers.INTRO_SHOWN_KEY";

    public PrefsManager(Context context) {
        Hawk.init(context).build();
    }

    void setAccessToken(String accessToken){
        Hawk.put(VK_ACCESS_TOKEN_KEY,accessToken);
    }

    String getAccessToken(){
        return Hawk.get(VK_ACCESS_TOKEN_KEY);
    }

    void clearAccessToken(){
        Hawk.delete(VK_ACCESS_TOKEN_KEY);
    }

    boolean isIntroShown(){
        return Hawk.put(INTRO_SHOWN_KEY, Boolean.class);
    }

    void setIntroShown(boolean isShown){
        Hawk.put(INTRO_SHOWN_KEY, isShown);
    }
}
