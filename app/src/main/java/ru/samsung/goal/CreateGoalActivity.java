package ru.samsung.goal;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CreateGoalActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView imageViewPeriods;
    Integer counterPeriods;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_goal);
        imageViewPeriods = findViewById(R.id.imageViewPeriods);
        imageViewPeriods.setOnClickListener(this);
        counterPeriods=0;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.imageViewPeriods:
                counterPeriods=(counterPeriods+1)%5;
                if(counterPeriods==0){
                    imageViewPeriods.setImageResource(R.drawable.min5);
                }else if(counterPeriods==1){
                    imageViewPeriods.setImageResource(R.drawable.min10);
                }else if(counterPeriods==2){
                    imageViewPeriods.setImageResource(R.drawable.min15);
                }else if(counterPeriods==3){
                    imageViewPeriods.setImageResource(R.drawable.min30);
                }else{
                    imageViewPeriods.setImageResource(R.drawable.min60);
                }
        }

    }
}
