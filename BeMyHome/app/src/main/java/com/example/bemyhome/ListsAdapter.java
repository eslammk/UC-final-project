package com.example.bemyhome;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListsAdapter extends RecyclerView.Adapter {

    ArrayList<Lists> myList ;
    Context context ;

    public ListsAdapter (ArrayList<Lists> myList , Context context ) {
        this.myList = myList ;
        this.context = context ;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent , false);
        ListsAdapter.ViewHolder enn = new ListsAdapter.ViewHolder(view);
        return enn ;

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        ((ListsAdapter.ViewHolder)holder).itemname.setText(myList.get(position).getNameeItem());
        ((ListsAdapter.ViewHolder)holder).itemprice.setText(myList.get(position).getPriceeItem() + " KD");
        ((ListsAdapter.ViewHolder)holder).itemimg.setImageResource(myList.get(position).getImggItem());
        ((ListsAdapter.ViewHolder)holder).vvv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,DetailssActivity.class);
                intent.putExtra("myList",myList.get(position));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return myList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView itemimg  ;
        public TextView itemname , itemprice ;
        public View vvv ;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            vvv = itemView ;

            itemname = vvv.findViewById(R.id.textnameb);
            itemprice = vvv.findViewById(R.id.textpriceb);
            itemimg = vvv.findViewById(R.id.imageViewb);
        }

    }


}

