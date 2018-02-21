package divelnick.ru.vank.ui.screens.main.list;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class MainListAdapter extends RecyclerView.Adapter<MainListAdapter.ViewHolder> {

    public static final int USER_INFO_TYPE = 0;
    public static final int INTERESTS_INFO_TYPE = 1;
    public static final int TAB_VIEW_TYPE = 2;
    public static final int WALL_TYPE = 3;

    private List<? extends Item> items;

    public MainListAdapter(List<? extends Item> items) {
        this.items = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemViewType(int position) {
        return items.get(position).getViewType();
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }

}
