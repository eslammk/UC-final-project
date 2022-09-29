package com.example.bemyhome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class buttonOne extends AppCompatActivity {

    ArrayList<Items> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_one);

          Items item1 = new Items("Bink Hearing Aids" , 200, R.drawable.binkhearingaids,"Add to bag");
          Items item2 = new Items("Gold Hearing Aids" , 150, R.drawable.goldhearingaids, "Add to bag");
          Items item3 = new Items("Hearing Aids" , 117.5, R.drawable.hearingaidsb , "Add to bag");
          Items item4 = new Items("Hearing Aids/Black" , 190, R.drawable.hearingaidsblack , "Add to bag");
          Items item5 = new Items("Hearing Aids/small " , 210.4, R.drawable.hearingaidssmall, "Add to bag");
          Items item6 = new Items("Clear Hearing Aids" , 210.7, R.drawable.hlearhearingaids , "Add to bag");
          Items item7 = new Items("Hearing Aids/kids" , 150.4, R.drawable.kidshearingaids , "Add to bag");
          Items item8 = new Items("Small Hearing Aids" , 130, R.drawable.smallhearingaids, "Add to bag");
          Items item9 = new Items("White Hearing Aids" , 110.6, R.drawable.whitehearingaids, "Add to bag");


          items.add(item1);
          items.add(item2);
          items.add(item3);
          items.add(item4);
          items.add(item5);
          items.add(item6);
          items.add(item7);
          items.add(item8);
          items.add(item9);


        RecyclerView recycler = findViewById(R.id.en);
        recycler.setHasFixedSize(true);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recycler.setLayoutManager(manager);

        ItemAdapter adapter = new ItemAdapter( items ,this);
        recycler.setAdapter(adapter);
    }
}