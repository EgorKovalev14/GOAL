package ru.samsung.goal;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ListActivity extends AppCompatActivity implements View.OnClickListener, BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView bottomNavigationView;
    BottomNavigationItemView item1,item2,item3,item4;
    ImageView attentionLesson4, time_management_lesson_image, reaction_lesson_image;

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

        attentionLesson4=findViewById(R.id.imageView4);
        attentionLesson4.setOnClickListener(this);
        time_management_lesson_image=findViewById(R.id.time_management_lesson_image);
        time_management_lesson_image.setOnClickListener(this);
        reaction_lesson_image=findViewById(R.id.reaction_lesson_image);
        reaction_lesson_image.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageView4:
                Intent intent = new Intent(this, AttentionLessonActivity.class);
                startActivity(intent);
                break;
            case R.id.time_management_lesson_image:
                Intent intent1 = new Intent(this, TimeManagementLessonActivity.class);
                startActivity(intent1);
                break;
            case R.id.reaction_lesson_image:
                Intent intent2 = new Intent(this, ConcentrationLessonActivity.class);
                startActivity(intent2);
                break;
        }

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
