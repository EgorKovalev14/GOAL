package ru.samsung.goal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ConcentrationLessonActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concentration_lesson);
        imageView = findViewById(R.id.how_to_improve_concentration_image);
        imageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.how_to_improve_concentration_image:
                Intent intent = new Intent(this, ConcentrationLessonActivity1.class);
                startActivity(intent);
                overridePendingTransition(0,0);
                break;

        }
    }
}