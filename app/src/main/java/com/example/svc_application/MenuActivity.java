package com.example.svc_application;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MenuActivity extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);

        Button menu_zubo_btn = (Button) findViewById(R.id.zubo_btn);
        menu_zubo_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ZuboActivity.class);
                startActivity(intent);
            }
        });

        Button menu_news_btn = (Button) findViewById(R.id.news_btn);
        menu_news_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), NewsActivity.class);
                startActivity(intent);
            }
        });

        Button menu_song_btn = (Button) findViewById(R.id.song_btn);
        menu_song_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SongActivity.class);
                startActivity(intent);
            }
        });
    }
}