package com.sand_corporation.www.pagingwithretrofit.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

public class Item {
    @SerializedName("owner")
    @Expose
    private List<Owner> owners;

    @SerializedName("is_accepted")
    @Expose
    private boolean is_accepted;

    @SerializedName("score")
    @Expose
    private int score;

    @SerializedName("last_activity_date")
    @Expose
    private long last_activity_date;

    @SerializedName("creation_date")
    @Expose
    private long creation_date;

    @SerializedName("answer_id")
    @Expose
    private long answer_id;

    @SerializedName("question_id")
    @Expose
    private long question_id;

    public Item() {

    }

    public List<Owner> getOwners() {
        return owners;
    }

    public void setOwners(List<Owner> owners) {
        this.owners = owners;
    }

    public boolean isIs_accepted() {
        return is_accepted;
    }

    public void setIs_accepted(boolean is_accepted) {
        this.is_accepted = is_accepted;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public long getLast_activity_date() {
        return last_activity_date;
    }

    public void setLast_activity_date(long last_activity_date) {
        this.last_activity_date = last_activity_date;
    }

    public long getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(long creation_date) {
        this.creation_date = creation_date;
    }

    public long getAnswer_id() {
        return answer_id;
    }

    public void setAnswer_id(long answer_id) {
        this.answer_id = answer_id;
    }

    public long getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(long question_id) {
        this.question_id = question_id;
    }
}
