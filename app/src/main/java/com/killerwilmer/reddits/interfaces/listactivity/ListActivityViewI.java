package com.killerwilmer.reddits.interfaces.listactivity;

import com.killerwilmer.reddits.persistence.entity.RedditEntity;

import io.realm.RealmResults;

/**
 * Created by killerwilmer on 25/02/17.
 */

public interface ListActivityViewI {

    void showProgressBar(boolean option);
    void showError(String error);
    void showReddisInList(RealmResults<RedditEntity> redditEntities);
    void setupRecycler();
}
