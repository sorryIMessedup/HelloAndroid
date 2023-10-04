package com.example.helloandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class OtherActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        Button btnCloseOrShowText = findViewById(R.id.btn_showOrCloseText);
        TextView otherText = findViewById(R.id.textview_other);

        btnCloseOrShowText.setOnClickListener(view -> {
            if (btnCloseOrShowText.getText() == "SHOW") {
                btnCloseOrShowText.setText("HIDE");
                otherText.setVisibility(View.VISIBLE);
            } else {
                btnCloseOrShowText.setText("SHOW");
                otherText.setVisibility(View.GONE);
            }
        });
    }
}
