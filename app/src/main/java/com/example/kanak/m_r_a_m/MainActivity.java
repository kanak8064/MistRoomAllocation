package com.example.kanak.m_r_a_m;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button signin;
    private TextView idText,passText;
    private EditText Id,Pass;
    private  Button signup,Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        signin=findViewById(R.id.button15);
        idText=findViewById(R.id.textView);
        passText=findViewById(R.id.textView2);
        signup=findViewById(R.id.button3);
        Login=findViewById(R.id.button);
        Id=findViewById(R.id.EditText);
        Pass=findViewById(R.id.editText2);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    idText.setVisibility(View.VISIBLE);
                    passText.setVisibility(View.VISIBLE);
                    signin.setVisibility(View.INVISIBLE);
                    signup.setVisibility(View.INVISIBLE);
                    Login.setVisibility(View.VISIBLE);
                    Id.setVisibility(View.VISIBLE);
                    Pass.setVisibility(View.VISIBLE);

            }
        });

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,page2.class);
                startActivity(intent);
            }
        });
    }
}
