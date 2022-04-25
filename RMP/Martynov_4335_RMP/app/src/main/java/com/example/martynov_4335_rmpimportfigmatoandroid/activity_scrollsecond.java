package com.example.martynov_4335_rmpimportfigmatoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class activity_scrollsecond extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrollsecond);
        findViewById(R.id.secondScrollSwipe).setOnTouchListener(new OnSwipeTouchListener(this){
            @Override
            public void onSwipeLeft(){
                startActivity(new Intent(activity_scrollsecond.this, activityScrollThird.class));
            }
            @Override
            public void onSwipeRight(){
                startActivity(new Intent(activity_scrollsecond.this, activity_scrollfirst.class));
            }
        });
               findViewById(R.id.scrollSecondBTN).setOnClickListener(v -> {
                   startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("www.google.com")));
               });
    }
}