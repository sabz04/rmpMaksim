package com.example.martynov_4335_rmpimportfigmatoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        findViewById(R.id.secondSwipe).setOnTouchListener(new OnSwipeTouchListener(this){
            @Override
            public void onSwipeLeft(){
                startActivity(new Intent(SecondActivity.this,ThirdActivity.class));
            }
            @Override
            public void onSwipeRight(){
                startActivity(new Intent(SecondActivity.this,StartActivity.class));
            }
            @Override
            public  void  onSwipeDown() {
                startActivity(new Intent(SecondActivity.this, activity_scrollfirst.class));
            }
        });
    }
    public void OnClickThird(View view){
        Intent intent = new Intent(this,activity_scrollfirst.class);
        startActivity(intent);
    }
}