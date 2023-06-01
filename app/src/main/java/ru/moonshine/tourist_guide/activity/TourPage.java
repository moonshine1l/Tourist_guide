package ru.moonshine.tourist_guide.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import ru.moonshine.tourist_guide.R;

public class TourPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_page);



        ImageView pageImage = findViewById(R.id.imageView2);
        TextView tourTitle = findViewById(R.id.TourPageTitle);
        TextView tourPrice = findViewById(R.id.tourPagePrice);
        TextView tourDescription = findViewById(R.id.tourDescription);
        TextView firstSight = findViewById(R.id.firstSight);
        TextView firstSightDescription = findViewById(R.id.firstSightDescription);
        TextView secondSight = findViewById(R.id.secondSight);
        TextView secondSightDescription = findViewById(R.id.secondSightDescription);
        TextView thirdSight = findViewById(R.id.thirdSight);
        TextView thirdSightDescription = findViewById(R.id.thirdSightDescription);

        pageImage.setImageResource(getIntent().getIntExtra("tourImage", 0));
        tourTitle.setText(getIntent().getStringExtra("tourTitle"));
        tourPrice.setText(getIntent().getStringExtra("tourPrice"));
        tourDescription.setText(getIntent().getStringExtra("tourDescription"));
        firstSight.setText(getIntent().getStringExtra("firstSight"));
        firstSightDescription.setText(getIntent().getStringExtra("firstSightDescription"));
        secondSight.setText(getIntent().getStringExtra("secondSight"));
        secondSightDescription.setText(getIntent().getStringExtra("secondSightDescription"));
        thirdSight.setText(getIntent().getStringExtra("thirdSight"));
        thirdSightDescription.setText(getIntent().getStringExtra("thirdSightDescription"));

    }
}