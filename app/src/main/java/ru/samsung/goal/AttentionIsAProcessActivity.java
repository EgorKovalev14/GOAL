package ru.samsung.goal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AttentionIsAProcessActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView imageView;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attention_is_aprocess);
        imageView=findViewById(R.id.attention_is_a_process_image);
        view=findViewById(R.id.attention_is_a_process_background);
        imageView.setOnClickListener(this);
        view.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.attention_is_a_process_background:
                Intent intent=new Intent(this, AttentiveManActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
                break;
            case R.id.attention_is_a_process_image:
                Intent intent1=new Intent(this, AttentiveManActivity.class);
                startActivity(intent1);
                overridePendingTransition(0,0);
                break;

        }

    }
}