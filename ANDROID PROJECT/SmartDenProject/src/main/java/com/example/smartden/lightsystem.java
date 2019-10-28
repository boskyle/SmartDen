/*HumberElites*/
package com.example.smartden;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class lightsystem extends AppCompatActivity {


    ToggleButton button2;
    ToggleButton button3;
    ToggleButton button4;
    ToggleButton button5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lightsystem);
        getSupportActionBar().setTitle("Light System");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        button2 = findViewById(R.id.toggleButton2);
        button3 = findViewById(R.id.toggleButton3);
        button4 = findViewById(R.id.toggleButton4);
        button5 = findViewById(R.id.toggleButton5);

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                boolean checked = ((ToggleButton)v).isChecked();

                if(checked) {

                    button2.setBackgroundColor(getResources().getColor(R.color.green));


                }
                else{

                    button2.setBackgroundResource(android.R.drawable.btn_default);


                }



            }
        });



        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                boolean checked = ((ToggleButton)v).isChecked();

                if(checked) {

                    button3.setBackgroundColor(getResources().getColor(R.color.green));


                }
                else{

                    button3.setBackgroundResource(android.R.drawable.btn_default);


                }



            }
        });


        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                boolean checked = ((ToggleButton)v).isChecked();

                if(checked) {

                    button4.setBackgroundColor(getResources().getColor(R.color.green));


                }
                else{

                    button4.setBackgroundResource(android.R.drawable.btn_default);


                }



            }
        });


        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                boolean checked = ((ToggleButton)v).isChecked();

                if(checked) {

                    button5.setBackgroundColor(getResources().getColor(R.color.green));


                }
                else{

                    button5.setBackgroundResource(android.R.drawable.btn_default);


                }



            }
        });







    }

}
