package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       ImageView profile_act = (ImageView) findViewById(R.id.imageView1);
       ImageView takeaPic_act = (ImageView) findViewById(R.id.imageView2);
       ImageView score_act = (ImageView) findViewById(R.id.imageView3);
       ImageView history_act = (ImageView) findViewById(R.id.imageView4);




        profile_act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfile();
            }
        });
        takeaPic_act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentakeaPic();
            }
        });
        score_act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openscore();
            }
        });
        history_act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhistory();
            }
        });
    }

    private void openProfile() {
        Intent intent = new Intent(this, profile.class);
        startActivity(intent);
    }
    private void opentakeaPic(){
        Intent intent = new Intent(this, takeaPic.class);
        startActivity(intent);
    }
    private void openscore(){
        Intent intent = new Intent(this, score.class);
        startActivity(intent);
    }
    private void openhistory(){
        Intent intent = new Intent(this, history.class);
        startActivity(intent);
    }

}
