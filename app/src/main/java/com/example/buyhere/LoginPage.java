package com.example.buyhere;

import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginPage extends AppCompatActivity implements
        View.OnClickListener{
    Button enterNewActivityButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);
        enterNewActivityButton = (Button) findViewById(R.id.loginButton);

        enterNewActivityButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        Intent loginIntent = new Intent(LoginPage.this, SecondActivity.class);
        startActivity(loginIntent);
    }
}