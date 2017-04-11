package com.miramicodigo.sj_a_1_17_splashscreen_animations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    /**
     * @author Gustavo Lizarraga
     * @date 11-04-17
     * @version 1.0
     * */

    private ImageView ivOctocat;
    private ImageView ivOctocat_2;

    private Animation animacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivOctocat = (ImageView) findViewById(R.id.ivOctocat);
        ivOctocat_2 = (ImageView) findViewById(R.id.ivOctocat2);
    }

    public void zoomin(View v) {
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.zoom_in);
        ivOctocat.startAnimation(animacion);
    }

    public void zoomout(View v) {
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.zoom_out);
        ivOctocat.startAnimation(animacion);
    }

    public void fadein(View v) {
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.fade_in);
        ivOctocat.startAnimation(animacion);
    }

    public void fadeout(View v) {
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.fade_out);
        ivOctocat.startAnimation(animacion);
    }

    public void rotate(View v) {
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.rotate);
        ivOctocat.startAnimation(animacion);
    }

    public void move(View v) {
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.move);
        ivOctocat.startAnimation(animacion);
    }

    public void slideup(View v) {
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.slide_up);
        ivOctocat.startAnimation(animacion);
    }

    public void slidedown(View v) {
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.slide_down);
        ivOctocat.startAnimation(animacion);
    }

    public void blink(View v) {
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.blink);
        ivOctocat.startAnimation(animacion);
    }

    public void bounce(View v) {
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.bounce);
        ivOctocat.startAnimation(animacion);
    }

    public void crossfade(View v){
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.fade_in);
        Animation animacion2 = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.fade_out
        );
        ivOctocat.startAnimation(animacion2);
        ivOctocat_2.startAnimation(animacion);
    }

    public void sequential(View v) {
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.sequential);
        ivOctocat.startAnimation(animacion);
    }

    public void together(View v) {
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.together);
        ivOctocat.startAnimation(animacion);
    }

    public void stop(View v){
        ivOctocat.clearAnimation();
        ivOctocat_2.clearAnimation();
    }

}
