package com.example.bemyhome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BagShopping extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bag_shopping);

        TextView nametext = findViewById(R.id.textViewshop);



//
//        Bundle bundle = getIntent().getExtras();
//        String name = bundle.getString("name");
//        String price = bundle.getString("price");
//
//        TextView textname = findViewById(R.id.textViewnamed);
//        TextView textprice = findViewById(R.id.textViewpriced);
//        ImageView imgview = findViewById(R.id.imageViewd);


        //int img = bundle.getInt("photo");
        //Items sentItem = (Items) bundle.getSerializable("items");

//        textname.setText(name);
//        textprice.setText(price+ "KD");
//        //img.setText(imgview);







//
//        textname.setText(name);
//        textprice.setText(price);
//        imgview.setImageResource(img);
//
//
//        Bundle bundle = getIntent().getExtras();
//        Items sentItem = (Items) bundle.getSerializable("items");
//
//        nametext.setText(sentItem.getItemName());
//        pricetext.setText(sentItem.getItemPrice() + "KD");
//        img.setImageResource(sentItem.getItemImg());

    }
}