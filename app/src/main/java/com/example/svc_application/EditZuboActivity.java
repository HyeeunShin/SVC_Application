package com.example.svc_application;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class EditZuboActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_activity);
//
       ZuboItems zubo = new ZuboItems();
//
        EditText id_rp_pr_1 = (EditText) findViewById(R.id.edittext_fir_rp_pr);
        EditText id_rp_pr_2 = (EditText) findViewById(R.id.edittext_sec_rp_pr);
        EditText id_txt_bible = (EditText) findViewById(R.id.edittext_bible);
        EditText id_txt_title = (EditText) findViewById(R.id.edittext_title);
        EditText id_do_pr_1 = (EditText) findViewById(R.id.edittext_donate_pray_1);
        EditText id_do_pr_2 = (EditText) findViewById(R.id.edittext_donate_pray_2);
        EditText id_txt_final_worship = (EditText) findViewById(R.id.edittext_final_worship);
//
//        TextView zb_rp_pr_1 = (TextView) findViewById(R.id.fir_zubo_represent_v);
//        TextView zb_rp_pr_2 = (TextView) findViewById(R.id.fir_zubo_represent_v);
//
//        TextView zb_do_pr_1 = (TextView) findViewById(R.id.fir_zubo_danate_pv);
//        TextView zb_do_pr_2 = (TextView) findViewById(R.id.fir_zubo_danate_pv);
//
//        TextView zb_bible_1 = (TextView) findViewById(R.id.fir_zubo_bible_v);
//        TextView zb_bible_2 = (TextView) findViewById(R.id.sec_zubo_bible_v);
//
//        TextView zb_title_1 = (TextView) findViewById(R.id.fir_zubo_malsum_v);
//        TextView zb_title_2 = (TextView) findViewById(R.id.sec_zubo_malsum_v);
//
//        TextView zb_do_pr_ws_1 = (TextView) findViewById(R.id.fir_zubo_danate_worship_v);
//        TextView zb_do_pr_ws_2 = (TextView) findViewById(R.id.sec_zubo_danate_worship_v);

        Button edit_btn = (Button) findViewById(R.id.edit_btn);
        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String rp_pr_1 = id_rp_pr_1.getText().toString();
                String rp_pr_2 = id_rp_pr_2.getText().toString();
                String txt_bible = id_txt_bible.getText().toString();
                String txt_title = id_txt_title.getText().toString();
                String do_pr_1 = id_do_pr_1.getText().toString();
                String do_pr_2 = id_do_pr_2.getText().toString();
                String txt_final_worship = id_txt_final_worship.getText().toString();
                Intent edit_intent = new Intent(getApplicationContext(), MenuActivity.class);
                zubo.setTitle(txt_title);
                zubo.setBible(txt_bible);
                zubo.setRpPr1(rp_pr_1);
                zubo.setRpPr2(rp_pr_2);
                zubo.setDoPr1(do_pr_1);
                zubo.setDoPr2(do_pr_2);
                zubo.setFnWs(txt_final_worship);

            edit_intent.putExtra("zuboData", zubo);
            startActivity(edit_intent);
//                zb_rp_pr_1.setText(rp_pr_1);
//                zb_rp_pr_2.setText(rp_pr_2);
//                zb_do_pr_1.setText(rp_pr_1);
//                zb_do_pr_2.setText(rp_pr_2);
//                zb_bible_1.setText(txt_bible);
//                zb_bible_2.setText(txt_bible);
//                zb_title_1.setText(txt_title);
//                zb_title_2.setText(txt_title);
//                zb_do_pr_ws_1.setText(txt_final_worship);
//                zb_do_pr_ws_2.setText(txt_final_worship);
            }
        });

    }
}
