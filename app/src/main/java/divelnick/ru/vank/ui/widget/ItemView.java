package divelnick.ru.vank.ui.widget;


import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ItemView extends LinearLayout {

    public ItemView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ItemView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void addView(String text, @DrawableRes int resId) {
        LinearLayout linearLayout = new LinearLayout(this.getContext());
        linearLayout.setOrientation(HORIZONTAL);

        ImageView imageView = new ImageView(this.getContext());
        imageView.setLayoutParams(new LinearLayoutCompat.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        imageView.setImageDrawable(ActivityCompat.getDrawable(this.getContext(), resId));

        linearLayout.addView(imageView);

        TextView textView = new TextView(this.getContext());
        textView.setLayoutParams(new LinearLayoutCompat.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        textView.setText(text);

        linearLayout.addView(textView);

        this.addView(linearLayout);
    }

}
