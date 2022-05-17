package com.example.svc_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.Button;
import android.widget.ListView;
import android.view.View;
import android.os.Bundle;

public class ListActivity extends AppCompatActivity {

    private ListView listview ;
    private ListViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // Adapter 생성
        adapter = new ListViewAdapter();

        // 리스트뷰 참조 및 Adapter 달기
        listview = (ListView) findViewById(R.id.listview);
        listview.setAdapter(adapter);
        //listview.setOnItemClickListener(listener);

        adapter.addItem("<SVC NEWS #1>", R.drawable.test, "금요일 말씀 간증: 황정자 권사");  //(제목 부분, 이미지, 내용)
        adapter.addItem("<SVC NEWS #2>", R.drawable.test, "김초롱 청년 출산 축하");
        adapter.addItem("<SVC NEWS #3>", R.drawable.test, "6/18(토) 행복치유수양회를 위해 기도합시다.");
        adapter.addItem("<SVC NEWS #4>", R.drawable.test, "매일 큐티를 생활화 합시다.");
        adapter.addItem("<SVC NEWS #6>", R.drawable.test, "다음주 기도는 김준봉 장로입니다.");

        adapter.notifyDataSetChanged(); //어댑터의 변경을 알림.

        Button list_home_btn = (Button) findViewById(R.id.list_Home_btn);
        list_home_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(intent);
            }
        });
    }


}