package ru.samsung.goal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ListenActivity extends AppCompatActivity implements View.OnClickListener {
    Button button1,button2,button;
    Boolean bL1,bL2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listen);
        button1=findViewById(R.id.buttonListen1);
        button2=findViewById(R.id.buttonListen2);
        button=findViewById(R.id.buttonListen);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button.setOnClickListener(this);
        bL1=false;
        bL2=false;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.buttonListen1:
                if(bL1==false){
                    bL1=true;
                    bL2=false;
                    button1.setBackgroundResource(R.drawable.chosen_button);
                    button1.setTextColor(getResources().getColor(R.color.background));
                    button2.setBackgroundResource(R.drawable.unchosen_button);
                    button2.setTextColor(getResources().getColor(R.color.unchosen_text));
                }
                break;
            case R.id.buttonListen2:
                if(bL2==false){
                    bL2=true;
                    bL1=false;
                    button2.setBackgroundResource(R.drawable.chosen_button);
                    button2.setTextColor(getResources().getColor(R.color.background));
                    button1.setBackgroundResource(R.drawable.unchosen_button);
                    button1.setTextColor(getResources().getColor(R.color.unchosen_text));
                }
                break;
            case R.id.buttonListen:
                if(bL1){
                    ThanksActivity.result++;
                }
                Intent intent = new Intent(this, LoosingActivity.class);
                startActivity(intent);
                break;

        }
    }
}
