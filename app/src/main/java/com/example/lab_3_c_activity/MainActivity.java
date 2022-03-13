package com.example.lab_3_c_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button chonmau = findViewById(R.id.buttonChonMau);
        chonmau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_chonmau);

                TextView mau = findViewById(R.id.textViewMau);
                ImageView anh = findViewById(R.id.imageViewAnh);
                ImageView bac = findViewById(R.id.imageViewBac);
                bac.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        anh.setImageResource(R.drawable.vs_xam);
                        mau.setText("Điện Thoại Vsmart Joy 3 \nHàng chính hãng \nMàu: xám \n Cung cấp bởi Tiki Tradding \n 1.790.000 đ");
                    }
                });

                ImageView red = findViewById(R.id.imageViewDo);
                red.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        anh.setImageResource(R.drawable.vs_red);
                        mau.setText("Điện Thoại Vsmart Joy 3 \nHàng chính hãng \nMàu: đỏ \n Cung cấp bởi Tiki Tradding \n 1.790.000 đ");
                    }
                });

                ImageView den = findViewById(R.id.imageViewDen);
                den.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        anh.setImageResource(R.drawable.vc_den);
                        mau.setText("Điện Thoại Vsmart Joy 3 \nHàng chính hãng \nMàu: đen \n Cung cấp bởi Tiki Tradding \n 1.790.000 đ");
                    }
                });

                ImageView xanh = findViewById(R.id.imageViewXanh);
                xanh.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        anh.setImageResource(R.drawable.vs_green);
                        mau.setText("Điện Thoại Vsmart Joy 3 \nHàng chính hãng \nMàu: xanh \n Cung cấp bởi Tiki Tradding \n 1.790.000 đ");
                    }
                });

                Button xong = findViewById(R.id.buttonXong);
                xong.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        setContentView(R.layout.activity_main);
                    }
                });

            }

        });
    }
}