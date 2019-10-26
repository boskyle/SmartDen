package com.example.smartden;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class Thermostat extends AppCompatActivity {



        /*Temperature and Humidity Simulation!*/
        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                final TextView tv_simulate = (TextView) findViewById(R.id.temp_simulate);
                final TextView tv2_simulate = (TextView) findViewById(R.id.hum_simulate);
                Random rand;
                Random rand2;
                int rnd;
                int rnd2;

                while (true) {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        System.out.println("Interrupted.." + e);
                    }

                    rand = new Random();
                    rand2 = new Random();
                    rnd = rand.nextInt(30);
                    rnd += 25;
                    rnd2 = rand2.nextInt(60);
                    rnd2 += 45;
                    final String rnd_string = Integer.toString(rnd);
                    final String rnd_string2 = Integer.toString(rnd2);

                    tv_simulate.post(new Runnable() {
                        @Override
                        public void run() {
                            tv_simulate.setText(rnd_string + "°Celcius");
                            tv2_simulate.setText(rnd_string2 + "%");
                        }
                    });

                }
            }
        };


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_thermostat);
            getSupportActionBar().setTitle(getString(R.string.thermostat));
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            Thread myThread = new Thread(myRunnable);
            myThread.start();

        }
    }
