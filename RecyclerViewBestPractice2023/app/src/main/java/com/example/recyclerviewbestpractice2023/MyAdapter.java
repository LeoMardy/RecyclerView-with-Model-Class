package com.example.recyclerviewbestpractice2023;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyAdapter extends RecyclerView.Adapter <MyAdapter.MyViewHolder>{
    public class MyViewHolder extends RecyclerView.ViewHolder{

        CircleImageView recycler_ImageViewID;
        MaterialTextView recycler_TextViewHeader,recycler_TextViewDesc;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            recycler_ImageViewID =itemView.findViewById(R.id.recycler_ImageViewID);
            recycler_TextViewHeader =itemView.findViewById(R.id.recycler_TextViewHeader);
            recycler_TextViewDesc = itemView.findViewById(R.id.recycler_TextViewDesc);
        }
    }

    ArrayList<datamodel> dataholder;

    public MyAdapter(ArrayList<datamodel> dataholder) {
        this.dataholder = dataholder;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
     View myView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new MyViewHolder(myView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
     holder.recycler_ImageViewID.setImageResource(dataholder.get(position).getImages());
     holder.recycler_TextViewHeader.setText(dataholder.get(position).getHeader());
     holder.recycler_TextViewDesc.setText(dataholder.get(position).getDesc());
    }

    @Override
    public int getItemCount() {
        return dataholder.size();
    }


}
