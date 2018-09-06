package com.example.kanak.m_r_a_m;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page2 extends AppCompatActivity {

    private Button logout,tower1,tower2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        logout=findViewById(R.id.button2);
        tower1=findViewById(R.id.button5);
        tower2=findViewById(R.id.button7);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(page2.this,MainActivity.class);
                startActivity(intent2);
            }
        });

        tower1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3=new Intent(page2.this,page3.class);
                startActivity(intent3);
            }
        });

        tower2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4=new Intent(page2.this,page3.class);
                startActivity(intent4);
            }
        });

    }



}
