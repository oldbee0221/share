package com.seoul.share.ui.adapter;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.seoul.share.R;
import com.seoul.share.ui.activity.main.Menu4OfChatActivity;

public class Menu4Adapter extends RecyclerView.Adapter<Menu4Adapter.ViewHolder> {
    @NonNull
    @Override
    public Menu4Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.item_menu4_chat, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Menu4Adapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        /**TODO: 리스트의 사이즈로 변경 해주세용 */
        return 5;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        /**
         * TODO: 여기도우 설정~
         */

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    view.getContext().startActivity(
                            new Intent(view.getContext(),
                                    Menu4OfChatActivity.class)

                    );
                }
            });
        }
    }
}
