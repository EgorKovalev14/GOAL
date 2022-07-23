package ru.samsung.goal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ConcentrationLessonActivity2 extends AppCompatActivity implements View.OnClickListener {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concentration_lesson2);
        imageView=findViewById(R.id.improve_memory);
        imageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.improve_memory:
                Intent intent = new Intent(this, FinishConcentrationLessonActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
                break;
        }

    }
}