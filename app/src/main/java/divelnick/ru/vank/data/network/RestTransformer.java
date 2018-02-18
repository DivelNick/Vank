package divelnick.ru.vank.data.network;

import android.support.annotation.VisibleForTesting;

import divelnick.ru.vank.data.network.error.ErrorUtils;
import divelnick.ru.vank.data.network.error.NetworkAvailableError;
import divelnick.ru.vank.utils.NetworkStatusChecker;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.annotations.NonNull;
import retrofit2.Response;

import static android.support.annotation.VisibleForTesting.NONE;


/**
 * Класс для обработки типичных ситуаций при запросе в сеть (применяется в каждом запросе)
 * возвращает response либо ошибку
 */
public class RestTransformer<R> implements ObservableTransformer<Response<R>, R> {
	private boolean mTestMode;

	@Override
	public ObservableSource<R> apply(@NonNull Observable<Response<R>> responseObservable) {
		Observable<Boolean> networkStatus;
		if (mTestMode) {
			networkStatus = Observable.just(true);
		} else {
			networkStatus = NetworkStatusChecker.isInternetAvailable();
		}
		return networkStatus
				.flatMap(aBoolean -> aBoolean ? responseObservable : Observable.error(new NetworkAvailableError())) // кидаем ошибку если инернет недоступен
				// если убрать предыдущую строку то приложение будет работать без интернета с введенными ранее запросами, т.к. включено кэширование
				.flatMap(rResponse -> {
					switch (rResponse.code()) {
						case 200:
							return Observable.just(rResponse.body());
						case 304:
							return Observable.empty();
						default:
							return Observable.error(ErrorUtils.parseError(rResponse));
					}
				});
	}


	@VisibleForTesting(otherwise = NONE)
	public void setTestMode() {
		mTestMode = true;
	}
}