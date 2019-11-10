package com.vivek.recyclerviewmultipleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Model> list= new ArrayList<>();
        list.add(new Model(Model.TEXT_TYPE,"Hello. This is the Text View Type",0));
        list.add(new Model(Model.RADIO_TYPE,"Hi. This is the Radio Button View Type",0));
        list.add(new Model(Model.IMAGE_TYPE,"Hey. This is the Image View Type",R.drawable.one));
        list.add(new Model(Model.RATING_TYPE,"Hi again. This is the Rating Bar View Type",3));

        list.add(new Model(Model.TEXT_TYPE,"Hello. This is the Text View Type",0));
        list.add(new Model(Model.RADIO_TYPE,"Hi. This is the Radio Button View Type",0));
        list.add(new Model(Model.IMAGE_TYPE,"Hey. This is the Image View Type",R.drawable.two));
        list.add(new Model(Model.RATING_TYPE,"Hi again. This is the Rating Bar View Type",2));

        list.add(new Model(Model.TEXT_TYPE,"Hello. This is the Text View Type",0));
        list.add(new Model(Model.RADIO_TYPE,"Hi. This is the Radio Button View Type",1));
        list.add(new Model(Model.IMAGE_TYPE,"Hey. This is the Image View Type",R.drawable.three));
        list.add(new Model(Model.RATING_TYPE,"Hi again. This is the Rating Bar View Type",5));

        list.add(new Model(Model.TEXT_TYPE,"Hello. This is the Text View Type",0));
        list.add(new Model(Model.RADIO_TYPE,"Hi. This is the Radio Button View Type",0));
        list.add(new Model(Model.IMAGE_TYPE,"Hey. This is the Image View Type",R.drawable.four));
        list.add(new Model(Model.RATING_TYPE,"Hi again. This is the Rating Bar View Type",1));

        list.add(new Model(Model.TEXT_TYPE,"Hello. This is the Text View Type",0));
        list.add(new Model(Model.RADIO_TYPE,"Hi. This is the Radio Button View Type",1));
        list.add(new Model(Model.IMAGE_TYPE,"Hey. This is the Image View Type",R.drawable.five));
        list.add(new Model(Model.RATING_TYPE,"Hi again. This is the Rating Bar View Type",4));

        list.add(new Model(Model.TEXT_TYPE,"Hello. This is the Text View Type",0));
        list.add(new Model(Model.RADIO_TYPE,"Hi. This is the Radio Button View Type",0));
        list.add(new Model(Model.IMAGE_TYPE,"Hey. This is the Image View Type",R.drawable.six));
        list.add(new Model(Model.RATING_TYPE,"Hi again. This is the Rating Bar View Type",3));

        list.add(new Model(Model.TEXT_TYPE,"Hello. This is the Text View Type",0));
        list.add(new Model(Model.RADIO_TYPE,"Hi. This is the Radio Button View Type",1));
        list.add(new Model(Model.IMAGE_TYPE,"Hey. This is the Image View Type",R.drawable.seven));
        list.add(new Model(Model.RATING_TYPE,"Hi again. This is the Rating Bar View Type",2));

        list.add(new Model(Model.TEXT_TYPE,"Hello. This is the Text View Type",0));
        list.add(new Model(Model.RADIO_TYPE,"Hi. This is the Radio Button View Type",0));
        list.add(new Model(Model.IMAGE_TYPE,"Hey. This is the Image View Type",R.drawable.eight));
        list.add(new Model(Model.RATING_TYPE,"Hi again. This is the Rating Bar View Type",1));

        list.add(new Model(Model.TEXT_TYPE,"Hello. This is the Text View Type",0));
        list.add(new Model(Model.RADIO_TYPE,"Hi. This is the Radio Button View Type",0));
        list.add(new Model(Model.IMAGE_TYPE,"Hey. This is the Image View Type",R.drawable.nine));
        list.add(new Model(Model.RATING_TYPE,"Hi again. This is the Rating Bar View Type",5));

        list.add(new Model(Model.TEXT_TYPE,"Hello. This is the Text View Type",0));
        list.add(new Model(Model.RADIO_TYPE,"Hi. This is the Radio Button View Type",1));
        list.add(new Model(Model.IMAGE_TYPE,"Hey. This is the Image View Type",R.drawable.ten));
        list.add(new Model(Model.RATING_TYPE,"Hi again. This is the Rating Bar View Type",4));

        MultiViewTypeAdapter adapter = new MultiViewTypeAdapter(list,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, OrientationHelper.VERTICAL, false);

        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);




    }
}
