package com.example.calculator;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements Constants {

    private TextView textView;
    private TextView textViewValue;
    private String value1;
    private String value2;
    private final String zero = "0";
    private Calculation calculation = new Calculation();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        textView      = findViewById(R.id.textView);
        textViewValue = findViewById(R.id.textView2);

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

        initButton_Clear_ClickListener();
        initButton_PlusMinus_ClickListener();
        initButton_Percent_ClickListener();
        initButton_Del_ClickListener();

        initButton_Div_ClickListener();
        initButton_Multiply_ClickListener();
        initButton_Minus_ClickListener();
        initButton_Plus_ClickListener();
        initButton_Equals_ClickListener();

        initButton_settings();
    }

    private void initButton_settings() {
        Button button = findViewById(R.id.buttonSettings);
        button.setOnClickListener(v -> {
            Intent runSetting = new Intent(MainActivity.this,SettingsActivity.class);
            startActivity(runSetting);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);



    }

    private void initButton_PlusMinus_ClickListener() {
        Button button = findViewById(R.id.button_plus_minus);
        button.setOnClickListener(v -> {
            value1 = textView.getText().toString();
            value2 = calculation.Operation_Conversion(value1);

            //setTextRezult(textView, value2);
            Toast.makeText(getApplicationContext(),"Кнопка пока не работает", Toast.LENGTH_SHORT).show();
        });
    }

    private void initButton_Percent_ClickListener() {
        Button button = findViewById(R.id.button_percent);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Кнопка пока не работает", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initButton_Del_ClickListener() {
        Button button = findViewById(R.id.button19);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = textView.getText().toString();
                value1 = value1.substring(0, value1.length()-1);
                setTextRezult(textView, value1);
            }
        });
    }

    private void initButton_Div_ClickListener() {
        Button button = findViewById(R.id.button_div);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setTextValue(textViewValue, textView.getText().toString());
                setText(textView, button.getText().toString());
            }
        });
    }

    private void initButton_Multiply_ClickListener() {
        Button button = findViewById(R.id.button_mul);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setTextValue(textViewValue, textView.getText().toString());
                setText(textView, button.getText().toString());
            }
        });
    }

    private void initButton_Minus_ClickListener() {
        Button button = findViewById(R.id.button_minus);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setTextValue(textViewValue, textView.getText().toString());
                setText(textView, button.getText().toString());
            }
        });
    }

    private void initButton_Plus_ClickListener() {
        Button button = findViewById(R.id.button_plus);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setTextValue(textViewValue, textView.getText().toString());
                setText(textView, button.getText().toString());
            }
        });
    }

    private void initButton_Equals_ClickListener() {
        Button button = findViewById(R.id.button_equally);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Кнопка пока не работает", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initButton_Clear_ClickListener() {
        Button button = findViewById(R.id.button_clear);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(zero);
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


    private void setText(TextView textView, String text) {
        String string = textView.getText().toString();

        if (string.equals(zero)){
            string = "";
        }

        textView.setText(string + text);
    }

    private void setTextValue(TextView textView, String text){
        textView.setText(text);
    }

    private void setTextRezult(TextView textView, String text){
        textView.setText(text);
    }
}