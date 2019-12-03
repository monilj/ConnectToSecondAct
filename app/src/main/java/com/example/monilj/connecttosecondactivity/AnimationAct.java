package com.example.monilj.connecttosecondactivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class AnimationAct extends AppCompatActivity {

    private AnimationDrawable batAnimation;
    private ImageView batImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        batImage = (ImageView) findViewById(R.id.batId);
//        batImage.setBackgroundResource(R.drawable.bat_anim);
//        batAnimation= (AnimationDrawable) batImage.getBackground();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
       // batAnimation.start();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Animation startAnimation = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.fadin_animation);
                batImage.startAnimation(startAnimation);
//            batAnimation.stop();
            }
        },50);
        return super.onTouchEvent(event);
    }
}
