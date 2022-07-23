package ru.samsung.goal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FinishConcentrationLessonActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish_concentration_lesson);
        buttonFinish=findViewById(R.id.buttonFinishConcentrationLesson);
        buttonFinish.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.buttonFinishConcentrationLesson:
                Intent intent = new Intent(this, ListActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
                break;

        }
    }
}