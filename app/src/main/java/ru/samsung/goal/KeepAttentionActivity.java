package ru.samsung.goal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class KeepAttentionActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1,button2,button;
    Boolean bKeep1,bKeep2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keep_attention);
        bKeep1 = false;
        bKeep2 = false;
        button1=findViewById(R.id.buttonKeep1);
        button2=findViewById(R.id.buttonKeep2);
        button=findViewById(R.id.buttonKeep);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.buttonKeep1:
                if(bKeep1==false){
                    bKeep1=true;
                    bKeep2=false;
                    button1.setBackgroundResource(R.drawable.chosen_button);
                    button1.setTextColor(getResources().getColor(R.color.background));
                    button2.setBackgroundResource(R.drawable.unchosen_button);
                    button2.setTextColor(getResources().getColor(R.color.unchosen_text));
                }
                break;
            case R.id.buttonKeep2:
                if(bKeep2==false){
                    bKeep2=true;
                    bKeep1=false;
                    button2.setBackgroundResource(R.drawable.chosen_button);
                    button2.setTextColor(getResources().getColor(R.color.background));
                    button1.setBackgroundResource(R.drawable.unchosen_button);
                    button1.setTextColor(getResources().getColor(R.color.unchosen_text));
                }
                break;
            case R.id.buttonKeep:
                if(bKeep2){
                    ThanksActivity.result++;
                }
                if(bKeep1||bKeep2) {
                    Intent intent = new Intent(this, ThanksActivity.class);
                    startActivity(intent);
                }
                break;

        }

    }
}
