package com.example.martynov_4335_rmpimportfigmatoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class activity_scrollfirst extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrollfirst);
        findViewById(R.id.scrollFirstSwipe).setOnTouchListener(new OnSwipeTouchListener(this){
            @Override
            public void onSwipeLeft(){
                startActivity(new Intent(activity_scrollfirst.this, activity_scrollsecond.class));
            }
            @Override
            public void onSwipeRight(){
                startActivity(new Intent(activity_scrollfirst.this, SecondActivity.class));
            }
            @Override
            public  void  onSwipeUp(){
                startActivity(new Intent(activity_scrollfirst.this, SecondActivity.class));
            }
        });
        findViewById(R.id.scrollFrBTN).setOnClickListener(v->{
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com")));
        });
    }
}