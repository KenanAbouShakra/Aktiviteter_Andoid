package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button firstFragment, secondFragment;

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("I aktivitet ",
                "onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.d("I aktivitet ",
                "onDestroy");
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.d("I aktivitet ",
                "onPause");
        super.onResume();
    }

    @Override
    protected void onStart() {
        Log.d("I aktivitet ",
                "onStart");
        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main); Log.d("I aktivitet ",
            "oncreate"); Button knapp1=findViewById(R.id.Knapp1); Intent i=new Intent(this, Aktivitet2.class);
        knapp1.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View view) { startActivity(i);
        } });
    }
}