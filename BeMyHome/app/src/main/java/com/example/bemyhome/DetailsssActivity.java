package com.example.bemyhome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailsssActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailsss);

        TextView nametext = findViewById(R.id.textViewnameddd);
        TextView pricetext = findViewById(R.id.textViewpriceddd);
        ImageView img = findViewById(R.id.imageViewddd);
        TextView desctext = findViewById(R.id.textViewdesccc);
        Button add = findViewById(R.id.buttonadddd);

        Bundle bundle = getIntent().getExtras();
        Types sentItem = (Types) bundle.getSerializable("type");

        nametext.setText(sentItem.getNameeeItem());
        pricetext.setText(sentItem.getPriceeeItem() + "KD");
        img.setImageResource(sentItem.getImgeeItem());
        add.setText(sentItem.getAddddItem());
        desctext.setText(" this chair for kids ");

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                SharedPreferences share = getSharedPreferences(" add to cart ", Context.MODE_PRIVATE);
//                String name = share.getString("name" , nametext.getText().toString());

                Toast.makeText(DetailsssActivity.this, " Added to bag ", Toast.LENGTH_SHORT).show();
            }
        });
    }
}