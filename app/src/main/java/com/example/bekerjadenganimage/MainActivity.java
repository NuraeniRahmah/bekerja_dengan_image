package com.example.bekerjadenganimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
ImageView imgSatu;
CircleImageView crcImgSatu;
Button btnGanti, btnGambarUrl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgSatu=(ImageView)findViewById(R.id.img_satu);
        crcImgSatu=(CircleImageView)findViewById(R.id.crc_img_satu);
        btnGanti=(Button)findViewById(R.id.btn_ganti);
        btnGambarUrl=(Button)findViewById(R.id.btn_gambar_url);
        btnGanti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgSatu.setImageResource(R.drawable.img2);
                crcImgSatu.setImageResource(R.drawable.img2);
            }
        });

        btnGambarUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Picasso
                        .with(getApplicationContext())
                        .load("https://cdn.pixabay.com/photo/2013/04/22/20/02/ruddy-shelduck-106544_960_720.jpg")
                        .into(imgSatu);
            }
        });
    }
}
