package com.killerwilmer.reddits.views.activities;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.ImageView;

import com.killerwilmer.reddits.R;
import com.killerwilmer.reddits.persistence.RealmController;
import com.killerwilmer.reddits.persistence.entity.RedditEntity;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import io.realm.Realm;
import us.feras.mdv.MarkdownView;


public class DetailRedditActivity extends AppCompatActivity {

    private Realm realm;
    private ImageView iconReddit;
    private MarkdownView htmlTextView;
    private Toolbar toolbar;
    private AppBarLayout appBarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_reddit);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        appBarLayout = (AppBarLayout) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        this.realm = RealmController.with(this).getRealm();

        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            toolbar.setNavigationOnClickListener(v -> finish());
        }

        Bundle bundle = getIntent().getExtras();
        String reddit_id = bundle.getString("reddit_id");
        RedditEntity redditEntity = RealmController.with(getApplication()).getRedditById(reddit_id);
        Log.d("app_id", redditEntity.getDisplay_name());
        loadDetailInfo(redditEntity);
    }

    public void loadDetailInfo(RedditEntity redditEntity) {
        toolbar.setTitle(redditEntity.getDisplay_name());
        iconReddit = (ImageView) findViewById(R.id.fab);
        htmlTextView = (MarkdownView) findViewById(R.id.html_text);


        if (redditEntity.getIcon_img() != "" && redditEntity.getIcon_img() != null && !redditEntity.getIcon_img().isEmpty()) {
            Picasso.with(getApplicationContext()).load(redditEntity.getIcon_img()).into(iconReddit);
        }
        htmlTextView.loadMarkdown(redditEntity.getDescription(),"file:///android_asset/paperwhite.css");
        if (redditEntity.getBanner_img() != "" && redditEntity.getBanner_img() != null && !redditEntity.getBanner_img().isEmpty()) {
            Picasso.with(getApplicationContext()).load(redditEntity.getIcon_img()).into(iconReddit);
            Picasso.with(this).load(redditEntity.getBanner_img()).into(new Target() {
                @Override
                public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {
                    appBarLayout.setBackground(new BitmapDrawable(bitmap));
                }

                @Override
                public void onBitmapFailed(Drawable errorDrawable) {

                }

                @Override
                public void onPrepareLoad(Drawable placeHolderDrawable) {

                }
            });
        }
    }
}
