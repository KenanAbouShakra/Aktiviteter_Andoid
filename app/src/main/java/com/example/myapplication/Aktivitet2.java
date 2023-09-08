package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Aktivitet2 extends AppCompatActivity {
    @Override protected void onCreate(Bundle savedInstanceState)
{ super.onCreate(savedInstanceState);
    setContentView(R.layout.aktivitet2);
    Log.d("I aktivitet2 ",
        "oncreate"); Button knapp2=findViewById(R.id.Knapp2);
        Intent i=new Intent(this, Aktivitet3.class);
    knapp2.setOnClickListener(new View.OnClickListener() {
        @Override public void
        onClick(View view) { startActivity(i);
    } }); }
}