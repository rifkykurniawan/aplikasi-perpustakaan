package com.example.tugas_besar_mc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn_forgetpass);
    }

    public void btnsend(View view) {
        Intent intent=new Intent(MainActivity.this,activity_verify.class);
        startActivity(intent);
    }
}
