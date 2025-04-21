package com.example.coffeedeliveryapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EmailLoginActivity extends AppCompatActivity {

    EditText emailInput, passwordInput;
    Button btnLogin, btnCreateAccount;
    TextView forgotPasswordLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_login);

        // Link views
        emailInput = findViewById(R.id.emailInput);
        passwordInput = findViewById(R.id.passwordInput);
        btnLogin = findViewById(R.id.btnLogin);
        forgotPasswordLink = findViewById(R.id.forgotPasswordLink);
        btnCreateAccount = findViewById(R.id.btnCreateAccount);

        // Login button
        btnLogin.setOnClickListener(v -> {
            String email = emailInput.getText().toString().trim();
            String password = passwordInput.getText().toString().trim();

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please enter email and password", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(EmailLoginActivity.this, MainActivity.class));
                finish();
            }
        });

        // Forgot Password text
        forgotPasswordLink.setOnClickListener(v -> {
            // Placeholder: You can add ForgotPasswordActivity later
            Toast.makeText(this, "Redirect to Forgot Password screen", Toast.LENGTH_SHORT).show();
            // Example: startActivity(new Intent(this, ForgotPasswordActivity.class));
        });

        // Create Account button
        btnCreateAccount.setOnClickListener(v -> {
            // Redirect to CreateAccountActivity
            startActivity(new Intent(EmailLoginActivity.this, CreateAccountActivity.class));
        });
    }
}
