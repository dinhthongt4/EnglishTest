package com.example.thongdt.englishtest.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thongdt.englishtest.R;
import com.example.thongdt.englishtest.objects.Menu;

import java.util.ArrayList;

/**
 * Created by thongdt on 30/10/2015.
 */
public class MenuRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<Menu> mMenus;
    private OnMenuClickListener mOnMenuClickListener;

    public MenuRecyclerViewAdapter(ArrayList<Menu> menus) {
        this.mMenus = menus;
    }

    @Override
    public int getItemViewType(int position) {
        return mMenus.get(position).getType();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == 0) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_view_title_menu, parent, false);
            return new TitleViewHolder(view);
        } else {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_view_menu, parent, false);
            return new MenuViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (mMenus.get(position).getType() == 0) {
            TitleViewHolder titleViewHolder = (TitleViewHolder) holder;
            titleViewHolder.tvTitle.setText(mMenus.get(position).getTitle());
        } else {
            MenuViewHolder menuViewHolder = (MenuViewHolder) holder;
            menuViewHolder.imgAvatarMenu.setImageResource(mMenus.get(position).getIdImage());
            menuViewHolder.tvMenu.setText(mMenus.get(position).getMenu());
        }
    }

    @Override
    public int getItemCount() {
        return mMenus.size();
    }

    public void setOnMenuClickListener(OnMenuClickListener onMenuClickListener) {
        mOnMenuClickListener = onMenuClickListener;
    }

    private class MenuViewHolder extends RecyclerView.ViewHolder {
        ImageView imgAvatarMenu;
        TextView tvMenu;

        public MenuViewHolder(View itemView) {
            super(itemView);

            imgAvatarMenu = (ImageView) itemView.findViewById(R.id.imgAvatarMenu);
            tvMenu = (TextView) itemView.findViewById(R.id.tvMenu);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mOnMenuClickListener != null) {
                        mOnMenuClickListener.onClick(mMenus.get(getLayoutPosition()).getMenu());
                    }
                 }
            });
        }
    }

    private class TitleViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle;

        public TitleViewHolder(View itemView) {
            super(itemView);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitleMenu);
        }
    }

    public interface OnMenuClickListener {
        void onClick(String menu);
    }
}
