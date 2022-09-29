package com.example.bemyhome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView phone = findViewById(R.id.imageViewphone);
        ImageView email = findViewById(R.id.imageViewemail);
        ImageView bag = findViewById(R.id.imageViewbag);
        Button homepage = findViewById(R.id.buttonhome);

        homepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, HomePage.class);
                startActivity(intent);


            }
        });

        bag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, BagShopping.class);
                startActivity(intent);

            }
        });

        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.fromParts("tel", "50874229", null));
                startActivity(intent);

            }
        });

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent email = new Intent(Intent.ACTION_SENDTO);
                email.setData(Uri.parse("mailto:"));
                email.putExtra(Intent.EXTRA_EMAIL, "eslammk540@gmail.com");
                email.putExtra(Intent.EXTRA_SUBJECT, " عنوان الرسالة ");
                email.putExtra(Intent.EXTRA_TEXT, " موضوع الرسالة ");

                startActivity(email.createChooser(email, "send email"));

            }
        });






    }
}