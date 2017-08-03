package com.example.sefu.eventawesomeui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.ImageView;

import com.example.sefu.eventawesomeui.adapter.NavigationDrawerAdapter;
import com.example.sefu.eventawesomeui.model.DataLeftNavigationDrawerModel;
import com.example.sefu.eventawesomeui.model.MyNavigationDrawerData;

import java.util.ArrayList;

public class NavigationDrawer extends AppCompatActivity {
    private static RecyclerView.Adapter adapter;

    private static RecyclerView recyclerView;


    private static ArrayList<DataLeftNavigationDrawerModel> data;


    static View.OnClickListener myOnClickListener;
    private static ArrayList<Integer> removedItems;

    ImageView closeNavigator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);

        setContentView(R.layout.activity_navigation_drawer);
        closeNavigator = (ImageView) findViewById(R.id.closeNavigator);
        closeNavigator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent closeNavigatorIntent = new Intent(getApplicationContext(), Home.class);
                startActivity(closeNavigatorIntent);
            }
        });

        //drawer left


        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);

        // First param is number of columns and second param is orientation i.e Vertical or Horizontal
        StaggeredGridLayoutManager gridLayoutManager =
                new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        // Attach the layout manager to the recycler view
        recyclerView.setLayoutManager(gridLayoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());

        data = new ArrayList<DataLeftNavigationDrawerModel>();
        for (int i = 0; i < MyNavigationDrawerData.navIcon.length; i++) {
            data.add(new DataLeftNavigationDrawerModel(
                    MyNavigationDrawerData.navIcon[i],
                    MyNavigationDrawerData.id_[i]
            ));
        }

        removedItems = new ArrayList<Integer>();


        adapter = new NavigationDrawerAdapter(data);
        recyclerView.setAdapter(adapter);


    }
}
