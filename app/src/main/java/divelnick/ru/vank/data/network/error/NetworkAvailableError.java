package divelnick.ru.vank.data.network.error;

/**
 * Ошибка возникает если интернет выключен или недопуспен
 */
public class NetworkAvailableError extends Throwable {
	public NetworkAvailableError() {
		super("Интернет недоступен попробуйте позже");
	}
}