package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Chat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);


        LinearLayout newmessage = findViewById(R.id.newmessage);
        LinearLayout newmessage2 = findViewById(R.id.newmessage2);


        newmessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the click event here
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(Chat.this, Message.class);
                startActivity(intent);
            }
        });
        newmessage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the click event here
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(Chat.this, Message.class);
                startActivity(intent);
            }
        });
    }
}