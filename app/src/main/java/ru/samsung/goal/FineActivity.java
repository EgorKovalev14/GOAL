package ru.samsung.goal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FineActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fine);
        button=findViewById(R.id.buttonFine);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.buttonFine:
                if(!DiagnosActivity.b1){
                    Intent intent = new Intent(this, PayAttentionActivity.class);
                    startActivity(intent);
                    break;
                }


        }

    }
}
