package com.example.buyhere;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public abstract class ThirdActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView refrigeratorImageView, macbookImageView, tvImageView, mobileImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        refrigeratorImageView = (ImageView) findViewById(R.id.refriger);
        macbookImageView = (ImageView) findViewById(R.id.mac);
        tvImageView = (ImageView) findViewById(R.id.tv);
        mobileImageView = (ImageView) findViewById(R.id.mob);

        refrigeratorImageView.setOnClickListener(this);
        macbookImageView.setOnClickListener(this);
        tvImageView.setOnClickListener(this);
        mobileImageView.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        if(view.getId()==R.id.refriger) {
            refrigeratorImageView.setVisibility(View.GONE);
            macbookImageView.setVisibility(View.VISIBLE);

        }

        else if(view.getId()==R.id.mac) {
            macbookImageView.setVisibility(View.GONE);
            tvImageView.setVisibility(View.VISIBLE);

        }
        else if(view.getId()==R.id.tv) {
            tvImageView.setVisibility(View.GONE);
            mobileImageView.setVisibility(View.VISIBLE);
        }
             else if(view.getId()==R.id.mob) {
            mobileImageView.setVisibility(View.GONE);
            refrigeratorImageView.setVisibility(View.VISIBLE);
        }
    }

}

