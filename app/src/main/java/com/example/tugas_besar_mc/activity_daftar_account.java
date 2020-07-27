package com.example.tugas_besar_mc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import Menu_bawah.activity_menu_bawah;

public class activity_daftar_account extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_account);
    }

    public void btnSignUp(View view) {
        Intent intent=new Intent(this, activity_login.class);
        startActivity(intent);
    }
}
