package com.seoul.share.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.seoul.share.R;
import com.seoul.share.databinding.ItemInquiryDetailsBinding;


public class InquiryDetailsAdapter extends RecyclerView.Adapter<InquiryDetailsAdapter.ViewHolder> {
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);

        View view = layoutInflater.inflate(R.layout.item_inquiry_details, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemInquiryDetailsBinding binding;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = ItemInquiryDetailsBinding.bind(itemView);
            binding.ivAnswerCheck.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!view.isSelected()) {
                        view.setSelected(true);
                        binding.layoutAnswer.setVisibility(View.VISIBLE);
                    } else {
                        view.setSelected(false);
                        binding.layoutAnswer.setVisibility(View.GONE);
                    }
                }
            });
        }
    }
}
