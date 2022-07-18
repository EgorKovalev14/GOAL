package ru.samsung.goal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class NameActivity extends AppCompatActivity implements View.OnClickListener {
    View back;
    Button button;
    EditText editText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
        back = findViewById(R.id.name_background);
        back.setOnClickListener(this);
        button = findViewById(R.id.buttonName);
        button.setOnClickListener(this);
        editText=findViewById(R.id.editTextTextPersonName);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.name_background:
                hideKeyboard(this);
                break;
            case R.id.buttonName:
                if(editText.getText().toString().length()>0) {
                    Intent intent = new Intent(this, DiagnosActivity.class);
                    startActivity(intent);
                }
                break;
        }

    }

    public static void hideKeyboard(Activity activity) {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        //Find the currently focused view, so we can grab the correct window token from it.
        View view = activity.getCurrentFocus();
        //If no view currently has focus, create a new one, just so we can grab a window token from it
        if (view == null) {
            view = new View(activity);
        }
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
