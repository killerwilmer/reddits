package com.killerwilmer.reddits.api.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {

    @SerializedName("modhash")
    private String modhash;

    @SerializedName("children")
    private List<RedditData> children;

    @SerializedName("before")
    private Object before;

    @SerializedName("after")
    private String after;

    public String getModhash() {
        return this.modhash;
    }

    public void setModhash(String modhash) {
        this.modhash = modhash;
    }

    public List<RedditData> getChildren() {
        return this.children;
    }

    public void setChildren(List<RedditData> children) {
        this.children = children;
    }

    public Object getBefore() {
        return this.before;
    }

    public void setBefore(Object before) {
        this.before = before;
    }

    public String getAfter() {
        return this.after;
    }

    public void setAfter(String after) {
        this.after = after;
    }
}
