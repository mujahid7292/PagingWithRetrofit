package com.sand_corporation.www.pagingwithretrofit.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class StackAPIResponse {

    @SerializedName("items")
    @Expose
    private List<Item> items;

    @SerializedName("has_more")
    @Expose
    private boolean hasMore;

    @SerializedName("quota_max")
    @Expose
    private int maxQuota;

    @SerializedName("quota_remaining")
    @Expose
    private boolean remainingQuota;

    public StackAPIResponse() {

    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public int getMaxQuota() {
        return maxQuota;
    }

    public void setMaxQuota(int maxQuota) {
        this.maxQuota = maxQuota;
    }

    public boolean isRemainingQuota() {
        return remainingQuota;
    }

    public void setRemainingQuota(boolean remainingQuota) {
        this.remainingQuota = remainingQuota;
    }
}
