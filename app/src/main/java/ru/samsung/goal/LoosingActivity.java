package ru.samsung.goal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoosingActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1,button2,button;
    Boolean bLoos1,bLoos2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loosing);
        button1=findViewById(R.id.buttonLoosing1);
        button2=findViewById(R.id.buttonLoosing2);
        button=findViewById(R.id.buttonLoosing);
        button.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        bLoos1=false;
        bLoos2=false;

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.buttonLoosing1:
                if(bLoos1==false){
                    bLoos1=true;
                    bLoos2=false;
                    button1.setBackgroundResource(R.drawable.chosen_button);
                    button1.setTextColor(getResources().getColor(R.color.background));
                    button2.setBackgroundResource(R.drawable.unchosen_button);
                    button2.setTextColor(getResources().getColor(R.color.unchosen_text));
                }
                break;
            case R.id.buttonLoosing2:
                if(bLoos2==false){
                    bLoos2=true;
                    bLoos1=false;
                    button2.setBackgroundResource(R.drawable.chosen_button);
                    button2.setTextColor(getResources().getColor(R.color.background));
                    button1.setBackgroundResource(R.drawable.unchosen_button);
                    button1.setTextColor(getResources().getColor(R.color.unchosen_text));
                }
                break;
            case R.id.buttonLoosing:
                if(bLoos1){
                    ThanksActivity.result++;
                }
                Intent intent = new Intent(this, QuiteActivity.class);
                startActivity(intent);
                break;

        }
    }
}
