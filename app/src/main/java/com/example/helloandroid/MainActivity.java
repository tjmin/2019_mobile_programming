package com.example.helloandroid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher);
    }


public void onButtonAClicked(View v) {
    Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
    startActivity(myIntent);
}


public void onButtonBClicked(View v) {
    Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-4320-2741"));
    startActivity(myIntent);
}

public void onButtonCClicked(View v) {
    Intent myIntent = new Intent(getApplicationContext(), secondActivity.class);
    startActivity(myIntent);
}

}