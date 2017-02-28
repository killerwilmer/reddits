package com.killerwilmer.reddits.views.adapters;

import android.content.Context;

import com.killerwilmer.reddits.persistence.entity.RedditEntity;

import io.realm.RealmResults;

/**
 * Created by killerwilmer on 27/02/17.
 */

public class RealmRedditAdapter extends RealmModelAdapter<RedditEntity> {
    public RealmRedditAdapter(Context context, RealmResults<RedditEntity> realmResults, boolean automaticUpdate) {
        super(context, realmResults, automaticUpdate);
    }
}
