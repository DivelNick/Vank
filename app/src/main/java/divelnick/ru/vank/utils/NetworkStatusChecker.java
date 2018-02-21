package divelnick.ru.vank.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import divelnick.ru.vank.App;
import io.reactivex.Observable;

/**
 * Проверяет доступен ли сейчас интернет
 */
public class NetworkStatusChecker {

	private static Boolean isNetworkAvailable() {
		ConnectivityManager cm = (ConnectivityManager)
				App.getAppComponent().getContext().getSystemService(Context.CONNECTIVITY_SERVICE);
		assert cm != null;
		NetworkInfo networkInfo = cm.getActiveNetworkInfo();
		return networkInfo != null && networkInfo.isConnectedOrConnecting();
	}

	public static Observable<Boolean> isInternetAvailable() {
		return Observable.just(isNetworkAvailable());
	}
}
