package com.killerwilmer.reddits.api.models;

import com.google.gson.annotations.SerializedName;

public class Reddit {

    @SerializedName("data")
    private Data data;

    @SerializedName("kind")
    private String kind;

    public Data getData() {
        return this.data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
