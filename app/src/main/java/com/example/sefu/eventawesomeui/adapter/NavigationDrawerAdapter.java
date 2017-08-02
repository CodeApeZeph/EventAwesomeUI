package com.example.sefu.eventawesomeui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.sefu.eventawesomeui.R;
import com.example.sefu.eventawesomeui.model.DataLeftNavigationDrawerModel;

import java.util.ArrayList;

/**
 * Created by sefu on 8/2/2017.
 */

public class NavigationDrawerAdapter extends RecyclerView.Adapter<NavigationDrawerAdapter.MyViewHolder> {

    public ArrayList<DataLeftNavigationDrawerModel> dataSet;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView navIcon;

        public MyViewHolder(View itemView) {
            super(itemView);

            this.navIcon = (ImageView) itemView.findViewById(R.id.iconLeft);
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
