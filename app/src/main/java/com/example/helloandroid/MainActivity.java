package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnJumpToOther = findViewById(R.id.btn_jumpToOther);
        btnJumpToOther.setOnClickListener(view -> {
            final AlertDialog.Builder normalDialog =
                    new AlertDialog.Builder(MainActivity.this);
            normalDialog.setTitle("Continue Jump to the Other Activity");
            normalDialog.setPositiveButton("YES",
                    (dialog, which) -> {
                        Intent intent = new Intent(MainActivity.this, OtherActivity.class);
                        startActivity(intent);
                    });
            normalDialog.setNegativeButton("NO",
                    (dialog, which) -> { /* do nothing */ });
            normalDialog.show(); // display the AlertDialog
        });

        Button btnJumpToCounter = findViewById(R.id.btn_jumpToCounter);
        btnJumpToCounter.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CounterActivity.class);
            startActivity(intent);
        });
    }
}