package com.hansung.webapp_b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.hansung.webapp_b.cyj.MainActivity_a;
import com.hansung.webapp_b.lhs.MainActivity_b;
import com.hansung.webapp_b.pyh.MainActivity_c;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.button);
        Button btn2 = findViewById(R.id.button2);
        Button btn3 = findViewById(R.id.button3);

        btn1.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity_a.class);
            startActivity(intent);
        });
        btn2.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity_b.class);
            startActivity(intent);
        });
        btn3.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity_c.class);
            startActivity(intent);
        });
    }
}