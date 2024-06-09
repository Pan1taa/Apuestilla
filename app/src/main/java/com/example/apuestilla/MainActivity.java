package com.example.apuestilla;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import me.ibrahimsn.lib.SmoothBottomBar;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewHorizontal, recyclerViewLiveMatches, recyclerViewUefaMatches;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewHorizontal = findViewById(R.id.recyclerViewHorizontal);
        recyclerViewLiveMatches = findViewById(R.id.recyclerViewLiveMatches);
        recyclerViewUefaMatches = findViewById(R.id.recyclerViewUefaMatches);

        // Setup horizontal RecyclerView for sports categories
        recyclerViewHorizontal.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        List<SportCategory> sportCategories = getSportCategories();
        SportCategoryAdapter sportCategoryAdapter = new SportCategoryAdapter(sportCategories);
        recyclerViewHorizontal.setAdapter(sportCategoryAdapter);

        // Setup horizontal RecyclerView for live matches
        recyclerViewLiveMatches.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        List<Match> liveMatches = getMatches();
        MatchAdapter liveMatchAdapter = new MatchAdapter(liveMatches);
        recyclerViewLiveMatches.setAdapter(liveMatchAdapter);

        // Setup horizontal RecyclerView for UEFA matches
        recyclerViewUefaMatches.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        List<Match> uefaMatches = getMatches();
        MatchAdapter uefaMatchAdapter = new MatchAdapter(uefaMatches);
        recyclerViewUefaMatches.setAdapter(uefaMatchAdapter);

        // SmoothBottomBar setup
        SmoothBottomBar bottomBar = findViewById(R.id.bottomBar);
        bottomBar.setOnItemSelectedListener(new SmoothBottomBar.OnItemSelectedListener() {
            @Override
            public boolean onItemSelect(int position) {
                switch (position) {
                    case 0:
                        // Home selected
                        // Current activity, no action needed
                        return true;
                    case 1:
                        // Navigate to DetallesMatchActivity
                        startActivity(new Intent(MainActivity.this, DetallesMatchActivity.class));
                        return true;
                }
                return false;
            }
        });
    }
    private List<SportCategory> getSportCategories() {
        List<SportCategory> categories = new ArrayList<>();
        categories.add(new SportCategory("Football", R.drawable.futbo));
        categories.add(new SportCategory("Tennis", R.drawable.tennis));
        categories.add(new SportCategory("Basketball", R.drawable.basket));
        categories.add(new SportCategory("Boxing", R.drawable.boxing));
        categories.add(new SportCategory("Volleyball", R.drawable.volleyball));
        return categories;
    }

    private List<Match> getMatches() {
        List<Match> matches = new ArrayList<>();
        matches.add(new Match(R.drawable.tottenham, "Tottenham", R.drawable.psg, "PSG", "1 : 1", "21'", "2.1", "1.9", "3.0"));
        matches.add(new Match(R.drawable.chelsea, "Chelsea", R.drawable.city, "City", "0 : 2", "45'", "3.5", "3.0", "1.5"));
        matches.add(new Match(R.drawable.madridd, "Real Madrid", R.drawable.barca, "Barça", "3 : 1", "90'", "2.0", "2.5", "2.8"));
        return matches;
    }
}