package com.example.animation;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btntranslate, btnalpha, btnscale, btnrotate;
    TextView txtanim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       txtanim = findViewById(R.id.anim);

        btntranslate = findViewById(R.id.btntranslate);
        btnalpha = findViewById(R.id.btnalpha);
        btnscale = findViewById(R.id.btnscale);
        btnrotate = findViewById(R.id.btnrotate);

                btntranslate.setOnClickListener(view -> {

                    Animation move = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);

                    txtanim.startAnimation(move);

                });

                btnalpha.setOnClickListener(view -> {
                    Animation alpha = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                    txtanim.startAnimation(alpha);
                });

                btnrotate.setOnClickListener(view -> {
                     Animation rotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);

                     txtanim.startAnimation(rotate);
                });

                btnscale.setOnClickListener(view -> {
                    Animation scale = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale);

                    txtanim.startAnimation(scale);
                });
    }
}