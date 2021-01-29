package com.seoul.share.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.seoul.share.R;

public class Menu2Adapter extends RecyclerView.Adapter<Menu2Adapter.ViewHolder> {

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.item_menu2_video_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        /**TODO: 리스트의 사이즈로 변경 해주세용 */
        return 5;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        /**
         * TODO: 여기도우 설정~
         */

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

        }
    }
}
