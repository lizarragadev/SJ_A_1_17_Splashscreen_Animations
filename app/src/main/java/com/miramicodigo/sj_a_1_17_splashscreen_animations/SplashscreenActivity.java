package com.miramicodigo.sj_a_1_17_splashscreen_animations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class SplashscreenActivity extends AppCompatActivity {

    /**
     * @author Gustavo Lizarraga
     * @date 11-04-17
     * @version 1.0
     * */

    private ImageView ivLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        ivLogo = (ImageView) findViewById(R.id.ivLogotipo);

    }
}
