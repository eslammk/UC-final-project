package com.example.bemyhome;

import static android.content.Intent.*;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemAdapter extends RecyclerView.Adapter {

    ArrayList<Items> items ;
    Context context ;

    public ItemAdapter (ArrayList<Items> items , Context context ) {
        this.items = items ;
        this.context = context ;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent , false);
        ItemAdapter.ViewHolder en = new ItemAdapter.ViewHolder(view);
        return en;

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        ((ViewHolder)holder).itemname.setText(items.get(position).getNameItem());
        ((ViewHolder)holder).itemprice.setText(items.get(position).getPriceItem() + " KD");
        ((ViewHolder)holder).itemimg.setImageResource(items.get(position).getImgItem());
        ((ViewHolder)holder).v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,DetailsActivity.class);
                intent.putExtra("items",items.get(position));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView itemimg  ;
        public TextView itemname , itemprice ;
        public View v ;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            v = itemView ;

            itemname = v.findViewById(R.id.textnameb);
            itemprice = v.findViewById(R.id.textpriceb);
            itemimg = v.findViewById(R.id.imageViewb);
           // plus = v.findViewById(R.id.imageViewplus);


        }

    }


}



