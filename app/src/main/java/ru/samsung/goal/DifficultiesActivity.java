package ru.samsung.goal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DifficultiesActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1, b2, b;
    Boolean bDif1, bDif2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulties);
        b1=findViewById(R.id.buttonDifficulties1);
        b2=findViewById(R.id.buttonDifficulties2);
        b=findViewById(R.id.buttonDifficulties);
        bDif1=false;
        bDif2=false;
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.buttonDifficulties1:
                if(bDif1==false){
                    bDif1=true;
                    bDif2=false;
                    b1.setBackgroundResource(R.drawable.chosen_button);
                    b1.setTextColor(getResources().getColor(R.color.background));
                    b2.setBackgroundResource(R.drawable.unchosen_button);
                    b2.setTextColor(getResources().getColor(R.color.unchosen_text));
                }
                break;
            case R.id.buttonDifficulties2:
                if(bDif2==false){
                    bDif2=true;
                    bDif1=false;
                    b2.setBackgroundResource(R.drawable.chosen_button);
                    b2.setTextColor(getResources().getColor(R.color.background));
                    b1.setBackgroundResource(R.drawable.unchosen_button);
                    b1.setTextColor(getResources().getColor(R.color.unchosen_text));
                }
                break;
            case R.id.buttonDifficulties:
                if(bDif1){
                    ThanksActivity.result++;
                }
                Intent intent = new Intent(this, ListenActivity.class);
                startActivity(intent);
                break;

        }

    }
}
