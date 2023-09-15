package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Findexactlywhatyouneed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_findexactlywhatyouneed);
        Button homebutton = findViewById(R.id.homebutton);
        Button chatbutton = findViewById(R.id.chatbutton);

        Button profilebutton = findViewById(R.id.profilebutton);
        Button uploadbutton = findViewById(R.id.uploadbutton);


        homebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Findexactlywhatyouneed.this, WelcomeDaud.class);
                startActivity(intent);
            }
        });

        chatbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Findexactlywhatyouneed.this, Chat.class);
                startActivity(intent);
            }
        });
        profilebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Findexactlywhatyouneed.this, profile.class);
                startActivity(intent);
            }
        });
        uploadbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Findexactlywhatyouneed.this, uploading.class);
                startActivity(intent);
            }
        });
    }

}