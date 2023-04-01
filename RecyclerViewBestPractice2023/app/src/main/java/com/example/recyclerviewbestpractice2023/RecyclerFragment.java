package com.example.recyclerviewbestpractice2023;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class RecyclerFragment extends Fragment {
RecyclerView recyclerView;
ArrayList<datamodel> dataHolder = new ArrayList<>();

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myView = inflater.inflate(R.layout.fragment_recycler, container, false);
        recyclerView = myView.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        datamodel ob1 = new datamodel(R.drawable.beware_image,"Beware Yourself","Otherwish I will kill you");
        dataHolder.add(ob1);
        datamodel ob2 = new datamodel(R.drawable.norwich_city,"Norwich City View","This is very Rich City in the World");
        dataHolder.add(ob2);
        datamodel ob3= new datamodel(R.drawable.not_allow,"Not Allow","I will not Allow You here");
        dataHolder.add(ob3);
        datamodel ob4 = new datamodel(R.drawable.password,"Passoword","Enter Your Strong Password");
        dataHolder.add(ob4);
        datamodel ob5=new datamodel(R.drawable.python,"Pyhon Programing","This is most Powerfull Programing Language");
        dataHolder.add(ob5);
        datamodel ob6=new datamodel(R.drawable.a,"A Programing Language","A is most Powerfull Programing Language");
        dataHolder.add(ob6);
        datamodel ob7=new datamodel(R.drawable.b,"Pyhon Programing","This is most Powerfull Programing Language");
        dataHolder.add(ob7);
        datamodel ob8=new datamodel(R.drawable.c,"HTML Programing","This is most Powerfull Programing Language");
        dataHolder.add(ob8);
        datamodel ob9=new datamodel(R.drawable.d,"C Programing","This is use to write Operating System");
        dataHolder.add(ob9);
        datamodel ob10=new datamodel(R.drawable.e,"C++ Programing","Most Powerfull Programing Language");
        dataHolder.add(ob10);
        datamodel ob11=new datamodel(R.drawable.f,"Java Programing","Used for Application Making");
        dataHolder.add(ob11);
        datamodel ob12=new datamodel(R.drawable.g,"KotlinPrograming","Android Programing Language");
        dataHolder.add(ob12);

        MyAdapter myAdapter = new MyAdapter(dataHolder);
        recyclerView.setAdapter(myAdapter);

        return myView;
    }
}