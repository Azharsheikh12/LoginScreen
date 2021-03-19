package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    private Button button, buttonSubmit;
    private EditText editText;
    EditText email, password,username;
    Button login;
    TextView register;
    private TextView txtview;
    boolean isEmailValid, isPasswordValid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = (EditText) findViewById(R.id.editTxt1);
        password = (EditText) findViewById(R.id.editTxt2);
        username = (EditText) findViewById(R.id.editTxt3);
        login = (Button) findViewById(R.id.LoginBtn);
        //login = findViewById(R.id.LoginBtn);
        txtview = findViewById(R.id.editTxt1);
        //register = (TextView) findViewById(R.id.register);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                openLoginActivity();
                SetValidation();

            }
        });


    }

    public void SetValidation() {

        if (email.getText().toString().isEmpty()) {
            email.setError(getResources().getString(R.string.email_error));
            isEmailValid = false;
        } else if (!Patterns.EMAIL_ADDRESS.matcher(email.getText().toString()).matches()) {
            email.setError(getResources().getString(R.string.error_invalid_email));
            isEmailValid = false;
        } else {
            isEmailValid = true;
        }


        if (password.getText().toString().isEmpty()) {
            password.setError(getResources().getString(R.string.password_error));
            isPasswordValid = false;
        } else if (password.getText().length() < 6) {
            password.setError(getResources().getString(R.string.error_invalid_password));
            isPasswordValid = false;
        } else {
            isPasswordValid = true;
        }

        if (isEmailValid && isPasswordValid) {
            Toast.makeText(getApplicationContext(), "Successfully", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);

            String str = username.getText().toString();
            Intent intent1 = new Intent(getApplicationContext(), LoginActivity.class);
            intent.putExtra("message_key", str);
            startActivity(intent);
        }

//        public void openLoginActivity() {
//            Intent intent = new Intent(this, LoginActivity.class);
//            startActivity(intent);
//
//
//        }

    }
}

