package divelnick.ru.vank.data.network;


import divelnick.ru.vank.data.network.response.User;
import io.reactivex.Observable;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface ApiService {

    @GET("method/users.get")
    Observable<Response<User>> usersGet(@Query("user_ids") String userIds,
                                        @Query("fields") String fields);


}
