package com.example.apuestilla;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class SportCategoryAdapter extends RecyclerView.Adapter<SportCategoryAdapter.ViewHolder> {

    private List<SportCategory> sportCategories;

    public SportCategoryAdapter(List<SportCategory> sportCategories) {
        this.sportCategories = sportCategories;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sport_category, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SportCategory category = sportCategories.get(position);
        holder.imageView.setImageResource(category.getImageResource());
        holder.textView.setText(category.getName());
    }

    @Override
    public int getItemCount() {
        return sportCategories.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}