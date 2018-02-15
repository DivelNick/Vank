package divelnick.ru.vank.base;


import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class BaseActivity extends AppCompatActivity {

    private Toast toast;


    public void showMessage(String message) {
        if (toast == null) {
            toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        }
        if (!toast.getView().isShown()) {
            toast.setText(message);
            toast.show();
        }
    }
}
