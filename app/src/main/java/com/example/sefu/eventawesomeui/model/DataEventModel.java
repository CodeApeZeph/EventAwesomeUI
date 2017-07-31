package com.example.sefu.eventawesomeui.model;

/**
 * Created by sefu on 7/31/2017.
 */

public class DataEventModel {

    String eventName;
    String eventVenue;
    String eventTime;

    int userProfile;
    int id_;

    public DataEventModel(String eventName, String eventVenue, String eventTime, int userProfile, int id_) {
        this.eventName = eventName;
        this.eventVenue = eventVenue;
        this.eventTime = eventTime;
        this.userProfile = userProfile;
        this.id_ = id_;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventVenue() {
        return eventVenue;
    }

    public String getEventTime() {
        return eventTime;
    }

    public int getUserProfile() {
        return userProfile;
    }

    public int getId_() {
        return id_;
    }
}
