/*HumberElites*/
package com.example.smartden;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class security extends AppCompatActivity {
    ToggleButton button;
    ToggleButton button2;
    ToggleButton button3;
    ToggleButton button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security);
        getSupportActionBar().setTitle(getString(R.string.security));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        button = findViewById(R.id.toggleButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                boolean checked = ((ToggleButton)v).isChecked();

                if(checked) {

                    button.setBackgroundColor(getResources().getColor(R.color.yellow));


                }
                else{

                    button.setBackgroundResource(android.R.drawable.btn_default);


                }



            }
        });



        button2 = findViewById(R.id.toggleButton6);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                boolean checked = ((ToggleButton)v).isChecked();

                if(checked) {

                    button2.setBackgroundColor(getResources().getColor(R.color.yellow));


                }
                else{

                    button2.setBackgroundResource(android.R.drawable.btn_default);


                }



            }
        });

        button3 = findViewById(R.id.toggleButton7);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                boolean checked = ((ToggleButton)v).isChecked();

                if(checked) {

                    button3.setBackgroundColor(getResources().getColor(R.color.yellow));


                }
                else{

                    button3.setBackgroundResource(android.R.drawable.btn_default);


                }



            }
        });


        button4 = findViewById(R.id.toggleButton8);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                boolean checked = ((ToggleButton)v).isChecked();

                if(checked) {

                    button4.setBackgroundColor(getResources().getColor(R.color.yellow));


                }
                else{

                    button4.setBackgroundResource(android.R.drawable.btn_default);


                }



            }
        });



    }
}
