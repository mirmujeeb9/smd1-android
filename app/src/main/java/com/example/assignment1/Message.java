package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Message extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        ImageView voicecall = findViewById(R.id.voicecall);
        ImageView videocall = findViewById(R.id.videocall);
        TextView video = findViewById(R.id.video);
        TextView camera = findViewById(R.id.camera);

        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle the text click event here
                // You can use an Intent to navigate to a different activity/screen
                Intent intent = new Intent(Message.this, video.class); // Replace with the correct activity class name
                startActivity(intent);
            }
        });
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle the text click event here
                // You can use an Intent to navigate to a different activity/screen
                Intent intent = new Intent(Message.this, photoandvideo.class); // Replace with the correct activity class name
                startActivity(intent);
            }
        });






        // Set an OnClickListener for the voicecall ImageView
        voicecall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the VoiceCallActivity (replace with the actual class name)
                Intent intent = new Intent(Message.this, voicecall.class);
                startActivity(intent);
            }
        });

        // Set an OnClickListener for the videocall ImageView
        videocall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the VideoCallActivity (replace with the actual class name)
                Intent intent = new Intent(Message.this, videocall.class);
                startActivity(intent);
            }
        });
    }
}
