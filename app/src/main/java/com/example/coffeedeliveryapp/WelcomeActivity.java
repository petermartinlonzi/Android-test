package com.example.coffeedeliveryapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    Button btnLoginEmail, btnLoginFacebook, btnLoginGoogle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        btnLoginEmail = findViewById(R.id.btnLoginEmail);
        btnLoginFacebook = findViewById(R.id.btnLoginFacebook);
        btnLoginGoogle = findViewById(R.id.btnLoginGoogle);

        // ✅ Open the EmailLoginActivity when clicking the email button
        btnLoginEmail.setOnClickListener(v -> {
            startActivity(new Intent(WelcomeActivity.this, EmailLoginActivity.class));
        });

        btnLoginFacebook.setOnClickListener(v -> {
            // Placeholder: Facebook login goes here
            startActivity(new Intent(WelcomeActivity.this, MainActivity.class));
        });

        btnLoginGoogle.setOnClickListener(v -> {
            // Placeholder: Google login goes here
            startActivity(new Intent(WelcomeActivity.this, MainActivity.class));
        });
    }
}
