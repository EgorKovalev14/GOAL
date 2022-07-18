package ru.samsung.goal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PayAttentionActivity extends AppCompatActivity implements View.OnClickListener {
    Button yes,no,continueP;
    Boolean bPA1,bPA2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pay_attention_activity);
        yes=findViewById(R.id.buttonPayAttention1);
        no=findViewById(R.id.buttonPayAttention2);
        continueP=findViewById(R.id.buttonPayAttention);
        yes.setOnClickListener(this);
        no.setOnClickListener(this);
        continueP.setOnClickListener(this);
        bPA1=false;
        bPA2=false;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.buttonPayAttention1:
                if(bPA1==false){
                    bPA1=true;
                    bPA2=false;
                    yes.setBackgroundResource(R.drawable.chosen_button);
                    yes.setTextColor(getResources().getColor(R.color.background));
                    no.setBackgroundResource(R.drawable.unchosen_button);
                    no.setTextColor(getResources().getColor(R.color.unchosen_text));
                }
                break;
            case R.id.buttonPayAttention2:
                if(bPA2==false){
                    bPA2=true;
                    bPA1=false;
                    no.setBackgroundResource(R.drawable.chosen_button);
                    no.setTextColor(getResources().getColor(R.color.background));
                    yes.setBackgroundResource(R.drawable.unchosen_button);
                    yes.setTextColor(getResources().getColor(R.color.unchosen_text));
                }
                break;
            case R.id.buttonPayAttention:
                if(bPA1){
                    ThanksActivity.result++;
                }
                if(bPA1||bPA2) {
                    Intent intent = new Intent(this, DifficultiesActivity.class);
                    startActivity(intent);
                }
                break;

        }


    }
}
