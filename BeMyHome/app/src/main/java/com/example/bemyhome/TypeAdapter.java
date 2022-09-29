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

public class TypeAdapter extends RecyclerView.Adapter {

    ArrayList<Types> type ;
    Context context ;

    public TypeAdapter (ArrayList<Types> type , Context context ) {
        this.type = type ;
        this.context = context ;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent , false);
        TypeAdapter.ViewHolder ennn = new TypeAdapter.ViewHolder(view);
        return ennn ;

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, @SuppressLint("RecyclerView")int position) {

        ((TypeAdapter.ViewHolder)holder).itemname.setText(type.get(position).getNameeeItem());
        ((TypeAdapter.ViewHolder)holder).itemprice.setText(type.get(position).getPriceeeItem() + " KD");
        ((TypeAdapter.ViewHolder)holder).itemimg.setImageResource(type.get(position).getImgeeItem());
        ((TypeAdapter.ViewHolder)holder).vv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,DetailsssActivity.class);
                intent.putExtra("type",type.get(position));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return type.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView itemimg  ;
        public TextView itemname , itemprice ;
        public View vv ;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            vv = itemView ;

            itemname =vv.findViewById(R.id.textnameb);
            itemprice = vv.findViewById(R.id.textpriceb);
            itemimg = vv.findViewById(R.id.imageViewb);
        }

    }


}

