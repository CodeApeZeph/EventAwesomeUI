package com.example.sefu.eventawesomeui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class CreateEvent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
        setContentView(R.layout.activity_create_event);
    }
}
