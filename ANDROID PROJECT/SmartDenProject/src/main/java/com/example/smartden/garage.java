package com.example.smartden;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class garage extends AppCompatActivity {


    Button button;
    Button button2;
    Button stop;
    TextView state;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garage);
        getSupportActionBar().setTitle(getString(R.string.garage));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        state = findViewById(R.id.textView2);
        button = findViewById(R.id.open);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                button.setBackgroundColor(getResources().getColor(R.color.green));
                state.setText(R.string.open);
                state.setTextColor(getResources().getColor(R.color.red));
                button2.setBackgroundResource(android.R.drawable.btn_default);

            }
        });

        button2 = findViewById(R.id.close);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                button2.setBackgroundColor(getResources().getColor(R.color.red));
                state.setText(R.string.close);
                state.setTextColor(getResources().getColor(R.color.red));
                button.setBackgroundResource(android.R.drawable.btn_default);

            }
        });
        stop = findViewById(R.id.stop);
        stop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                stop.setBackgroundColor(getResources().getColor(R.color.red));
                state.setText("STOP");
                state.setTextColor(getResources().getColor(R.color.red));

                button.setBackgroundResource(android.R.drawable.btn_default);
                button2.setBackgroundResource(android.R.drawable.btn_default);
            }
        });



    }
}
