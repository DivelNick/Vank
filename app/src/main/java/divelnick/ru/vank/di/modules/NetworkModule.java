package divelnick.ru.vank.di.modules;


import android.content.Context;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import divelnick.ru.vank.data.managers.prefs.PrefsManager;
import divelnick.ru.vank.data.network.ApiService;
import divelnick.ru.vank.data.network.interceptors.TokenInterceptor;
import divelnick.ru.vank.utils.Const;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class NetworkModule {
    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient(Context context, PrefsManager prefsManager) {
        return createClient(context, prefsManager);
    }

    @Provides
    @Singleton
    Retrofit provideRetrofit(OkHttpClient okHttpClient) {
        return createRetrofit(okHttpClient);
    }

    @Provides
    @Singleton
    ApiService provideApiService(Retrofit retrofit) {
        return retrofit.create(ApiService.class);
    }

    private OkHttpClient createClient(Context context, PrefsManager prefsManager) {

        OkHttpClient.Builder builder = new OkHttpClient.Builder()
                .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .connectTimeout(5000, TimeUnit.MILLISECONDS);


        if (prefsManager.isAuthorized()) {
            TokenInterceptor tokenInterceptor = new TokenInterceptor(prefsManager.getToken().getAccessToken());
            builder.addInterceptor(tokenInterceptor);
        }

        return builder.build();
    }

    private Retrofit createRetrofit(OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .baseUrl(Const.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient)
                .build();
    }
}
