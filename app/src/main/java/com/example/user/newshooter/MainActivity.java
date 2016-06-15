package com.example.user.newshooter;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by user on 6/9/2016.
 */
public class MainActivity extends Activity {

    //ImageView image;
    //AnimationDrawable mAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer mPlayer = MediaPlayer.create(this, R.raw.zv);
        mPlayer.start(); // no need to call prepare(); create() does that for you
        SpaceShooterView.score = 0;
        SpaceShooterView.lives = 3;
        /*image = (ImageView)findViewById(R.id.imageView1);
        image.setBackgroundResource(R.drawable.animation_list);

        mAnim = (AnimationDrawable)image.getBackground();
        mAnim.start();*/
    }

    public void onStartButton(View v) {
        Intent intent = new Intent(this, SpaceShooterActivity.class);
        startActivity(intent);
    }
}