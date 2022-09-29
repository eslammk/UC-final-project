package com.example.bemyhome;

import static com.example.bemyhome.R.layout.activity_details;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_details);

            TextView nametext = findViewById(R.id.textViewnamed);
            TextView pricetext = findViewById(R.id.textViewpriced);
            ImageView img = findViewById(R.id.imageViewd);
            TextView desctext = findViewById(R.id.textViewdesc);
            Button add = findViewById(R.id.buttonadd);

            Bundle bundle = getIntent().getExtras();
            Items sentItem = (Items) bundle.getSerializable("items");

            nametext.setText(sentItem.getNameItem());
            pricetext.setText(sentItem.getPriceItem() +"KD");
            img.setImageResource(sentItem.getImgItem());
            add.setText(sentItem.getAddItem());
            desctext.setText( "Description: ");

            add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
//                SharedPreferences share = getSharedPreferences(" add to cart ", Context.MODE_PRIVATE);
//                String name = share.getString("name" , nametext.getText().toString());

                    Toast.makeText(DetailsActivity.this , " Added to bag " , Toast.LENGTH_SHORT).show();
                }
            });
    }

//    public void saved (){
//
//        SharedPreferences share = getSharedPreferences("add to cart" , Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor = share.edit();
//        editor.putString("name",nametext.getText().toString());
//        editor.putString("price",pricetext.getText().toString() + " KD ");
//        //editor.putInt("img",img.getImageAlpha());
//        editor.apply();
//
//    }

}