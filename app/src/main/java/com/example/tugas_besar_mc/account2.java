package com.example.tugas_besar_mc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import Menu_bawah.activity_menu_bawah;

public class account2 extends AppCompatActivity {
    EditText edNama, edTelepon, edEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account2);


    }

    public void btLogout(View view) {
        Intent intent=new Intent(this, activity_login.class);
        startActivity(intent);
    }

}
