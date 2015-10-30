package com.example.thongdt.englishtest.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thongdt.englishtest.R;

/**
 * Created by thongdt on 30/10/2015.
 */
public class MenuRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
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
        void onClick();
    }
}
