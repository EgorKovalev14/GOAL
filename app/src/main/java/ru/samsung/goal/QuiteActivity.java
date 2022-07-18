package ru.samsung.goal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class QuiteActivity extends AppCompatActivity implements View.OnClickListener {
    Button button1,button2,button;
    Boolean bQ1,bQ2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quite);
        button1=findViewById(R.id.buttonQuite1);
        button2=findViewById(R.id.buttonQuite2);
        button=findViewById(R.id.buttonQuite);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button.setOnClickListener(this);
        bQ1=false;
        bQ2=false;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.buttonQuite1:
                if(bQ1==false){
                    bQ1=true;
                    bQ2=false;
                    button1.setBackgroundResource(R.drawable.chosen_button);
                    button1.setTextColor(getResources().getColor(R.color.background));
                    button2.setBackgroundResource(R.drawable.unchosen_button);
                    button2.setTextColor(getResources().getColor(R.color.unchosen_text));
                }
                break;
            case R.id.buttonQuite2:
                if(bQ2==false){
                    bQ2=true;
                    bQ1=false;
                    button2.setBackgroundResource(R.drawable.chosen_button);
                    button2.setTextColor(getResources().getColor(R.color.background));
                    button1.setBackgroundResource(R.drawable.unchosen_button);
                    button1.setTextColor(getResources().getColor(R.color.unchosen_text));
                }
                break;
            case R.id.buttonQuite:
                if(bQ2){
                    ThanksActivity.result++;
                }
                if(bQ1||bQ2) {
                    Intent intent = new Intent(this, KeepAttentionActivity.class);
                    startActivity(intent);
                }
                break;

        }

    }
}
