package com.example.svc_application;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {

    String zubo_array_1[] = new String[5];
    String zubo_array_2[] = new String[5];
    String title, bible, rppr1, rppr2, dopr1, dopr2, fnws;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);

        //defaul zubo
        ZuboItems zubo_obj = new ZuboItems();
        Intent get_intent = getIntent();

        ZuboItems zubo_ = (ZuboItems) get_intent.getSerializableExtra("zuboData");

//         if(zubo_obj != null){
//
//             title = zubo_obj.getTitle();
//             bible = zubo_obj.getBible();
//             rppr1 = zubo_obj.getRpPr1();
//             rppr2 = zubo_obj.getRpPr2();
//             dopr1 = zubo_obj.getDoPr1();
//             dopr2 = zubo_obj.getDoPr2();
//             fnws = zubo_obj.getFnWs();
            // zubo_array_1 = new String[]{title, bible, rppr1, dopr1, fnws};
            // zubo_array_2 = new String[]{title, bible, rppr2, dopr2, fnws};

          //   zubo_array_1 = {zubo_obj.getTitle(), zubo_obj.getBible(), zubo_obj.getRpPr1(), zubo_obj.getDoPr1(), zubo_obj.getFnWs()};
         //    zubo_array_2 = {zubo_obj.getTitle(), zubo_obj.getBible(), zubo_obj.getRpPr2(), zubo_obj.getDoPr2(), zubo_obj.getFnWs()};
//
//             TextView testview = (TextView) findViewById(R.id.testedt);
//            testview.setText(zubo_obj.getTitle());
//        }

        Button menu_fir_zubo_btn = (Button) findViewById(R.id.fir_zubo_btn);
        menu_fir_zubo_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FirZuboActivity.class);
                intent.putExtra("zuboData", zubo_);
                startActivity(intent);
            }
        });
        Button menu_sec_zubo_btn = (Button) findViewById(R.id.sec_zubo_btn);
        menu_sec_zubo_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SecZuboActivity.class);
                intent.putExtra("zuboData2", zubo_);
                startActivity(intent);
            }
        });
        Button menu_after_zubo_btn = (Button) findViewById(R.id.after_zubo_btn);
        menu_after_zubo_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AfterZuboActivity.class);
                startActivity(intent);
            }
        });

        Button menu_news_btn = (Button) findViewById(R.id.news_btn);
        menu_news_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ListActivity.class);
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

        Button menu_edit_btn = (Button) findViewById(R.id.edit_menu);
        menu_edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), EditZuboActivity.class);
                startActivity(intent);
            }
        });





    }
}