package com.seoul.share.util.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.seoul.share.R;

public class RentalTownSelectAdapter extends RecyclerView.Adapter<RentalTownSelectAdapter.ViewHolder> {
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.item_rental_town_select, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
/**TODO: 백그라운드 자체를 변화시키는거라 아마 나중에 스크롤 길어지면 리싸 재활용 문제 생길겁니담 그때해결ㄱㄱ*/

    }

    @Override
    public int getItemCount() {
        /**TODO: 리스트의 사이즈로 변경 해주세용 */
        return 3;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        /**
         * TODO: 여기도우 설정~
         */

        public ViewHolder(@NonNull final View itemView) {
            super(itemView);
            final LinearLayout li_background = itemView.findViewById(R.id.li_background);
            final TextView tv_townName = itemView.findViewById(R.id.tv_townName);
            li_background.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    if(!li_background.isSelected()){
                        li_background.setSelected(true);
                        tv_townName.setTextColor(Color.parseColor("#ffffff"));
                    }else{
                        li_background.setSelected(false);
                        tv_townName.setTextColor(Color.parseColor("#9b9b9b"));
                    }
                }
            });
        }
    }
}
