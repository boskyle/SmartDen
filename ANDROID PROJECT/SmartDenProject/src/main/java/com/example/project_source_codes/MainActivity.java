/*HumberElites*/
package com.example.project_source_codes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import smartden.project.R;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    EditText email;
    EditText password;




    public static boolean isValid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView tv_reg = (TextView)findViewById(R.id.lnkRegister);
        tv_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, RegistrationActivity.class);
                startActivity(intent);
            }
        });


        final Button button = findViewById(R.id.btnLogin);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                email = (EditText)findViewById(R.id.txtEmail);
                password = (EditText)findViewById(R.id.txtPwd);
                final String password_input = password.getText().toString();
                final String email_input = email.getText().toString();

                if (isValid(email_input) == false) {
                    email.requestFocus();
                    email.setError(getString(R.string.invalid1));
                }
                else if(password_input.length() <=8)
                {
                    password.requestFocus();
                    password.setError(getString(R.string.invalid2));

                }
                else {
                    Intent intent = new Intent(MainActivity.this, MainMenu.class);

                    startActivity(intent);
                }
            }
        });


    } //end of oncreate method

    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }










}

