package ru.moonshine.tourist_guide.activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

import com.android.car.ui.toolbar.MenuItem;

import java.util.List;

import ru.moonshine.tourist_guide.R;
import ru.moonshine.tourist_guide.controller.ToursController;
import ru.moonshine.tourist_guide.model.Tours;

public class TourPage extends AppCompatActivity {

    List<Tours> tc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        ;


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

//        firstSight.setText(Html.fromHtml(tc.));
//        secondSight.setText(Html.fromHtml(tc.get()));
//        thirdSight.setText(Html.fromHtml(tc.get()));
//

        firstSight.setMovementMethod(LinkMovementMethod.getInstance());
        secondSight.setMovementMethod(LinkMovementMethod.getInstance());
        thirdSight.setMovementMethod(LinkMovementMethod.getInstance());



        pageImage.setImageResource(getIntent().getIntExtra("tourImage", 0));
        tourTitle.setText(getIntent().getStringExtra("tourTitle"));
        tourPrice.setText(getIntent().getStringExtra("tourPrice"));
        tourDescription.setText(getIntent().getStringExtra("tourDescription"));
        firstSight.setText(Html.fromHtml(getIntent().getStringExtra("firstSight")));
        firstSightDescription.setText(getIntent().getStringExtra("firstSightDescription"));
        secondSight.setText(Html.fromHtml(getIntent().getStringExtra("secondSight")));
        secondSightDescription.setText(getIntent().getStringExtra("secondSightDescription"));
        thirdSight.setText(Html.fromHtml(getIntent().getStringExtra("thirdSight")));
        thirdSightDescription.setText(getIntent().getStringExtra("thirdSightDescription"));


    }

}