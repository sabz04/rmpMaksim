package com.example.martynov_4335_rmpimportfigmatoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class activityScrollThird extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_third);

        findViewById(R.id.scrollThirdSwipe).setOnTouchListener(new OnSwipeTouchListener(this){
            @Override
            public void onSwipeRight(){
                startActivity(new Intent(activityScrollThird.this, activity_scrollsecond.class));
            }
        });

        findViewById(R.id.scrollThirdBTN).setOnClickListener(v->{
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("www.google.com")));
        });
    }
}