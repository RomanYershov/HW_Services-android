package com.example.app_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nameEt = findViewById(R.id.ma_name_et);
        TextView textEt = findViewById(R.id.ma_text_et);

        Button btnSend = findViewById(R.id.ma_send_btn);
        btnSend.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.putExtra("name", nameEt.getText().toString());
            intent.putExtra("text", textEt.getText().toString());
            intent.setAction("APP1SEND");
            sendBroadcast(intent);
        });




    }
}
