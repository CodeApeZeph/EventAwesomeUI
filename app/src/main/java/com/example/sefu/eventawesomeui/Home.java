package com.example.sefu.eventawesomeui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.sefu.eventawesomeui.adapter.HomeEventAdapter;
import com.example.sefu.eventawesomeui.model.DataEventModel;
import com.example.sefu.eventawesomeui.model.MyEventData;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    private static RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private static RecyclerView recyclerView;
    private static ArrayList<DataEventModel> data;

    static View.OnClickListener myOnClickListener;
    private static ArrayList<Integer> removedItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view_two);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        data = new ArrayList<DataEventModel>();
        for (int i = 0; i < MyEventData.eventNameArray.length; i++) {
            data.add(new DataEventModel(
                    MyEventData.eventNameArray[i],
                    MyEventData.eventVenueArray[i],
                    MyEventData.eventTimeArray[i],
                    MyEventData.userProfileArray[i],
                    MyEventData.id_[i]
            ));
        }

        removedItems = new ArrayList<Integer>();

        RecyclerView.ItemDecoration itemDecoration = new
                DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(itemDecoration);


        adapter = new HomeEventAdapter(data);
        recyclerView.setAdapter(adapter);
    }
}
