package com.receiptify;


import android.os.Bundle;
import com.getbase.floatingactionbutton.FloatingActionsMenu;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import static android.graphics.Color.argb;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        createFabMenu();

    }

    void createFabMenu(){

        final FloatingActionsMenu menuMultipleActions = findViewById(R.id.multiple_actions);

        com.getbase.floatingactionbutton.FloatingActionButton takePhoto = new com.getbase.floatingactionbutton.FloatingActionButton(getBaseContext());
        takePhoto.setColorNormal(argb(255,255,0,0));
        takePhoto.setTitle("take a photo");
        takePhoto.setOnClickListener(v -> {
            //startCamera(); <-TODO: create a method for taking photos
            Log.i("application-status","Start Camera!");
            menuMultipleActions.collapse();});


        com.getbase.floatingactionbutton.FloatingActionButton loadPhoto = new com.getbase.floatingactionbutton.FloatingActionButton(getBaseContext());
        loadPhoto.setColorNormal(argb(255,0,255,0));
        loadPhoto.setTitle("point app to an existing photo from the phone's storage");
        loadPhoto.setOnClickListener(v -> {
            //startGalleryChooser(); <-TODO: create a method for choosing from gallery
            Log.i("application-status","Start Gallery Chooser!");
            menuMultipleActions.collapse();});



        menuMultipleActions.addButton(takePhoto);
        menuMultipleActions.addButton(loadPhoto);

    }



}
