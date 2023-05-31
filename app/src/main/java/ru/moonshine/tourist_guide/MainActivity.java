package ru.moonshine.tourist_guide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import ru.moonshine.tourist_guide.controller.ToursController;
import ru.moonshine.tourist_guide.model.Tours;

public class MainActivity extends AppCompatActivity {

    RecyclerView tourRecycler;
    ToursController toursController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Tours> tourList = new ArrayList<>();
        tourList.add(new Tours(1, "Сокотра: недельное путешествие на дикий остров драконов", "socotra", "211463"));
        tourList.add(new Tours(2, "Мёртвое море в России. Баскунчак и Эльтон", "dead_sea", "33000"));
        tourList.add(new Tours(3, "Фитнес-тур в горах Красной Поляны", "krasnaya_polyana", "52300"));
        tourList.add(new Tours(4, "Серф тур в Марокко", "morocco", "84250"));
        tourList.add(new Tours(5, "Хелиски в Узбекистане", "heliskiing_in_uzbekistan", "70000"));
        tourList.add(new Tours(6, "Выходные в Абхазии", "weekend_in_abkhazia", "70000"));
        tourList.add(new Tours(7, "Целебные воды Кавказа", "healing_waters_of_the_caucasus", "14800"));
        tourList.add(new Tours(8, "Тайны океана", "secrets_of_the_ocean", "182000"));

        setTourRecycler(tourList);
    }

    private void setTourRecycler(List<Tours> tourList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);

        tourRecycler = findViewById(R.id.tourRecycler);
        tourRecycler.setLayoutManager(layoutManager);

        toursController = new ToursController(this, tourList);
        tourRecycler.setAdapter(toursController);
    }
}