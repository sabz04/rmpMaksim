package com.example.martynov_4335_rmpimportfigmatoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);


        findViewById(R.id.fourthSwipe).setOnTouchListener(new OnSwipeTouchListener(this){
            @Override
            public void onSwipeLeft(){
                startActivity(new Intent(FourthActivity.this,activity_scrollfirst.class));
            }
            @Override
            public void onSwipeRight(){
                startActivity(new Intent(FourthActivity.this,ThirdActivity.class));
            }
        });
    }
}