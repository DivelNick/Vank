package divelnick.ru.vank.data.managers;


import android.content.Context;

import com.orhanobut.hawk.Hawk;

public class PrefsManager {

    private final String VK_ACCESS_TOKEN_KEY = "divelnick.ru.vank.data.managers.VK_ACCESS_TOKEN_KEY";

    public PrefsManager(Context context) {
        Hawk.init(context).build();
    }

    public void setAccessToken(String accessToken){
        Hawk.put(VK_ACCESS_TOKEN_KEY,accessToken);
    }

    public String getAccessToken(){
        return Hawk.get(VK_ACCESS_TOKEN_KEY);
    }

    public void clearAccessToken(){
        Hawk.delete(VK_ACCESS_TOKEN_KEY);
    }

}
