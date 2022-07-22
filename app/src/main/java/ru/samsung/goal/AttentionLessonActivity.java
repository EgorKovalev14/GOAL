package ru.samsung.goal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AttentionLessonActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView imageView;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attention_lesson);
        imageView=findViewById(R.id.what_is_attention_image);
        view=findViewById(R.id.what_is_attention_background);
        imageView.setOnClickListener(this);
        view.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.what_is_attention_background:
                Intent intent = new Intent(this, AttentionIsAProcessActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
                break;
            case R.id.what_is_attention_image:
                Intent intent1 = new Intent(this, AttentionIsAProcessActivity.class);
                startActivity(intent1);
                overridePendingTransition(0,0);
                break;

        }

    }
}