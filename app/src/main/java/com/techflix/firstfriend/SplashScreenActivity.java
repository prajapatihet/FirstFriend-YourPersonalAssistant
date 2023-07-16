package com.techflix.firstfriend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class SplashScreenActivity extends AppCompatActivity {

    Button toMain;
    LottieAnimationView animationView,chat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        toMain = findViewById(R.id.toMainActivity);
        animationView = findViewById(R.id.newPage);
        chat = findViewById(R.id.chatbot);
        toMain.setOnClickListener((v)->{
            animationView.setVisibility(View.VISIBLE);
            toMain.setVisibility(View.INVISIBLE);
            chat.setVisibility(View.INVISIBLE);
            animationView.playAnimation();

            Thread td = new Thread(){
                public void run(){
                    try {
                        sleep(1000);
                    }catch (Exception e){
                        e.printStackTrace();
                    }finally {
                        startActivity(new Intent(SplashScreenActivity.this,MainActivity.class));
                        finish();
                    }
                }
            };td.start();

        });
    }
}