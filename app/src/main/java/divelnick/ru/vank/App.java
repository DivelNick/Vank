package divelnick.ru.vank;


import android.app.Application;

import com.facebook.stetho.Stetho;
import com.vk.sdk.VKSdk;

import divelnick.ru.vank.di.components.AppComponent;
import divelnick.ru.vank.di.components.DaggerAppComponent;
import divelnick.ru.vank.di.modules.AppModule;

public class App extends Application {

    private static AppComponent sAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        if(BuildConfig.DEBUG){
            Stetho.initializeWithDefaults(this);
        }

        VKSdk.initialize(this);

        createDaggerAppComponent();
    }

    private void createDaggerAppComponent(){
        sAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public static AppComponent getAppComponent() {
        return sAppComponent;
    }
}
