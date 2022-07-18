package ru.samsung.goal;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ListActivity extends AppCompatActivity implements View.OnClickListener, BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView bottomNavigationView;
    BottomNavigationItemView item1,item2,item3,item4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        bottomNavigationView=findViewById(R.id.bottom_navigation);
        item1=findViewById(R.id.item_1);
        item2=findViewById(R.id.item_2);
        item3=findViewById(R.id.item_3);
        item4=findViewById(R.id.item_4);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        item1.setChecked(true);
        item2.setChecked(false);
        item3.setChecked(false);
        item4.setChecked(false);

    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_2:

                break;
            case R.id.item_3:
                Intent intent = new Intent(this, GoalActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.item_4:

                break;
        }
        return false;
    }
}
