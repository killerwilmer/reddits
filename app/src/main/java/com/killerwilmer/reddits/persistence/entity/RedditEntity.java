package com.killerwilmer.reddits.persistence.entity;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by killerwilmer on 26/02/17.
 */

public class RedditEntity extends RealmObject {
    @PrimaryKey
    private String id;
    private String icon_img;
    private String display_name;
    private String public_description;
    private String description_html;
    private String description;
    private String banner_img;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIcon_img() {
        return icon_img;
    }

    public void setIcon_img(String icon_img) {
        this.icon_img = icon_img;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getPublic_description() {
        return public_description;
    }

    public void setPublic_description(String public_description) {
        this.public_description = public_description;
    }

    public String getDescription_html() {
        return description_html;
    }

    public void setDescription_html(String description_html) {
        this.description_html = description_html;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBanner_img() {
        return banner_img;
    }

    public void setBanner_img(String banner_img) {
        this.banner_img = banner_img;
    }
}
