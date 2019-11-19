/*HumberElites*/
package com.example.project_source_codes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import smartden.project.R;

public class MainMenu extends AppCompatActivity {

    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        getSupportActionBar().setTitle(getString(R.string.mainmenu));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        layout = (ConstraintLayout) findViewById(R.id.constraintLayout3);
        layout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(MainMenu.this, garage.class);

                startActivity(intent);
            }
        });


        layout = (ConstraintLayout) findViewById(R.id.constraintLayout4);
        layout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(MainMenu.this, lightsystem.class);

                startActivity(intent);
            }
        });

        layout = (ConstraintLayout) findViewById(R.id.constraintLayout5);
        layout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(MainMenu.this, security.class);

                startActivity(intent);
            }
        });

        layout = (ConstraintLayout) findViewById(R.id.constraintLayout6);
        layout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(MainMenu.this, Thermostat.class);

                startActivity(intent);
            }
        });






    }


}
