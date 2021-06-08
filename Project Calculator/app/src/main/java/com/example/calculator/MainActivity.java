package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        textView = findViewById(R.id.textView);

        initButton_Clear_ClickListener();
        initButton_0_ClickListener();
        initButton_1_ClickListener();
        initButton_2_ClickListener();
        initButton_3_ClickListener();
        initButton_4_ClickListener();
        initButton_5_ClickListener();
        initButton_6_ClickListener();
        initButton_7_ClickListener();
        initButton_8_ClickListener();
        initButton_9_ClickListener();
    }

    private void setText(TextView textView, String text) {

        String zero = "0";
        String string = textView.getText().toString();

        //Toast.makeText(getApplicationContext(), string + "_" + (string.equals(zero)), Toast.LENGTH_SHORT).show();

        if (string.equals(zero)){
            string = "";
        }

        textView.setText(string + text);
    }

    private void initButton_Clear_ClickListener() {
        Button button = findViewById(R.id.button_clear);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("0");
            }
        });
    }

    private void initButton_0_ClickListener() {
        Button button = findViewById(R.id.button_0);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setText(textView, button.getText().toString());
            }
        });
    }

    private void initButton_1_ClickListener() {
        Button button = findViewById(R.id.button_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setText(textView, button.getText().toString());
            }
        });
    }

    private void initButton_2_ClickListener() {
        Button button = findViewById(R.id.button_2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setText(textView, button.getText().toString());
            }
        });
    }

    private void initButton_3_ClickListener() {
        Button button = findViewById(R.id.button_3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setText(textView, button.getText().toString());
            }
        });
    }

    private void initButton_4_ClickListener() {
        Button button = findViewById(R.id.button_4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setText(textView, button.getText().toString());
            }
        });
    }

    private void initButton_5_ClickListener() {
        Button button = findViewById(R.id.button_5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setText(textView, button.getText().toString());
            }
        });
    }

    private void initButton_6_ClickListener() {
        Button button = findViewById(R.id.button_6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setText(textView, button.getText().toString());
            }
        });
    }

    private void initButton_7_ClickListener() {
        Button button = findViewById(R.id.button_7);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setText(textView, button.getText().toString());
            }
        });
    }

    private void initButton_8_ClickListener() {
        Button button = findViewById(R.id.button_8);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setText(textView, button.getText().toString());
            }
        });
    }

    private void initButton_9_ClickListener() {
        Button button = findViewById(R.id.button_9);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setText(textView, button.getText().toString());
            }
        });
    }

}