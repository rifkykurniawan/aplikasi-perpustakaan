package com.example.tugas_besar_mc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import Menu_bawah.activity_menu_bawah;

public class activity_login extends AppCompatActivity {
    private Button btLogin;
    private TextView txtForgot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btLogin=findViewById(R.id.btLogin);
    }

    public void btnLogin(View view) {
        Intent intent=new Intent(this, activity_menu_bawah.class);
        startActivity(intent);
    }

    public void lblForgot(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void lblSignUp(View view) {
        Intent intent = new Intent(this,activity_daftar_account.class);
        startActivity(intent);
    }

    public void btnSignUp(View view) {
        Intent intent = new Intent(this,activity_menu_bawah.class);
        startActivity(intent);
    }
}
