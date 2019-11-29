package com.example.legendcars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Entrance extends AppCompatActivity {

private ImageButton mustangbtn , minibtn , fordbroncobtn , e30btn , bmw2002btn,audibtn;

void init(){
    mustangbtn = (ImageButton) findViewById(R.id.mustang);
    minibtn = (ImageButton) findViewById(R.id.miniCooper);
    fordbroncobtn = (ImageButton) findViewById(R.id.fordBronco);
    e30btn = (ImageButton) findViewById(R.id.bmwE30);
    bmw2002btn = (ImageButton) findViewById(R.id.bmw2000);
    audibtn = (ImageButton) findViewById(R.id.audi4000);
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrance);
        init();

        mustangbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Entrance.this , Mustang.class);
                startActivity(intent);
            }
        });

        minibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Entrance.this, Minicooper.class);
                startActivity(intent);
            }
        });

        fordbroncobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Entrance.this , fordbronco.class);
                startActivity(intent);
            }
        });

        e30btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Entrance.this ,E30.class);
                startActivity(intent);
            }
        });

        bmw2002btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Entrance.this , bmw2000.class);
                startActivity(intent);
            }
        });

        audibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Entrance.this , audi4000.class);
                startActivity(intent);
            }
        });


    }
}
