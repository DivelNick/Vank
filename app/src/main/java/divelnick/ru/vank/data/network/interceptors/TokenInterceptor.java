package divelnick.ru.vank.data.network.interceptors;


import android.support.annotation.NonNull;
import android.util.Log;

import java.io.IOException;

import divelnick.ru.vank.utils.Const;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class TokenInterceptor implements Interceptor {

    private static final String TAG = TokenInterceptor.class.getSimpleName();

    private String mAccessToken;

    public TokenInterceptor(String accessToken) {
        mAccessToken = accessToken;
    }

    @Override
    public Response intercept(@NonNull Chain chain) throws IOException {

        Log.i(TAG, "access_token: " + mAccessToken);

        Request original = chain.request();
        HttpUrl originalHttpUrl = original.url();

        HttpUrl url = originalHttpUrl.newBuilder()
                .addQueryParameter("access_token", mAccessToken)
                .addQueryParameter("v", Const.API_VERSION)
                .build();

        Request.Builder requestBuilder = original.newBuilder()
                .url(url);

        Request request = requestBuilder.build();
        return chain.proceed(request);
    }
}
