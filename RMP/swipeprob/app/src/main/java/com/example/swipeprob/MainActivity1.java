package com.example.swipeprob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        findViewById(R.id.button).setOnClickListener(v -> {

            startActivity(new Intent(this, MainActivity3.class));
        });

        findViewById(R.id.swipela).setOnTouchListener(new OnSwipeTouchListener(this){
            @Override
            public void onSwipeLeft() {
                Intent switcher=new Intent(MainActivity1.this,MainActivity3.class);
                startActivity(switcher);
            }
        });
    }
}