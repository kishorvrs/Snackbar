package com.example.snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    Snackbar snackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View view=findViewById(R.id.activity_main);
       // Snackbar.make(view,"Hello Snackbar",Snackbar.LENGTH_SHORT).show();

        snackbar=Snackbar.make(view,"Hello Snackbar",Snackbar.LENGTH_LONG);
        snackbar.setDuration(10000);
        snackbar.show();
        //snackbar.dismiss();
    }
}
