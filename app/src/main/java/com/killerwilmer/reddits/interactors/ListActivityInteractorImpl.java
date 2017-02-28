package com.killerwilmer.reddits.interactors;

import android.app.Activity;
import android.util.Log;

import com.killerwilmer.reddits.api.ApiReddit;
import com.killerwilmer.reddits.api.models.RedditData;
import com.killerwilmer.reddits.api.service.ServiceFactory;
import com.killerwilmer.reddits.interfaces.listactivity.ListActivityInteractorI;
import com.killerwilmer.reddits.interfaces.listactivity.ListActivityPresenterI;
import com.killerwilmer.reddits.persistence.RealmController;
import com.killerwilmer.reddits.persistence.entity.RedditEntity;
import com.killerwilmer.reddits.utils.Constants;
import com.killerwilmer.reddits.utils.Network;
import com.killerwilmer.reddits.utils.Utils;

import io.realm.RealmResults;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by killerwilmer on 25/02/17.
 */

public class ListActivityInteractorImpl implements ListActivityInteractorI {

    private ListActivityPresenterI presenter;

    public ListActivityInteractorImpl(ListActivityPresenterI presenter) {
        this.presenter = presenter;
    }

    @Override
    public void getDataYoutubeInteractor(Activity activity) {
        boolean hasInternet = Network.hasInternet(activity);
        presenter.setupRecyclerPresenter();

        if(hasInternet) {
            ApiReddit service = ServiceFactory.createRetrofitService(ApiReddit.class, Constants.BASE_URL);
            service.getReddit(Constants.NUM_LIMIT)
                    .concatMap(reddit -> rx.Observable.from(reddit.getData().getChildren()))
                    .subscribeOn(Schedulers.newThread())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Subscriber<RedditData>() {
                        @Override
                        public final void onCompleted() {
                            RealmResults<RedditEntity> redditResults = RealmController.with(activity.getApplication()).getReddits();
                            presenter.showReddisInList(redditResults);
                        }

                        @Override
                        public final void onError(Throwable e) {
                            presenter.showErrorPresenter(e.getMessage());
                        }

                        @Override
                        public void onNext(RedditData redditData) {
                            Log.e("Data", redditData.getData().getId());
                            RealmController.with(activity).saveData(redditData);
                        }

                    });
        } else {
            Log.i("Red", "No hay red");
            Utils.showDialog(activity, "Información", "Modo offline");
            RealmResults<RedditEntity> redditResults = RealmController.with(activity.getApplication()).getReddits();
            presenter.showReddisInList(redditResults);
        }
    }

    @Override
    public void loadReddisInList(RealmResults<RedditEntity> redditEntity) {

    }

}
