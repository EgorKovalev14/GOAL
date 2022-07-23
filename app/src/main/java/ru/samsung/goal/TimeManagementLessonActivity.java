package ru.samsung.goal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TimeManagementLessonActivity extends AppCompatActivity implements View.OnClickListener {
    View view;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_management_lesson);
        view=findViewById(R.id.what_is_time_management_background);
        imageView=findViewById(R.id.what_is_time_management_image);
        view.setOnClickListener(this);
        imageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.what_is_time_management_image:
                Intent intent = new Intent(this, TimeManagementIsEffectiveActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
                break;
            case R.id.what_is_time_management_background:
                Intent intent1 = new Intent(this, TimeManagementIsEffectiveActivity.class);
                startActivity(intent1);
                overridePendingTransition(0,0);
                break;
        }
    }
}