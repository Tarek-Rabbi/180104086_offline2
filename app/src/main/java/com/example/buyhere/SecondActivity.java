package com.example.buyhere;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity implements
        View.OnClickListener{

    Button backToMainActivityButton,thirdActivityButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toast.makeText(SecondActivity.this,"Login Successful", Toast.LENGTH_SHORT).show();

        backToMainActivityButton = (Button) findViewById(R.id.backButton);
        thirdActivityButton = (Button) findViewById(R.id.viewProduct);

        backToMainActivityButton.setOnClickListener(this);
        thirdActivityButton.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        if(view.getId()== R.id.backButton)
        {
            Intent intent= new Intent(SecondActivity.this, MainActivity.class);
                    startActivity(intent);
        }
        else if(view.getId()== R.id.viewProduct)
        {
            Intent product= new Intent(SecondActivity.this, ThirdActivity.class);
            startActivity(product);
        }

    }



    /*@Override
    public void onClick(View v) {
        Intent logoutIntent = new Intent(SecondActivity.this, MainActivity.class);
        startActivity(logoutIntent);

        }
        public void onClickListener(View v) {
            Intent thirdActivityButton = new Intent(SecondActivity.this, MainActivity.class);
            startActivity(thirdActivityButton);

    }*/
    }
