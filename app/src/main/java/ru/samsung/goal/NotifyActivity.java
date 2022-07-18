package ru.samsung.goal;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class NotifyActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1,button2,continueButton;
    Boolean bN1,bN2;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notify);
        button1=findViewById(R.id.buttonNotify1);
        button2=findViewById(R.id.buttonNotify2);
        continueButton=findViewById(R.id.buttonNotify);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        continueButton.setOnClickListener(this);
        bN1=false;
        bN2=false;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.buttonNotify1:
                if(bN1==false){
                    bN1=true;
                    bN2=false;
                    button1.setBackgroundResource(R.drawable.chosen_button);
                    button1.setTextColor(getResources().getColor(R.color.background));
                    button2.setBackgroundResource(R.drawable.unchosen_button);
                    button2.setTextColor(getResources().getColor(R.color.unchosen_text));
                }
                break;
            case R.id.buttonNotify2:
                if(bN2==false){
                    bN2=true;
                    bN1=false;
                    button2.setBackgroundResource(R.drawable.chosen_button);
                    button2.setTextColor(getResources().getColor(R.color.background));
                    button1.setBackgroundResource(R.drawable.unchosen_button);
                    button1.setTextColor(getResources().getColor(R.color.unchosen_text));
                }
                break;
            case R.id.buttonNotify:
                Log.d("DIATAG", DiagnosActivity.b1.toString());
                if(bN2||bN1){
                    if(DiagnosActivity.b1){
                        Intent intent = new Intent(this, ListActivity.class);
                        startActivity(intent);
                    }else{
                        Intent intent1 = new Intent(this,FineActivity.class);
                        startActivity(intent1);
                    }
                }
                break;

        }

    }
}
