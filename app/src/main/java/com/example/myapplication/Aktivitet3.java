package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Aktivitet3 extends AppCompatActivity {
    @Override protected void onCreate(Bundle savedInstanceState)
{ super.onCreate(savedInstanceState); setContentView(R.layout.aktivitet3);
    Log.d("I aktivitet3 ",
        "oncreate"); Button knapp3=findViewById(R.id.Knapp3);
        Intent i=new Intent(this, MainActivity.class);
    knapp3.setOnClickListener(new View.OnClickListener() {
        @Override public void onClick(View view) { startActivity(i);
    } }); }
}