package com.example.loginapp; // Replace with your package name

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText usernameInput;
    private EditText passwordInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameInput = findViewById(R.id.username_input);
        passwordInput = findViewById(R.id.password_input);

        // Handle login button click
        findViewById(R.id.login_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameInput.getText().toString().trim();
                String password = passwordInput.getText().toString().trim();

                // Implement your login logic here, for example:
                // - Check username and password against a database or API
                // - If successful, navigate to the next activity

                if (username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter username and password", Toast.LENGTH_SHORT).show();
                }
                else if(username.equals("admin")&& password.equals("password"))
                {

                    Toast.makeText(MainActivity.this, "Login successful!", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Username and Password is Incorrect!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Handle social login buttons (optional)
        // You can handle clicks on Facebook and Linkedin buttons similarly to the login button
        // For example:
//        findViewById(R.id.facebook_btn).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Implement Facebook login logic here
//                Toast.makeText(MainActivity.this, "Using Facebook Login", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        findViewById(R.id.linkedin_btn).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Implement Linkedin login logic here
//                Toast.makeText(MainActivity.this, "Using Linkedin Login", Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}
