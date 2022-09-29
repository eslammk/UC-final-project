package com.example.bemyhome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class buttonTwo extends AppCompatActivity {

    ArrayList<Lists> myList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_two);

        Lists item1 = new Lists ("Wheel Chair beige" , 200, R.drawable.wheelchairbeige,"Add to bag");
        Lists item2 = new Lists("Wheel Chair black" , 150, R.drawable.wheelchairblack3, "Add to bag");
        Lists item3 = new Lists("Wheel Chair black" , 117.5, R.drawable.wheelchairblackk , "Add to bag");
        Lists item4 = new Lists("Wheel Chair blue/gray" , 190, R.drawable.wheelchairbluegray , "Add to bag");
        Lists item5 = new Lists("Wheel Chair gray" , 210.4, R.drawable.wheelchairgray , "Add to bag");
        Lists item6 = new Lists("Wheel Chair red/kids" , 250.7, R.drawable.wheelchairredkids , "Add to bag");
        Lists item7 = new Lists("Wheel Chair Green" , 350.4, R.drawable.wheelhairgreen , "Add to bag");
        Lists item8 = new Lists("Crutche" , 130, R.drawable.crutche , "Add to bag");
        Lists item9 = new Lists("Crutches" , 110.6, R.drawable.crutches , "Add to bag");


        myList.add(item1);
        myList.add(item2);
        myList.add(item3);
        myList.add(item4);
        myList.add(item5);
        myList.add(item6);
        myList.add(item7);
        myList.add(item8);
        myList.add(item9);


        RecyclerView recycler = findViewById(R.id.enn);
        recycler.setHasFixedSize(true);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recycler.setLayoutManager(manager);

        ListsAdapter adapter = new ListsAdapter ( myList ,this);
        recycler.setAdapter(adapter);
    }
}




