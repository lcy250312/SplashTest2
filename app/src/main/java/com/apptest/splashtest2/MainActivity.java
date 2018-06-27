package com.apptest.splashtest2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button[] btns;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btns = new Button[6];
        for (int i = 0;i < btns.length; i++ )
        {
            String buttonID = "btn"+i;

            int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
            Log.i("btn",String.valueOf(resID));
            btns[i] = (Button) findViewById(resID);
            btns[i].setOnClickListener(this);
        }
    }

    public void zoom(View v){
        ImageView image = findViewById(R.id.imv1);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.zoom);
        image.startAnimation(animation);
    }

    public void clockwise(View v){
        ImageView image = findViewById(R.id.imv1);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.clockwise);
        image.startAnimation(animation);
    }

    public void blink(View v){
        ImageView image = findViewById(R.id.imv1);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.blink);
        image.startAnimation(animation);
    }

    public void move(View v){
        ImageView image = findViewById(R.id.imv1);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move);
        image.startAnimation(animation);
    }

    public void slide(View v){
        ImageView image = findViewById(R.id.imv1);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide);
        image.startAnimation(animation);
    }

    public void fade(View v){
        ImageView image = findViewById(R.id.imv1);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade);
        image.startAnimation(animation);
    }
    @Override
    public void onClick(View v) {
        String s = ((Button) v).getText().toString();
        switch(v.getId()){
            case R.id.btn0:
                zoom(v);
                break;
            case R.id.btn1:
                clockwise(v);
                break;
            case R.id.btn2:
                fade(v);
                break;
            case R.id.btn3:
                blink(v);
                break;
            case R.id.btn4:
                move(v);
                break;
            case R.id.btn5:
                slide(v);
                break;
        }
    }
}
