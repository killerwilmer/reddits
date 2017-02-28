package com.killerwilmer.reddits.interfaces.listactivity;

import android.app.Activity;

import com.killerwilmer.reddits.persistence.entity.RedditEntity;

import io.realm.RealmResults;

/**
 * Created by killerwilmer on 25/02/17.
 */

public interface ListActivityInteractorI {

    void getDataYoutubeInteractor(Activity activity);
    void loadReddisInList(RealmResults<RedditEntity> redditEntity);
}
