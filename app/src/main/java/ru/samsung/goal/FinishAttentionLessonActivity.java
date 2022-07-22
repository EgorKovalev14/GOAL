package ru.samsung.goal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FinishAttentionLessonActivity extends AppCompatActivity implements View.OnClickListener {
    Button finish_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish_attention_lesson);
        finish_button=findViewById(R.id.buttonFinishAttentionLesson);
        finish_button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttonFinishAttentionLesson:
                Intent intent = new Intent(this,ListActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
                break;
        }

    }
}