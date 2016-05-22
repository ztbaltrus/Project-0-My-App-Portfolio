package com.example.zachary.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void popularMoviesMessage(View view){
        Toast.makeText(this, "This button will launch the Popular Movies App.", Toast.LENGTH_SHORT).show();
    }

    public void stockHawkMessage(View view) {
        Toast.makeText(this, "This button will launch the Stock Hawk App.", Toast.LENGTH_SHORT).show();
    }

    public void buildItBiggerMessage(View view) {
        Toast.makeText(this, "This button will launch the Build It Bigger app.", Toast.LENGTH_SHORT).show();
    }

    public void makeYourAppMaterialMessage(View view) {
        Toast.makeText(this, "This button will launch the Make Your App Material App.", Toast.LENGTH_SHORT).show();
    }

    public void goUbiquitousMessage(View view) {
        Toast.makeText(this, "This button will launch the Go Ubiquitous App.", Toast.LENGTH_SHORT).show();
    }

    public void capstoneMessage(View view) {
        Toast.makeText(this, "This button will launch the Capstone App.", Toast.LENGTH_SHORT).show();
    }
}
