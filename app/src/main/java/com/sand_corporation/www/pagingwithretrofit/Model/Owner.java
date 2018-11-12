package com.sand_corporation.www.pagingwithretrofit.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Owner {

    @SerializedName("reputation")
    @Expose
    private int reputation;

    @SerializedName("user_id")
    @Expose
    private int user_id;

    @SerializedName("user_type")
    @Expose
    private String user_type;

    @SerializedName("profile_image")
    @Expose
    private String profile_image;

    @SerializedName("display_name")
    @Expose
    private String display_name;

    @SerializedName("link")
    @Expose
    private String link;


    public Owner() {

    }

    public int getReputation() {
        return reputation;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
