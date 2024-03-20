package ru.moonshine.tourist_guide.controller;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import ru.moonshine.tourist_guide.R;
import ru.moonshine.tourist_guide.activity.TourPage;
import ru.moonshine.tourist_guide.model.Tours;

public class ToursController extends RecyclerView.Adapter<ToursController.ToursView> {

    Context context;
    List<Tours> tours;


    public ToursController(Context context, List<Tours> tours) {
        this.context = context;
        this.tours = tours;

    }


    @NonNull
    @Override
    public ToursView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View tourItems = LayoutInflater.from(context).inflate(R.layout.recycler_view_item, parent, false);
        return new ToursController.ToursView(tourItems);
    }

    @Override
    public void onBindViewHolder(@NonNull ToursView holder, int position) {
        int imageId = context.getResources().getIdentifier(tours.get(position).getImage(), "drawable", context.getPackageName());

        holder.tourImage.setImageResource(imageId);
        holder.tourTitle.setText(tours.get(position).getTitle());
        holder.tourPrice.setText(tours.get(position).getPrice());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, TourPage.class);

                intent.putExtra("tourImage", imageId);
                intent.putExtra("tourTitle", tours.get(holder.getAdapterPosition()).getTitle());
                intent.putExtra("tourPrice", tours.get(holder.getAdapterPosition()).getPrice());
                intent.putExtra("tourDescription", tours.get(holder.getAdapterPosition()).getTourDescription());
                intent.putExtra("firstSight", tours.get(holder.getAdapterPosition()).getFirstSight());
                intent.putExtra("firstSightDescription", tours.get(holder.getAdapterPosition()).getFirstSightDescription());
                intent.putExtra("secondSight", tours.get(holder.getAdapterPosition()).getSecondSight());
                intent.putExtra("secondSightDescription", tours.get(holder.getAdapterPosition()).getSecondSightDescription());
                intent.putExtra("thirdSight", tours.get(holder.getAdapterPosition()).getThirdSight());
                intent.putExtra("thirdSightDescription", tours.get(holder.getAdapterPosition()).getThirdSightDescription());


                context.startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return tours.size();
    }

    public static final class ToursView extends RecyclerView.ViewHolder {

        ImageView tourImage;
        TextView tourTitle;
        TextView tourPrice;


        public ToursView(@NonNull View itemView) {
            super(itemView);

            tourImage = itemView.findViewById(R.id.ImageView);
            tourTitle = itemView.findViewById(R.id.TourTitle);
            tourPrice = itemView.findViewById(R.id.tourPrice);

        }
    }
}







