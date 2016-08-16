package com.example.linearalgebra.slark0.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by LinearAlgebra on 16/08/2016.
 */
public class Item implements Parcelable {

    @SerializedName("link_url")
    @Expose
    private Object linkUrl;
    @SerializedName("sub_heading")
    @Expose
    private Object subHeading;
    @SerializedName("uid")
    @Expose
    private String uid;
    @SerializedName("link_title")
    @Expose
    private Object linkTitle;
    @SerializedName("self")
    @Expose
    private String self;
    @SerializedName("content_url")
    @Expose
    private String contentUrl;
    @SerializedName("schedule_url")
    @Expose
    private String scheduleUrl;
    @SerializedName("set_url")
    @Expose
    private String setUrl;
    @SerializedName("content_type")
    @Expose
    private String contentType;
    @SerializedName("position")
    @Expose
    private Integer position;
    @SerializedName("heading")
    @Expose
    private String heading;

    protected Item(Parcel in) {
        uid = in.readString();
        self = in.readString();
        contentUrl = in.readString();
        scheduleUrl = in.readString();
        setUrl = in.readString();
        contentType = in.readString();
        heading = in.readString();
    }

    public static final Creator<Item> CREATOR = new Creator<Item>() {
        @Override
        public Item createFromParcel(Parcel in) {
            return new Item(in);
        }

        @Override
        public Item[] newArray(int size) {
            return new Item[size];
        }
    };

    /**
     *
     * @return
     * The linkUrl
     */
    public Object getLinkUrl() {
        return linkUrl;
    }

    /**
     *
     * @param linkUrl
     * The link_url
     */
    public void setLinkUrl(Object linkUrl) {
        this.linkUrl = linkUrl;
    }

    /**
     *
     * @return
     * The subHeading
     */
    public Object getSubHeading() {
        return subHeading;
    }

    /**
     *
     * @param subHeading
     * The sub_heading
     */
    public void setSubHeading(Object subHeading) {
        this.subHeading = subHeading;
    }

    /**
     *
     * @return
     * The uid
     */
    public String getUid() {
        return uid;
    }

    /**
     *
     * @param uid
     * The uid
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     *
     * @return
     * The linkTitle
     */
    public Object getLinkTitle() {
        return linkTitle;
    }

    /**
     *
     * @param linkTitle
     * The link_title
     */
    public void setLinkTitle(Object linkTitle) {
        this.linkTitle = linkTitle;
    }

    /**
     *
     * @return
     * The self
     */
    public String getSelf() {
        return self;
    }

    /**
     *
     * @param self
     * The self
     */
    public void setSelf(String self) {
        this.self = self;
    }

    /**
     *
     * @return
     * The contentUrl
     */
    public String getContentUrl() {
        return contentUrl;
    }

    /**
     *
     * @param contentUrl
     * The content_url
     */
    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    /**
     *
     * @return
     * The scheduleUrl
     */
    public String getScheduleUrl() {
        return scheduleUrl;
    }

    /**
     *
     * @param scheduleUrl
     * The schedule_url
     */
    public void setScheduleUrl(String scheduleUrl) {
        this.scheduleUrl = scheduleUrl;
    }

    /**
     *
     * @return
     * The setUrl
     */
    public String getSetUrl() {
        return setUrl;
    }

    /**
     *
     * @param setUrl
     * The set_url
     */
    public void setSetUrl(String setUrl) {
        this.setUrl = setUrl;
    }

    /**
     *
     * @return
     * The contentType
     */
    public String getContentType() {
        return contentType;
    }

    /**
     *
     * @param contentType
     * The content_type
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     *
     * @return
     * The position
     */
    public Integer getPosition() {
        return position;
    }

    /**
     *
     * @param position
     * The position
     */
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     *
     * @return
     * The heading
     */
    public String getHeading() {
        return heading;
    }

    /**
     *
     * @param heading
     * The heading
     */
    public void setHeading(String heading) {
        this.heading = heading;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(uid);
        dest.writeString(self);
        dest.writeString(contentUrl);
        dest.writeString(scheduleUrl);
        dest.writeString(setUrl);
        dest.writeString(contentType);
        dest.writeString(heading);
    }
}
