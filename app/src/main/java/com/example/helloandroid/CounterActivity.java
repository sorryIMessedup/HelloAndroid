package com.example.helloandroid;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CounterActivity extends AppCompatActivity{
    private static int num = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        TextView numText = findViewById(R.id.textview_number);
        Button btnAdd = findViewById(R.id.btn_ADD);
        Button btnReduce = findViewById(R.id.btn_REDUCE);
        Button btnClear = findViewById(R.id.btn_CLEAR);

        btnAdd.setOnClickListener(view -> {
            num++;
            numText.setText(String.valueOf(num));
        });
        btnReduce.setOnClickListener(view -> {
            num--;
            numText.setText(String.valueOf(num));
        });
        btnClear.setOnClickListener(view -> {
            num = 0;
            numText.setText(String.valueOf(num));
        });
    }
}
