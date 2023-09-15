package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeDaud extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_daud);
        Button searchbutton = findViewById(R.id.searchbutton);
        Button chatbutton = findViewById(R.id.chatbutton);

        Button profilebutton = findViewById(R.id.profilebutton);

        searchbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WelcomeDaud.this, Findexactlywhatyouneed.class);
                startActivity(intent);
            }
        });

        chatbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WelcomeDaud.this, Chat.class);
                startActivity(intent);
            }
        });
        profilebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WelcomeDaud.this, profile.class);
                startActivity(intent);
            }
        });

    }
}