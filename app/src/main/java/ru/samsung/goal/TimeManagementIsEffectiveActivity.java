package ru.samsung.goal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TimeManagementIsEffectiveActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView imageView;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_management_is_effective);
        imageView=findViewById(R.id.time_management_is_effective_image);
        imageView.setOnClickListener(this);
        view=findViewById(R.id.time_management_is_effective_background);
        view.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.time_management_is_effective_image:
                Intent intent = new Intent(this, TimaManagementMainGoalActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
                break;
            case R.id.time_management_is_effective_background:
                Intent intent1 = new Intent(this, TimaManagementMainGoalActivity.class);
                startActivity(intent1);
                overridePendingTransition(0,0);
                break;


        }

    }
}