package com.example.tugas_besar_mc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ResetPassword extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
        button=findViewById(R.id.btn1_restpassword);
    }

    public void Bnt(View view) {
        Intent intent=new Intent(this,activity_login.class);
        startActivity(intent);
    }
}
