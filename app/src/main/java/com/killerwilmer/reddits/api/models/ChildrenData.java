package com.killerwilmer.reddits.api.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ChildrenData {

    @SerializedName("public_description")
    private String public_description;

    @SerializedName("key_color")
    private String key_color;

    @SerializedName("accounts_active")
    private Object accounts_active;

    @SerializedName("user_is_banned")
    private Object user_is_banned;

    @SerializedName("submit_text_label")
    private String submit_text_label;

    @SerializedName("user_is_muted")
    private Object user_is_muted;

    @SerializedName("public_description_html")
    private String public_description_html;

    @SerializedName("whitelist_status")
    private String whitelist_status;

    @SerializedName("user_is_subscriber")
    private Object user_is_subscriber;

    @SerializedName("icon_size")
    private List<Integer> icon_size;

    @SerializedName("id")
    private String id;

    @SerializedName("show_media")
    private boolean show_media;

    @SerializedName("created_utc")
    private int created_utc;

    @SerializedName("comment_score_hide_mins")
    private int comment_score_hide_mins;

    @SerializedName("header_title")
    private String header_title;

    @SerializedName("subscribers")
    private int subscribers;

    @SerializedName("created")
    private int created;

    @SerializedName("display_name")
    private String display_name;

    @SerializedName("user_is_contributor")
    private Object user_is_contributor;

    @SerializedName("submit_link_label")
    private Object submit_link_label;

    @SerializedName("banner_img")
    private String banner_img;

    @SerializedName("name")
    private String name;

    @SerializedName("description_html")
    private String description_html;

    @SerializedName("suggested_comment_sort")
    private Object suggested_comment_sort;

    @SerializedName("submit_text")
    private String submit_text;

    @SerializedName("accounts_active_is_fuzzed")
    private Object accounts_active_is_fuzzed;

    @SerializedName("public_traffic")
    private boolean public_traffic;

    @SerializedName("description")
    private String description;

    @SerializedName("title")
    private String title;

    @SerializedName("display_name_prefixed")
    private String display_name_prefixed;

    @SerializedName("submission_type")
    private String submission_type;

    @SerializedName("user_sr_theme_enabled")
    private boolean user_sr_theme_enabled;

    @SerializedName("spoilers_enabled")
    private boolean spoilers_enabled;

    @SerializedName("show_media_preview")
    private boolean show_media_preview;

    @SerializedName("lang")
    private String lang;

    @SerializedName("user_is_moderator")
    private Object user_is_moderator;

    @SerializedName("over18")
    private boolean over18;

    @SerializedName("banner_size")
    private List<Integer> banner_size;

    @SerializedName("subreddit_type")
    private String subreddit_type;

    @SerializedName("collapse_deleted_comments")
    private boolean collapse_deleted_comments;

    @SerializedName("header_size")
    private List<Integer> header_size;

    @SerializedName("advertiser_category")
    private String advertiser_category;

    @SerializedName("url")
    private String url;

    @SerializedName("header_img")
    private String header_img;

    @SerializedName("icon_img")
    private String icon_img;

    @SerializedName("submit_text_html")
    private String submit_text_html;

    @SerializedName("wiki_enabled")
    private boolean wiki_enabled;

    @SerializedName("quarantine")
    private boolean quarantine;

    @SerializedName("hide_ads")
    private boolean hide_ads;

    public String getPublic_description() {
        return this.public_description;
    }

    public void setPublic_description(String public_description) {
        this.public_description = public_description;
    }

    public String getKey_color() {
        return this.key_color;
    }

    public void setKey_color(String key_color) {
        this.key_color = key_color;
    }

    public Object getAccounts_active() {
        return this.accounts_active;
    }

    public void setAccounts_active(Object accounts_active) {
        this.accounts_active = accounts_active;
    }

    public Object getUser_is_banned() {
        return this.user_is_banned;
    }

    public void setUser_is_banned(Object user_is_banned) {
        this.user_is_banned = user_is_banned;
    }

    public String getSubmit_text_label() {
        return this.submit_text_label;
    }

    public void setSubmit_text_label(String submit_text_label) {
        this.submit_text_label = submit_text_label;
    }

    public Object getUser_is_muted() {
        return this.user_is_muted;
    }

    public void setUser_is_muted(Object user_is_muted) {
        this.user_is_muted = user_is_muted;
    }

    public String getPublic_description_html() {
        return this.public_description_html;
    }

    public void setPublic_description_html(String public_description_html) {
        this.public_description_html = public_description_html;
    }

    public String getWhitelist_status() {
        return this.whitelist_status;
    }

    public void setWhitelist_status(String whitelist_status) {
        this.whitelist_status = whitelist_status;
    }

    public Object getUser_is_subscriber() {
        return this.user_is_subscriber;
    }

    public void setUser_is_subscriber(Object user_is_subscriber) {
        this.user_is_subscriber = user_is_subscriber;
    }

    public List<Integer> getIcon_size() {
        return this.icon_size;
    }

    public void setIcon_size(List<Integer> icon_size) {
        this.icon_size = icon_size;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean getShow_media() {
        return this.show_media;
    }

    public void setShow_media(boolean show_media) {
        this.show_media = show_media;
    }

    public int getCreated_utc() {
        return this.created_utc;
    }

    public void setCreated_utc(int created_utc) {
        this.created_utc = created_utc;
    }

    public int getComment_score_hide_mins() {
        return this.comment_score_hide_mins;
    }

    public void setComment_score_hide_mins(int comment_score_hide_mins) {
        this.comment_score_hide_mins = comment_score_hide_mins;
    }

    public String getHeader_title() {
        return this.header_title;
    }

    public void setHeader_title(String header_title) {
        this.header_title = header_title;
    }

    public int getSubscribers() {
        return this.subscribers;
    }

    public void setSubscribers(int subscribers) {
        this.subscribers = subscribers;
    }

    public int getCreated() {
        return this.created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public String getDisplay_name() {
        return this.display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public Object getUser_is_contributor() {
        return this.user_is_contributor;
    }

    public void setUser_is_contributor(Object user_is_contributor) {
        this.user_is_contributor = user_is_contributor;
    }

    public Object getSubmit_link_label() {
        return this.submit_link_label;
    }

    public void setSubmit_link_label(Object submit_link_label) {
        this.submit_link_label = submit_link_label;
    }

    public String getBanner_img() {
        return this.banner_img;
    }

    public void setBanner_img(String banner_img) {
        this.banner_img = banner_img;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription_html() {
        return this.description_html;
    }

    public void setDescription_html(String description_html) {
        this.description_html = description_html;
    }

    public Object getSuggested_comment_sort() {
        return this.suggested_comment_sort;
    }

    public void setSuggested_comment_sort(Object suggested_comment_sort) {
        this.suggested_comment_sort = suggested_comment_sort;
    }

    public String getSubmit_text() {
        return this.submit_text;
    }

    public void setSubmit_text(String submit_text) {
        this.submit_text = submit_text;
    }

    public Object getAccounts_active_is_fuzzed() {
        return this.accounts_active_is_fuzzed;
    }

    public void setAccounts_active_is_fuzzed(Object accounts_active_is_fuzzed) {
        this.accounts_active_is_fuzzed = accounts_active_is_fuzzed;
    }

    public boolean getPublic_traffic() {
        return this.public_traffic;
    }

    public void setPublic_traffic(boolean public_traffic) {
        this.public_traffic = public_traffic;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDisplay_name_prefixed() {
        return this.display_name_prefixed;
    }

    public void setDisplay_name_prefixed(String display_name_prefixed) {
        this.display_name_prefixed = display_name_prefixed;
    }

    public String getSubmission_type() {
        return this.submission_type;
    }

    public void setSubmission_type(String submission_type) {
        this.submission_type = submission_type;
    }

    public boolean getUser_sr_theme_enabled() {
        return this.user_sr_theme_enabled;
    }

    public void setUser_sr_theme_enabled(boolean user_sr_theme_enabled) {
        this.user_sr_theme_enabled = user_sr_theme_enabled;
    }

    public boolean getSpoilers_enabled() {
        return this.spoilers_enabled;
    }

    public void setSpoilers_enabled(boolean spoilers_enabled) {
        this.spoilers_enabled = spoilers_enabled;
    }

    public boolean getShow_media_preview() {
        return this.show_media_preview;
    }

    public void setShow_media_preview(boolean show_media_preview) {
        this.show_media_preview = show_media_preview;
    }

    public String getLang() {
        return this.lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Object getUser_is_moderator() {
        return this.user_is_moderator;
    }

    public void setUser_is_moderator(Object user_is_moderator) {
        this.user_is_moderator = user_is_moderator;
    }

    public boolean getOver18() {
        return this.over18;
    }

    public void setOver18(boolean over18) {
        this.over18 = over18;
    }

    public List<Integer> getBanner_size() {
        return this.banner_size;
    }

    public void setBanner_size(List<Integer> banner_size) {
        this.banner_size = banner_size;
    }

    public String getSubreddit_type() {
        return this.subreddit_type;
    }

    public void setSubreddit_type(String subreddit_type) {
        this.subreddit_type = subreddit_type;
    }

    public boolean getCollapse_deleted_comments() {
        return this.collapse_deleted_comments;
    }

    public void setCollapse_deleted_comments(boolean collapse_deleted_comments) {
        this.collapse_deleted_comments = collapse_deleted_comments;
    }

    public List<Integer> getHeader_size() {
        return this.header_size;
    }

    public void setHeader_size(List<Integer> header_size) {
        this.header_size = header_size;
    }

    public String getAdvertiser_category() {
        return this.advertiser_category;
    }

    public void setAdvertiser_category(String advertiser_category) {
        this.advertiser_category = advertiser_category;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHeader_img() {
        return this.header_img;
    }

    public void setHeader_img(String header_img) {
        this.header_img = header_img;
    }

    public String getIcon_img() {
        return this.icon_img;
    }

    public void setIcon_img(String icon_img) {
        this.icon_img = icon_img;
    }

    public String getSubmit_text_html() {
        return this.submit_text_html;
    }

    public void setSubmit_text_html(String submit_text_html) {
        this.submit_text_html = submit_text_html;
    }

    public boolean getWiki_enabled() {
        return this.wiki_enabled;
    }

    public void setWiki_enabled(boolean wiki_enabled) {
        this.wiki_enabled = wiki_enabled;
    }

    public boolean getQuarantine() {
        return this.quarantine;
    }

    public void setQuarantine(boolean quarantine) {
        this.quarantine = quarantine;
    }

    public boolean getHide_ads() {
        return this.hide_ads;
    }

    public void setHide_ads(boolean hide_ads) {
        this.hide_ads = hide_ads;
    }
}
