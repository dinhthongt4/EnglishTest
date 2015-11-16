package com.example.thongdt.englishtest.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thongdt.englishtest.R;
import com.example.thongdt.englishtest.objects.GrammarResponse;

import java.util.ArrayList;

/**
 * Created by thongdt on 02/11/2015.
 */


public class GrammarRecyclerViewAdapter extends RecyclerView.Adapter<GrammarRecyclerViewAdapter.ViewHolder> {

    private ArrayList<GrammarResponse.Grammar> mGrammars;

    public GrammarRecyclerViewAdapter(ArrayList<GrammarResponse.Grammar> grammars) {
        this.mGrammars = grammars;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_view_grammar, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tvTitle.setText(mGrammars.get(position).getName());
        holder.imgAvatar.setImageResource(Integer.parseInt(mGrammars.get(position).getAvatar()));
    }

    @Override
    public int getItemCount() {
        return mGrammars.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgAvatar;
        TextView tvTitle;

        public ViewHolder(View itemView) {
            super(itemView);

            imgAvatar = (ImageView) itemView.findViewById(R.id.imgAvatar);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
        }
    }
}
