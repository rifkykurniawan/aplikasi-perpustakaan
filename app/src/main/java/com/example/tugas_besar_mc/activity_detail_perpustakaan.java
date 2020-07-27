package com.example.tugas_besar_mc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_detail_perpustakaan extends AppCompatActivity {
    ImageView imageView,icon1,image1,image2,image3,icon2,icon3;
    TextView textTitle, textPrice,deskripsi,des2,des3;

    Context context;
    Button button,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_perpustakaan);
        imageView = findViewById(R.id.image_detail);
        textPrice = findViewById(R.id.detail_price);
        textTitle = findViewById(R.id.tittle_detail);
        icon1= findViewById(R.id.imageshare);
        deskripsi= findViewById(R.id.deskripsi3);
        image1=findViewById(R.id.iamgeview1);
        image2=findViewById(R.id.iamgeview2);
        image3=findViewById(R.id.iamgeview3);
        des2=findViewById(R.id.deskripsi4);
        des3=findViewById(R.id.deskripsi5);
        button=findViewById(R.id.imagemap);
        button2=findViewById(R.id.favorit);

        imageView.setImageResource(getIntent().getIntExtra("image", 0));
//        textPrice.setText(getIntent().getStringExtra("price"));
        textTitle.setText(getIntent().getStringExtra("title"));
        deskripsi.setText(getIntent().getStringExtra("deskripsi"));
        image1.setImageResource(getIntent().getIntExtra("image1",0));
        image2.setImageResource(getIntent().getIntExtra("image2",0));
        image3.setImageResource(getIntent().getIntExtra("image3",0));
        des2.setText(getIntent().getStringExtra("des2"));
        des3.setText(getIntent().getStringExtra("des3"));

        icon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("Text/plain");
                String shrebody="youtbodyhre";
                String sharesub="Your subject here";
                intent.putExtra(Intent.EXTRA_TEXT,sharesub);
                intent.putExtra(Intent.EXTRA_TEXT,shrebody);
                startActivity(Intent.createChooser(intent,"share using"));
            }
        });
    }

}
