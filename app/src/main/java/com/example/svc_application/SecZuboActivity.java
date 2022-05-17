package com.example.svc_application;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecZuboActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sec_zubo_activity);
        ZuboItems zubo_list_2 = new ZuboItems();

            TextView id_rppr_2 = (TextView) findViewById(R.id.sec_zubo_represent_v);
            TextView id_bible = (TextView) findViewById(R.id.sec_zubo_bible_v);
            TextView id_title = (TextView) findViewById(R.id.sec_zubo_malsum_v);
            TextView id_dopr_2 = (TextView) findViewById(R.id.sec_zubo_danate_pv);
            TextView id_dows = (TextView) findViewById(R.id.sec_zubo_danate_worship_v);

        Intent get_intent = getIntent();

        ZuboItems zubo_obj2 = (ZuboItems) get_intent.getSerializableExtra("zuboData2");

        if(zubo_obj2 == null) {
            id_title.setText(zubo_list_2.getTitle());
            id_bible.setText(zubo_list_2.getBible());
            id_rppr_2.setText(zubo_list_2.getRpPr2());
            id_dopr_2.setText(zubo_list_2.getDoPr2());
            id_dows.setText(zubo_list_2.getFnWs());
        }
        else{
            id_title.setText(zubo_obj2.getTitle());
            id_bible.setText(zubo_obj2.getBible());
            id_rppr_2.setText(zubo_obj2.getRpPr2());
            id_dopr_2.setText(zubo_obj2.getDoPr2());
            id_dows.setText(zubo_obj2.getFnWs());

        }

        Button zubo_home_btn2 = (Button) findViewById(R.id.zb_Home_btn2);
        zubo_home_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(intent);
            }
        });
    }

}


