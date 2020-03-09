package com.example.animationfirst;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout cl=(ConstraintLayout)findViewById(R.id.thelayout);
        cl.setBackgroundResource(R.drawable.images);
        AnimationDrawable animationDrawable=(AnimationDrawable)cl.getBackground();
        animationDrawable.setEnterFadeDuration(1000);
        animationDrawable.setExitFadeDuration(1000);
        animationDrawable.start();

        ImageView imageView=(ImageView)findViewById(R.id.imageView);
        imageView.setBackgroundResource(R.drawable.imagesanimation);
        AnimationDrawable animationDrawable1=(AnimationDrawable)imageView.getBackground();
        animationDrawable1.setEnterFadeDuration(2000);
        animationDrawable1.setExitFadeDuration(2000);
        animationDrawable1.start();
    }
}
