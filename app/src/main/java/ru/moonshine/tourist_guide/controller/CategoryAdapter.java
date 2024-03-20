package ru.moonshine.tourist_guide.controller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ru.moonshine.tourist_guide.R;
import ru.moonshine.tourist_guide.activity.MainActivity;
import ru.moonshine.tourist_guide.model.Category;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {

    Context context;
    List<Category> types;

    public CategoryAdapter(Context context, List<Category> types) {
        this.context = context;
        this.types = types;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View categoryItems = LayoutInflater.from(context).inflate(R.layout.category_item, parent, false);
        return new CategoryViewHolder(categoryItems);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        holder.tourCategory.setText(types.get(position).getCategory());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.showTourByType(types.get(holder.getAdapterPosition()).getId());

            }
        });
    }

    @Override
    public int getItemCount() {
        return types.size();
    }

    public static final class CategoryViewHolder extends RecyclerView.ViewHolder{

        TextView tourCategory;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            tourCategory = itemView.findViewById(R.id.tour_type);
        }
    }
}
