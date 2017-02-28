package com.killerwilmer.reddits.api.models;

import com.google.gson.annotations.SerializedName;

public class RedditData {

    @SerializedName("data")
    private ChildrenData data;

    @SerializedName("kind")
    private String kind;

    public ChildrenData getData() {
        return this.data;
    }

    public void setData(ChildrenData data) {
        this.data = data;
    }

    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
