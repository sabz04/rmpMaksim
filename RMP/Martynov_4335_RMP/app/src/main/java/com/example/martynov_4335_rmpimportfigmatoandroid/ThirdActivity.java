package com.example.martynov_4335_rmpimportfigmatoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        findViewById(R.id.thirdSwipe).setOnTouchListener(new OnSwipeTouchListener(this){
            @Override
            public void onSwipeLeft() {
                startActivity(new Intent(ThirdActivity.this, FourthActivity.class));
            }
            @Override
            public void onSwipeRight() {
                startActivity(new Intent(ThirdActivity.this, SecondActivity.class));
            }
        });
        findViewById(R.id.buttonGo).setOnClickListener(v->{
            startActivity(new Intent(ThirdActivity.this, FourthActivity.class));
        });
    }

}