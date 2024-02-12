package com.example.legalconsultant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnOtp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOtp=findViewById(R.id.btnOtp);

        btnOtp.setOnClickListener(v->{Intent i=new Intent(this, home.class);
            startActivity(i);});

    }
}