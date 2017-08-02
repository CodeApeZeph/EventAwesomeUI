package com.example.sefu.eventawesomeui.model;

/**
 * Created by sefu on 8/2/2017.
 */

public class DataRightNavigationDrawerModel {
    int navIcon;
    int id_;

    public DataRightNavigationDrawerModel(int navIcon, int id_) {
        this.navIcon = navIcon;
        this.id_ = id_;
    }

    public int getNavIcon() {
        return navIcon;
    }

    public int getId_() {
        return id_;
    }
}
