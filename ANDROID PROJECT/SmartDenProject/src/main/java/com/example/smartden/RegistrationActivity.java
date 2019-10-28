/*HumberElites*/
package com.example.smartden;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.regex.Pattern;

public class RegistrationActivity extends AppCompatActivity {

    EditText email;
    EditText password;
    EditText fullname;

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
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        final Button button = findViewById(R.id.btnLogin);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                fullname = (EditText)findViewById(R.id.txtName);
                final String name_input = fullname.getText().toString();

                email = (EditText)findViewById(R.id.txtEmail);
                final String email_input = email.getText().toString();


                password = (EditText)findViewById(R.id.txtPwd);
                final String password_input = password.getText().toString();


                if(name_input.length() == 0)
                {
                    fullname.requestFocus();
                    fullname.setError(getString(R.string.name));
                }
                else if (isValid(email_input) == false) {
                    email.requestFocus();
                    email.setError(getString(R.string.invalid1));
                }
                else if(password_input.length() <=8)
                {
                    password.requestFocus();
                    password.setError(getString(R.string.invalid2));

                }
                else{

                    Intent intent = new Intent(RegistrationActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });


        TextView tv_goback = (TextView)findViewById(R.id.lnkLogin);

        tv_goback.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {



                    Intent intent = new Intent(RegistrationActivity.this, MainActivity.class);
                    startActivity(intent);



            }
        });




    }
}
