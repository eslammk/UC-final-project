package com.example.bemyhome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class buttonThree extends AppCompatActivity {

    ArrayList<Types> type = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_three);

        Types item1 = new Types ( "Beige Foot " , 320 ,R.drawable.beigefoot," Add to bag " );
        Types item2 = new Types ("Blue Leg", 1020 , R.drawable.blueleg, " Add to bag ");
        Types item3 = new Types ("Brown Leg", 1207.9 , R.drawable.brownleg, " Add to bag ");
        Types item4 = new Types ("Gray Hand", 2270 , R.drawable.grayhand, " Add to bag ");
        Types item5 = new Types ("Normal Leg", 950 , R.drawable.leg, " Add to bag ");
        Types item6 = new Types ("Silver Hand", 2000, R.drawable.silverhand, " Add to bag ");
        Types item7 = new Types ("White Hand", 750.8 , R.drawable.whitehand, " Add to bag ");


        type.add(item1);
        type.add(item2);
        type.add(item3);
        type.add(item4);
        type.add(item5);
        type.add(item6);
        type.add(item7);


        RecyclerView recycler = findViewById(R.id.ennn);
        recycler.setHasFixedSize(true);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recycler.setLayoutManager(manager);

        TypeAdapter adapter = new TypeAdapter ( type ,this);
        recycler.setAdapter(adapter);


    }
}