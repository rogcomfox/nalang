package com.nusantarian.batara.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nusantarian.batara.R;
import com.nusantarian.batara.model.MyCourse;

import java.util.ArrayList;

public class OnProgressMyCourseAdapter extends RecyclerView.Adapter<OnProgressMyCourseAdapter.CardViewViewHolder> {
    private ArrayList<MyCourse> list_myCourse;
    @NonNull
    @Override
    public OnProgressMyCourseAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_course, parent, false);
        return new OnProgressMyCourseAdapter.CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder holder, int position) {
        MyCourse myCourse = list_myCourse.get(position);

        holder.btn_course.setText("Continue");

    }

    @Override
    public int getItemCount() {
        return list_myCourse.size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle, tvLevel;
        Button btn_course;

        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);

            tvTitle = itemView.findViewById(R.id.tv_title_course_home);
            tvLevel = itemView.findViewById(R.id.tv_level_course_home);
            btn_course = itemView.findViewById(R.id.btn_course);
        }
    }
}
