package com.killerwilmer.reddits.views.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.killerwilmer.reddits.R;
import com.killerwilmer.reddits.interfaces.listactivity.ListActivityPresenterI;
import com.killerwilmer.reddits.interfaces.listactivity.ListActivityViewI;
import com.killerwilmer.reddits.persistence.RealmController;
import com.killerwilmer.reddits.persistence.entity.RedditEntity;
import com.killerwilmer.reddits.presenters.ListActivityPresenterImpl;
import com.killerwilmer.reddits.utils.Constants;
import com.killerwilmer.reddits.views.adapters.ListRedditAdapter;
import com.killerwilmer.reddits.views.adapters.RealmRedditAdapter;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;

public class ListActivity extends AppCompatActivity implements ListActivityViewI {

    private Realm realm;
    private ListRedditAdapter adapter;
    private RecyclerView recycler;
    private ProgressBar progressBar;
    private ListActivityPresenterI presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        recycler = (RecyclerView) findViewById(R.id.recyclerListReddits);

        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder(this)
                .name(Constants.REALM_NAME_DB)
                .schemaVersion(0)
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(realmConfiguration);

        this.realm = RealmController.with(this).getRealm();

        presenter = new ListActivityPresenterImpl(this);
        presenter.getDataRedditPresenter();
    }

    @Override
    public void showReddisInList(RealmResults<RedditEntity> redditEntities) {
        RealmRedditAdapter realmAdapter = new RealmRedditAdapter(this.getApplicationContext(), redditEntities, true);
        adapter.setRealmAdapter(realmAdapter);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void setupRecycler() {
        recycler.setHasFixedSize(true);

        final LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recycler.setLayoutManager(layoutManager);

        adapter = new ListRedditAdapter(this);
        recycler.setAdapter(adapter);
    }

    @Override
    public void showProgressBar(boolean option) {
        if(option)
            progressBar.setVisibility(View.VISIBLE);
        else
            progressBar.setVisibility(View.GONE);
    }

    @Override
    public void showError(String error) {
        Toast.makeText(ListActivity.this, "Error: " + error, Toast.LENGTH_LONG).show();
    }
}
