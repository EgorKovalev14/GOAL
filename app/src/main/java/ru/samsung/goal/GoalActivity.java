package ru.samsung.goal;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class GoalActivity extends AppCompatActivity implements View.OnClickListener, BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView bottomNavigationView;
    BottomNavigationItemView item1,item2,item3,item4;
    ImageView addGoalImageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal);
        bottomNavigationView=findViewById(R.id.bottom_navigation);
        item1=findViewById(R.id.item_1);
        item2=findViewById(R.id.item_2);
        item3=findViewById(R.id.item_3);
        item4=findViewById(R.id.item_4);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        item1.setChecked(false);
        item2.setChecked(false);
        item3.setChecked(true);
        item4.setChecked(false);
        addGoalImageView=findViewById(R.id.addGoalImageView);
        addGoalImageView.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.addGoalImageView:
                Intent intent = new Intent(this, CreateGoalActivity.class);
                startActivity(intent);
                break;
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_1:
                Intent intent = new Intent(this, ListActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.item_2:

                break;
            case R.id.item_4:

                break;
        }
        return false;
    }

}
