package com.example.app_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView nameTv = findViewById(R.id.ma_name_tv);
        TextView textTv = findViewById(R.id.ma_text_tv);
        nameTv.setText(getIntent().getStringExtra("name"));
        textTv.setText(getIntent().getStringExtra("text"));
    }
}
