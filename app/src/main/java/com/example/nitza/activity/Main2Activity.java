package com.example.nitza.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
TextView tv;
Button g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv = findViewById(R.id.tv);
        g = findViewById(R.id.g);
        tv.setText("Last result: " + getIntent().getExtras().getString("Nitzan"));
    }

    public void g(View view) {
        Intent k= new Intent(this, MainActivity.class);
        startActivity(k);
    }

}
