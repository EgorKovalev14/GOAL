package ru.samsung.goal;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DiagnosActivity extends AppCompatActivity implements View.OnClickListener {
    Button button1, button2, continueDiagnoseButton;
    static Boolean b1;
    Boolean b2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnos);
        button1=findViewById(R.id.buttonDiagnose1);
        button2=findViewById(R.id.buttonDiagnose2);
        continueDiagnoseButton=findViewById(R.id.continueDiagnoseButton);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        continueDiagnoseButton.setOnClickListener(this);
        b1=false;
        b2=false;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.buttonDiagnose1:
                if(!b1){
                    b1=true;
                    b2=false;
                    button1.setBackgroundResource(R.drawable.chosen_button);
                    button1.setTextColor(getResources().getColor(R.color.background));
                    button2.setBackgroundResource(R.drawable.unchosen_button);
                    button2.setTextColor(getResources().getColor(R.color.unchosen_text));
                }
                break;
            case R.id.buttonDiagnose2:
                if(!b2){
                    b2=true;
                    b1=false;
                    button2.setBackgroundResource(R.drawable.chosen_button);
                    button2.setTextColor(getResources().getColor(R.color.background));
                    button1.setBackgroundResource(R.drawable.unchosen_button);
                    button1.setTextColor(getResources().getColor(R.color.unchosen_text));
                }
                break;
            case R.id.continueDiagnoseButton:
                if(b1||b2) {
                    Intent intent = new Intent(this, NotifyActivity.class);
                    startActivity(intent);
                }
                break;

        }

    }
}
