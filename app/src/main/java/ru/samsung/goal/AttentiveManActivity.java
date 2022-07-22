package ru.samsung.goal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AttentiveManActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView imageView;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attentive_man);
        imageView=findViewById(R.id.attentive_man_image);
        view=findViewById(R.id.attentive_man_background);
        imageView.setOnClickListener(this);
        view.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.attentive_man_image:
                Intent intent = new Intent(this, FinishAttentionLessonActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
                break;
            case R.id.attentive_man_background:
                Intent intent1 = new Intent(this, FinishAttentionLessonActivity.class);
                startActivity(intent1);
                overridePendingTransition(0,0);
                break;
        }

    }
}