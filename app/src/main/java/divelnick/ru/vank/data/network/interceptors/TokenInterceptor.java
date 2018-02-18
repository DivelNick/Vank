package divelnick.ru.vank.data.network.interceptors;


import java.io.IOException;

import divelnick.ru.vank.utils.Const;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class TokenInterceptor implements Interceptor {

    private String mAccessToken;

    public TokenInterceptor(String accessToken) {
        mAccessToken = accessToken;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {

        Request request = chain.request();

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
