package com.example.sefu.eventawesomeui.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.sefu.eventawesomeui.CreateEvent;
import com.example.sefu.eventawesomeui.GroupView;
import com.example.sefu.eventawesomeui.Home;
import com.example.sefu.eventawesomeui.ListView;
import com.example.sefu.eventawesomeui.R;
import com.example.sefu.eventawesomeui.model.DataLeftNavigationDrawerModel;

import java.util.ArrayList;

/**
 * Created by sefu on 8/2/2017.
 */

public class NavigationDrawerAdapter extends RecyclerView.Adapter<NavigationDrawerAdapter.MyViewHolder> {

    public ArrayList<DataLeftNavigationDrawerModel> dataSet;

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView navIcon;

        public MyViewHolder(View itemView) {
            super(itemView);

            this.navIcon = (ImageView) itemView.findViewById(R.id.iconLeft);
            navIcon.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            int pos = getAdapterPosition();
            if (pos == 0) {
                Intent intentHome = new Intent(v.getContext(), Home.class);
                v.getContext().startActivity(intentHome);
            }
            if (pos == 1) {
                Intent intentCreateView = new Intent(v.getContext(), CreateEvent.class);
                v.getContext().startActivity(intentCreateView);
            }

            if (pos == 2) {
                Intent intentGroupView = new Intent(v.getContext(), GroupView.class);
                v.getContext().startActivity(intentGroupView);
            }

            if (pos == 3) {
                Intent intentHome = new Intent(v.getContext(), Home.class);
                v.getContext().startActivity(intentHome);
            }

            if (pos == 4) {
                Intent intentListView = new Intent(v.getContext(), ListView.class);
                v.getContext().startActivity(intentListView);
            }

            if (pos == 5) {
                Intent intentHome = new Intent(v.getContext(), Home.class);
                v.getContext().startActivity(intentHome);
            }


            if (pos == 6) {
                Intent intentHome = new Intent(v.getContext(), Home.class);
                v.getContext().startActivity(intentHome);
            }


            if (pos == 7) {
                Intent intentHome = new Intent(v.getContext(), Home.class);
                v.getContext().startActivity(intentHome);
            }


            Toast.makeText(v.getContext(), "position:" + getPosition(), Toast.LENGTH_LONG).show();


        }
    }

    public NavigationDrawerAdapter(ArrayList<DataLeftNavigationDrawerModel> data) {
        this.dataSet = data;
    }

    @Override
    public NavigationDrawerAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                                   int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.navigation_drawer_item, parent, false);

        NavigationDrawerAdapter.MyViewHolder myViewHolder = new NavigationDrawerAdapter.MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final NavigationDrawerAdapter.MyViewHolder holder, final int listPosition) {

        ImageView imageViewProfilePic = holder.navIcon;

        imageViewProfilePic.setImageResource(dataSet.get(listPosition).getNavIcon());
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
