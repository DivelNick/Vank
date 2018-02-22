package divelnick.ru.vank.ui.screens.main.list;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import divelnick.ru.vank.R;
import divelnick.ru.vank.ui.widget.ItemView;

public class MainListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public static final int USER_INFO_TYPE = 0;
    public static final int INTERESTS_INFO_TYPE = 1;
    public static final int TAB_VIEW_TYPE = 2;
    public static final int WALL_TYPE = 3;

    private List<? extends Item> items;

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        switch (viewType) {
            case USER_INFO_TYPE:
                return new UserInfoHolder(inflater.inflate(R.layout.item_user_about, parent, false));
            case INTERESTS_INFO_TYPE:
                return new InterestsInfoHolder(inflater.inflate(R.layout.item_user_interests, parent, false));
            case TAB_VIEW_TYPE:
                return new TabViewHolder(inflater.inflate(R.layout.item_simple_tab, parent, false));
            case WALL_TYPE:
                return new WallViewHolder(inflater.inflate(R.layout.item_wall_card, parent, false));
        }

        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        switch (getItemViewType(position)) {
            case USER_INFO_TYPE:
                onBindUserInfo((UserInfoHolder) holder, position);
                break;
            case INTERESTS_INFO_TYPE:
                onBindInterestsInfo((InterestsInfoHolder) holder, position);
                break;
            case TAB_VIEW_TYPE:
                onBindTabView((TabViewHolder) holder, position);
                break;
            case WALL_TYPE:
                onBindWallView((WallViewHolder) holder, position);
                break;
        }

    }

    private void onBindUserInfo(UserInfoHolder holder, int position) {
        ((ItemView) holder.mView).addView("rerer", R.drawable.ic_chat_bubble_black_24px);
        ((ItemView) holder.mView).addView("rerer", R.drawable.ic_chat_bubble_black_24px);
    }

    private void onBindInterestsInfo(InterestsInfoHolder holder, int position) {

    }

    private void onBindTabView(TabViewHolder holder, int position) {

    }

    private void onBindWallView(WallViewHolder holder, int position) {

    }

    @Override
    public int getItemViewType(int position) {
        return items.get(position).getViewType();
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    class UserInfoHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.container)
        View mView;

        UserInfoHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    class InterestsInfoHolder extends RecyclerView.ViewHolder {
        public InterestsInfoHolder(View itemView) {
            super(itemView);
        }
    }

    class TabViewHolder extends RecyclerView.ViewHolder {
        public TabViewHolder(View itemView) {
            super(itemView);
        }
    }

    class WallViewHolder extends RecyclerView.ViewHolder {
        public WallViewHolder(View itemView) {
            super(itemView);
        }
    }

    public void setItems(List<? extends Item> items) {
        this.items = items;
    }
}
