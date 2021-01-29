package com.seoul.share.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.seoul.share.R;
import com.seoul.share.databinding.ItemNoticeboardListBinding;
import com.seoul.share.ui.activity.mypage.NoticeBoardDetailActivity;


public class NoticeBoardListAdapter extends RecyclerView.Adapter<NoticeBoardListAdapter.ViewHolder> {
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);

        View view = layoutInflater.inflate(R.layout.item_noticeboard_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ItemNoticeboardListBinding binding;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = ItemNoticeboardListBinding.bind(itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    view.getContext().startActivity(
                            new Intent(view.getContext(), NoticeBoardDetailActivity.class)
                    );
                }
            });
        }
    }
}