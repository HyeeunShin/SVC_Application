package com.example.svc_application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FirZuboActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fir_zubo_activity);
        ZuboItems zubo_list = new ZuboItems();

        TextView id_rppr_1 = (TextView) findViewById(R.id.fir_zubo_represent_v);
        TextView id_bible = (TextView) findViewById(R.id.fir_zubo_bible_v);
        TextView id_title = (TextView) findViewById(R.id.fir_zubo_malsum_v);
        TextView id_dopr_1 = (TextView) findViewById(R.id.fir_zubo_danate_pv);
        TextView id_dows = (TextView) findViewById(R.id.fir_zubo_danate_worship_v);

        Intent get_intent = getIntent();

          ZuboItems zubo_obj = (ZuboItems) get_intent.getSerializableExtra("zuboData");

          if(zubo_obj==null){
            id_title.setText(zubo_list.getTitle());
            id_bible.setText(zubo_list.getBible());
            id_rppr_1.setText(zubo_list.getRpPr1());
            id_dopr_1.setText(zubo_list.getDoPr1());
            id_dows.setText(zubo_list.getFnWs());
        }
         else {
              id_title.setText(zubo_obj.getTitle());
              id_bible.setText(zubo_obj.getBible());
              id_rppr_1.setText(zubo_obj.getRpPr1());
              id_dopr_1.setText(zubo_obj.getDoPr1());
              id_dows.setText(zubo_obj.getFnWs());
          }


   //     Intent get_intent_in1 = getIntent();

     //   String[] zubo_obj = (String[]) get_intent_in1.getSerializableExtra("zuboData");

        Button zubo_home_btn = (Button) findViewById(R.id.zb_Home_btn);
        zubo_home_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(intent);
            }
        });
    }

}


