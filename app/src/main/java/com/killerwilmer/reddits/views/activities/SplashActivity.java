package com.killerwilmer.reddits.views.activities;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.killerwilmer.reddits.R;
import com.killerwilmer.reddits.utils.Constants;
import com.killerwilmer.reddits.utils.Utils;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(() -> {
            Utils.sendIntent(this , ListActivity.class);
            finish();
        }, Constants.SPLASH_DELAY);

    }
}
