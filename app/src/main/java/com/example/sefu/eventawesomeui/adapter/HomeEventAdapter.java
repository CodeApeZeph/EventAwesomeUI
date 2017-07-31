package com.example.sefu.eventawesomeui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sefu.eventawesomeui.R;
import com.example.sefu.eventawesomeui.model.DataEventModel;

import java.util.ArrayList;

/**
 * Created by sefu on 7/31/2017.
 */

public class HomeEventAdapter extends RecyclerView.Adapter<HomeEventAdapter.MyViewHolder> {

    private ArrayList<DataEventModel> dataSet;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textViewEventName;
        TextView textViewEventVenue;
        TextView textViewEventTime;
        ImageView imageViewProfilePic;


        public MyViewHolder(View itemView) {
            super(itemView);

            this.textViewEventName = (TextView) itemView.findViewById(R.id.event);
            this.textViewEventVenue = (TextView) itemView.findViewById(R.id.venue);
            this.textViewEventTime = (TextView) itemView.findViewById(R.id.eventTime);
            this.imageViewProfilePic = (ImageView) itemView.findViewById(R.id.profile);
        }
    }

    public HomeEventAdapter(ArrayList<DataEventModel> data) {
        this.dataSet = data;
    }

    @Override
    public HomeEventAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                            int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.home_event_item, parent, false);

        HomeEventAdapter.MyViewHolder myViewHolder = new HomeEventAdapter.MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final HomeEventAdapter.MyViewHolder holder, final int listPosition) {

        TextView textViewEventName = holder.textViewEventName;
        TextView textViewEventVenue = holder.textViewEventVenue;
        TextView textViewEventTime = holder.textViewEventTime;
        ImageView imageViewProfilePic = holder.imageViewProfilePic;

        textViewEventName.setText(dataSet.get(listPosition).getEventName());
        textViewEventVenue.setText(dataSet.get(listPosition).getEventVenue());
        textViewEventTime.setText(dataSet.get(listPosition).getEventTime());
        imageViewProfilePic.setImageResource(dataSet.get(listPosition).getUserProfile());
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
