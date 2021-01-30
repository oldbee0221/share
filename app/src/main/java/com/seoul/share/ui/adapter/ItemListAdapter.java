package com.seoul.share.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.seoul.share.R;
import com.seoul.share.databinding.ItemItemlistBinding;
import com.seoul.share.ui.activity.rental.RentalItemDetailActivity;

public class ItemListAdapter extends RecyclerView.Adapter<ItemListAdapter.ViewHolder> {
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);

        View view = layoutInflater.inflate(R.layout.item_itemlist, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ItemItemlistBinding binding;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = ItemItemlistBinding.bind(itemView);
            binding.getRoot().setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    view.getContext().startActivity(new Intent(
                            view.getContext(), RentalItemDetailActivity.class
                    ));
                }
            });

        }
    }
}
