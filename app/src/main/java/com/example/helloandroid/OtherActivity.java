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

        TextView btnText = findViewById(R.id.btn_showOrCloseText);
        TextView otherText = findViewById(R.id.textview_other);

        Button showOrCloseText = findViewById(R.id.btn_showOrCloseText);
        showOrCloseText.setOnClickListener(view -> {
            if (btnText.getText() == "SHOW") {
                btnText.setText("HIDE");
                otherText.setVisibility(View.VISIBLE);
            } else {
                btnText.setText("SHOW");
                otherText.setVisibility(View.GONE);
            }
        });
    }
}
