package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;

public class SettingsActivity extends AppCompatActivity implements Constants {

    private boolean valueTheme = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Switch switchTheme = (Switch) findViewById(R.id.switchTheme);
        switchTheme.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                valueTheme = isChecked;
            }
        });

//        Intent intentParams = getIntent();
//        Bundle params = intentParams.getExtras();
//        if (params != null){
//
//        }

        Button btnReturn = findViewById(R.id.buttonReturn);
        btnReturn.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.putExtra("qwer", valueTheme);
            //setResult(YOUR_THEME, intent);
            finish();
        });
    }
}