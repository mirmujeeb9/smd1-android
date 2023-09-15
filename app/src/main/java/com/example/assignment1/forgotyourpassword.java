package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
public class forgotyourpassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotyourpassword);
        TextView gobacktologin = findViewById(R.id.gobacktologin);
        gobacktologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(forgotyourpassword.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
