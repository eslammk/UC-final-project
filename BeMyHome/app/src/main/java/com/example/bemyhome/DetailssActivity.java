package com.example.bemyhome;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailssActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailss);

        TextView nametextt = findViewById(R.id.textViewnamedd);
        TextView pricetextt = findViewById(R.id.textViewpricedd);
        ImageView iimg = findViewById(R.id.imageViewdd);
        TextView desctextt = findViewById(R.id.textViewdescc);
        Button aadd = findViewById(R.id.buttonaddd);

        Bundle bundle = getIntent().getExtras();
        Lists sentItem = (Lists)bundle.getSerializable("myList");


        nametextt.setText(sentItem.getNameeItem());
        pricetextt.setText(sentItem.getPriceeItem() +"KD");
        iimg.setImageResource(sentItem.getImggItem());
        aadd.setText(sentItem.getAdddItem());
        desctextt.setText( " this chair for kids ");

        aadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(DetailssActivity.this , " Added to bag " , Toast.LENGTH_SHORT).show();
            }
        });
    }
}