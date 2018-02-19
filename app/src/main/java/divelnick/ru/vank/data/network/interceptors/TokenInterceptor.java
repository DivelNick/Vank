package divelnick.ru.vank.data.network.interceptors;


import android.util.Log;

import java.io.IOException;

import divelnick.ru.vank.utils.Const;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class TokenInterceptor implements Interceptor {

    public static final String TAG = TokenInterceptor.class.getSimpleName();

    private String mAccessToken;

    public TokenInterceptor(String accessToken) {
        mAccessToken = accessToken;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {

        Request request = chain.request();

        Log.i(TAG, "access_token: " + mAccessToken);

        HttpUrl url = request
                .url()
                .newBuilder()
                .addQueryParameter("access_token", mAccessToken)
                .addQueryParameter("v", Const.API_VERSION)
                .build();
        request = request.newBuilder().url(url).build();

        return chain.proceed(request);
    }
}
