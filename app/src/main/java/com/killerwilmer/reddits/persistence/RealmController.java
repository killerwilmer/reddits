package com.killerwilmer.reddits.persistence;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;

import com.killerwilmer.reddits.api.models.RedditData;
import com.killerwilmer.reddits.persistence.entity.RedditEntity;

import io.realm.Realm;
import io.realm.RealmResults;

/**
 * Created by killerwilmer on 26/02/17.
 */

public class RealmController {

    private static RealmController instance;
    private final Realm realm;

    public RealmController(Application application) {
        realm = Realm.getDefaultInstance();
    }

    public static RealmController with(Fragment fragment) {
        if (instance == null) {
            instance = new RealmController(fragment.getActivity().getApplication());
        }
        return instance;
    }

    public static RealmController with(Activity activity) {
        if (instance == null) {
            instance = new RealmController(activity.getApplication());
        }
        return instance;
    }

    public static RealmController with(Application application) {
        if (instance == null) {
            instance = new RealmController(application);
        }
        return instance;
    }

    public static RealmController getInstance() {
        return instance;
    }

    public Realm getRealm() {
        return realm;
    }

    public void refresh() {
        realm.refresh();
    }


    public void saveData(RedditData redditData) {

        RedditEntity redditEntity = new RedditEntity();
        redditEntity.setId(redditData.getData().getId());
        redditEntity.setIcon_img(redditData.getData().getIcon_img());
        redditEntity.setDisplay_name(redditData.getData().getDisplay_name());
        redditEntity.setPublic_description(redditData.getData().getPublic_description());
        redditEntity.setDescription_html(redditData.getData().getDescription_html());
        redditEntity.setDescription(redditData.getData().getDescription());
        redditEntity.setBanner_img(redditData.getData().getBanner_img());

        realm.beginTransaction();
        realm.copyToRealmOrUpdate(redditEntity);
        realm.commitTransaction();
    }

    public RedditEntity getRedditById(String id) {
        return realm.where(RedditEntity.class).equalTo("id", id).findFirst();
    }

    public RealmResults<RedditEntity> getReddits() {
        return realm.where(RedditEntity.class).findAll();
    }
}
