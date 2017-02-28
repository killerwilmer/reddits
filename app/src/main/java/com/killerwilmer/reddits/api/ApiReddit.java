package com.killerwilmer.reddits.api;

import com.killerwilmer.reddits.api.models.Reddit;
import com.killerwilmer.reddits.utils.Constants;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by killerwilmer on 24/02/17.
 */

public interface ApiReddit {

    @GET(Constants.END_URL)
    Observable<Reddit> getReddit(@Query(Constants.QUERY_LIMIT) int limit);
}
