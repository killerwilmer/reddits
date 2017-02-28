package com.killerwilmer.reddits.presenters;

import android.app.Activity;

import com.killerwilmer.reddits.interactors.ListActivityInteractorImpl;
import com.killerwilmer.reddits.interfaces.listactivity.ListActivityInteractorI;
import com.killerwilmer.reddits.interfaces.listactivity.ListActivityPresenterI;
import com.killerwilmer.reddits.interfaces.listactivity.ListActivityViewI;
import com.killerwilmer.reddits.persistence.entity.RedditEntity;

import io.realm.RealmResults;

/**
 * Created by killerwilmer on 25/02/17.
 */

public class ListActivityPresenterImpl implements ListActivityPresenterI {

    private ListActivityViewI view;
    private ListActivityInteractorI interactor;

    public ListActivityPresenterImpl(ListActivityViewI view) {
        this.view = view;
        interactor = new ListActivityInteractorImpl(this);
    }

    @Override
    public void showErrorPresenter(String error) {
        if (view != null) {
            view.showProgressBar(false);
            view.showError(error);
        }
    }

    @Override
    public void getDataRedditPresenter() {
        if(view != null)
        {
            view.showProgressBar(true);
            interactor.getDataYoutubeInteractor((Activity) this.view);

        }
    }

    @Override
    public void showReddisInList(RealmResults<RedditEntity> redditEntities) {
        view.showReddisInList(redditEntities);
        view.showProgressBar(false);
    }

    @Override
    public void setupRecyclerPresenter() {
        view.setupRecycler();
    }

}
