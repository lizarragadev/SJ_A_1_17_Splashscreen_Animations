package com.miramicodigo.sj_a_1_17_splashscreen_animations;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashscreenActivity extends AppCompatActivity {

    /**
     * @author Gustavo Lizarraga
     * @date 11-04-17
     * @version 1.0
     * */

    private ImageView ivLogo;
    private Animation animacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splashscreen);

        ivLogo = (ImageView) findViewById(R.id.ivLogotipo);

        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.splashscreen
        );
        ivLogo.startAnimation(animacion);
        animacion.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent i = new Intent(
                        getApplicationContext(),
                        MainActivity.class
                );
                startActivity(i);
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }
}
