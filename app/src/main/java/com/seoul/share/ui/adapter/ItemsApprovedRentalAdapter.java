package com.seoul.share.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.seoul.share.R;
import com.seoul.share.databinding.ItemItemsApprovedRentalCheckListBinding;
import com.seoul.share.databinding.ItemItemsRentalItemRentalCheckListBinding;

public class ItemsApprovedRentalAdapter extends RecyclerView.Adapter<ItemsApprovedRentalAdapter.ViewHolder> {
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);

        View view = layoutInflater.inflate(R.layout.item_items_approved_rental_check_list
                , parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ItemItemsApprovedRentalCheckListBinding binding;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = ItemItemsApprovedRentalCheckListBinding.bind(itemView);
            binding.ivSeeMore.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    if (!view.isSelected())
                        binding.layoutSeeMore.setVisibility(View.VISIBLE);
                    else
                        binding.layoutSeeMore.setVisibility(View.GONE);
                }
            });
        }
    }
}
