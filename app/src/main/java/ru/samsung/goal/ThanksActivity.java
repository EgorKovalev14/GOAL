package ru.samsung.goal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ThanksActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;
    static Integer result = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanks);
        button=findViewById(R.id.buttonThanks);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.buttonThanks:
                if(result>=4) {
                    Intent intent = new Intent(this, MoreActivity.class);
                    startActivity(intent);
                    break;
                }
                Intent intent1 = new Intent(this, LessActivity.class);
                startActivity(intent1);
        }

    }
}
