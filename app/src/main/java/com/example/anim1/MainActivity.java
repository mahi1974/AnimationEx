package com.example.anim1;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
ImageView img;
Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=findViewById(R.id.imageView);
        btn1=findViewById(R.id.fadeout);
        btn2=findViewById(R.id.fadein);
        btn3=findViewById(R.id.zoomout);
        btn4=findViewById(R.id.zoomin);
        btn5=findViewById(R.id.bounce);
        btn6=findViewById(R.id.Rotate);
        btn7=findViewById(R.id.cross_fadding);
        btn8=findViewById(R.id.Slideup);
        btn9=findViewById(R.id.Slidedown);
        btn10=findViewById(R.id.move);
        btn11=findViewById(R.id.Sequential);
        btn12=findViewById(R.id.Together);
        btn13=findViewById(R.id.Blink);
        btn14=findViewById(R.id.Stop_Animation);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation fd= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);
                img.startAnimation(fd);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation fd1= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
                img.startAnimation(fd1);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation z1=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
                img.startAnimation(z1);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation z2=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in);
                img.startAnimation(z2);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation b1=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce);
                img.startAnimation(b1);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation z1=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                img.startAnimation(z1);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation s1=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slideup);
                img.startAnimation(s1);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation s2=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slidedown);
                img.startAnimation(s2);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation m1=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
                img.startAnimation(m1);
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation z1=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
                img.startAnimation(z1);
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation z1=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                img.startAnimation(z1);
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation z1=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
                img.startAnimation(z1);
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.clearAnimation();
            }
        });
    }
}