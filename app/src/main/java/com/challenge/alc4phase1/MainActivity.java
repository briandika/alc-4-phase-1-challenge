package com.challenge.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnAbt, btnProf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnAbt = findViewById(R.id.aboutbutton);
        btnProf = findViewById(R.id.profilebutton);

        //Click listener for About button with Intent to open AboutActivity
        btnAbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAbout = new Intent (MainActivity.this, AboutActivity.class);
                startActivity(intentAbout);
            }
        });

        //Click listener for My Profile button and Intent to open MyProfileActivity
        btnProf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentProfile = new Intent (MainActivity.this, MyProfileActivity.class);
                startActivity(intentProfile);
            }
        });

    }

}
