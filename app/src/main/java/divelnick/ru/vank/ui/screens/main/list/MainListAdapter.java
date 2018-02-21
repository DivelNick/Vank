package divelnick.ru.vank.ui.screens.main.list;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import divelnick.ru.vank.R;
import divelnick.ru.vank.ui.widget.ItemView;

public class MainListAdapter extends RecyclerView.Adapter<MainListAdapter.ViewHolder> {

    public static final int USER_INFO_TYPE = 0;
    public static final int INTERESTS_INFO_TYPE = 1;
    public static final int TAB_VIEW_TYPE = 2;
    public static final int WALL_TYPE = 3;

    private List<? extends Item> items;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case USER_INFO_TYPE:
                return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user_about, null));
        }
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ((ItemView)holder.mView).addView("rerer",R.drawable.ic_chat_bubble_black_24px);
        ((ItemView)holder.mView).addView("rerer",R.drawable.ic_chat_bubble_black_24px);
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
        View mView;
        ViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
        }
    }


    public void setItems(List<? extends Item> items) {
        this.items = items;
    }
}
