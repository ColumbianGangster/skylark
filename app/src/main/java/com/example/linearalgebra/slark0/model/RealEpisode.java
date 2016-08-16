package com.example.linearalgebra.slark0.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LinearAlgebra on 16/08/2016.
 */

public class RealEpisode {

    @SerializedName("subtitle")
    @Expose
    private String subtitle;
    @SerializedName("uid")
    @Expose
    private String uid;
    @SerializedName("schedule_urls")
    @Expose
    private List<String> scheduleUrls = new ArrayList<String>();
    @SerializedName("image_urls")
    @Expose
    private List<Object> imageUrls = new ArrayList<Object>();
    @SerializedName("publish_on")
    @Expose
    private String publishOn;
    @SerializedName("talent_urls")
    @Expose
    private List<Object> talentUrls = new ArrayList<Object>();
    @SerializedName("schedule_url")
    @Expose
    private String scheduleUrl;
    @SerializedName("plan_urls")
    @Expose
    private List<Object> planUrls = new ArrayList<Object>();
    @SerializedName("language_publish_on")
    @Expose
    private String languagePublishOn;
    @SerializedName("episode_number")
    @Expose
    private Object episodeNumber;
    @SerializedName("language_modified_by")
    @Expose
    private Object languageModifiedBy;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("language_version_url")
    @Expose
    private String languageVersionUrl;
    @SerializedName("version_number")
    @Expose
    private Integer versionNumber;
    @SerializedName("modified_by")
    @Expose
    private Object modifiedBy;
    @SerializedName("language_ends_on")
    @Expose
    private String languageEndsOn;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("items")
    @Expose
    private List<String> items = new ArrayList<String>();
    @SerializedName("self")
    @Expose
    private String self;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("modified")
    @Expose
    private String modified;
    @SerializedName("created_by")
    @Expose
    private Object createdBy;
    @SerializedName("tag_urls")
    @Expose
    private List<Object> tagUrls = new ArrayList<Object>();
    @SerializedName("ends_on")
    @Expose
    private String endsOn;
    @SerializedName("synopsis")
    @Expose
    private String synopsis;
    @SerializedName("version_url")
    @Expose
    private String versionUrl;
    @SerializedName("parent_url")
    @Expose
    private Object parentUrl;
    @SerializedName("language_version_number")
    @Expose
    private Integer languageVersionNumber;
    @SerializedName("language_modified")
    @Expose
    private String languageModified;

    /**
     *
     * @return
     * The subtitle
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     *
     * @param subtitle
     * The subtitle
     */
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
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
     * The scheduleUrls
     */
    public List<String> getScheduleUrls() {
        return scheduleUrls;
    }

    /**
     *
     * @param scheduleUrls
     * The schedule_urls
     */
    public void setScheduleUrls(List<String> scheduleUrls) {
        this.scheduleUrls = scheduleUrls;
    }

    /**
     *
     * @return
     * The imageUrls
     */
    public List<Object> getImageUrls() {
        return imageUrls;
    }

    /**
     *
     * @param imageUrls
     * The image_urls
     */
    public void setImageUrls(List<Object> imageUrls) {
        this.imageUrls = imageUrls;
    }

    /**
     *
     * @return
     * The publishOn
     */
    public String getPublishOn() {
        return publishOn;
    }

    /**
     *
     * @param publishOn
     * The publish_on
     */
    public void setPublishOn(String publishOn) {
        this.publishOn = publishOn;
    }

    /**
     *
     * @return
     * The talentUrls
     */
    public List<Object> getTalentUrls() {
        return talentUrls;
    }

    /**
     *
     * @param talentUrls
     * The talent_urls
     */
    public void setTalentUrls(List<Object> talentUrls) {
        this.talentUrls = talentUrls;
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
     * The planUrls
     */
    public List<Object> getPlanUrls() {
        return planUrls;
    }

    /**
     *
     * @param planUrls
     * The plan_urls
     */
    public void setPlanUrls(List<Object> planUrls) {
        this.planUrls = planUrls;
    }

    /**
     *
     * @return
     * The languagePublishOn
     */
    public String getLanguagePublishOn() {
        return languagePublishOn;
    }

    /**
     *
     * @param languagePublishOn
     * The language_publish_on
     */
    public void setLanguagePublishOn(String languagePublishOn) {
        this.languagePublishOn = languagePublishOn;
    }

    /**
     *
     * @return
     * The episodeNumber
     */
    public Object getEpisodeNumber() {
        return episodeNumber;
    }

    /**
     *
     * @param episodeNumber
     * The episode_number
     */
    public void setEpisodeNumber(Object episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    /**
     *
     * @return
     * The languageModifiedBy
     */
    public Object getLanguageModifiedBy() {
        return languageModifiedBy;
    }

    /**
     *
     * @param languageModifiedBy
     * The language_modified_by
     */
    public void setLanguageModifiedBy(Object languageModifiedBy) {
        this.languageModifiedBy = languageModifiedBy;
    }

    /**
     *
     * @return
     * The slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     *
     * @param slug
     * The slug
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     *
     * @return
     * The languageVersionUrl
     */
    public String getLanguageVersionUrl() {
        return languageVersionUrl;
    }

    /**
     *
     * @param languageVersionUrl
     * The language_version_url
     */
    public void setLanguageVersionUrl(String languageVersionUrl) {
        this.languageVersionUrl = languageVersionUrl;
    }

    /**
     *
     * @return
     * The versionNumber
     */
    public Integer getVersionNumber() {
        return versionNumber;
    }

    /**
     *
     * @param versionNumber
     * The version_number
     */
    public void setVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     *
     * @return
     * The modifiedBy
     */
    public Object getModifiedBy() {
        return modifiedBy;
    }

    /**
     *
     * @param modifiedBy
     * The modified_by
     */
    public void setModifiedBy(Object modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     *
     * @return
     * The languageEndsOn
     */
    public String getLanguageEndsOn() {
        return languageEndsOn;
    }

    /**
     *
     * @param languageEndsOn
     * The language_ends_on
     */
    public void setLanguageEndsOn(String languageEndsOn) {
        this.languageEndsOn = languageEndsOn;
    }

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The items
     */
    public List<String> getItems() {
        return items;
    }

    /**
     *
     * @param items
     * The items
     */
    public void setItems(List<String> items) {
        this.items = items;
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
     * The created
     */
    public String getCreated() {
        return created;
    }

    /**
     *
     * @param created
     * The created
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     *
     * @return
     * The modified
     */
    public String getModified() {
        return modified;
    }

    /**
     *
     * @param modified
     * The modified
     */
    public void setModified(String modified) {
        this.modified = modified;
    }

    /**
     *
     * @return
     * The createdBy
     */
    public Object getCreatedBy() {
        return createdBy;
    }

    /**
     *
     * @param createdBy
     * The created_by
     */
    public void setCreatedBy(Object createdBy) {
        this.createdBy = createdBy;
    }

    /**
     *
     * @return
     * The tagUrls
     */
    public List<Object> getTagUrls() {
        return tagUrls;
    }

    /**
     *
     * @param tagUrls
     * The tag_urls
     */
    public void setTagUrls(List<Object> tagUrls) {
        this.tagUrls = tagUrls;
    }

    /**
     *
     * @return
     * The endsOn
     */
    public String getEndsOn() {
        return endsOn;
    }

    /**
     *
     * @param endsOn
     * The ends_on
     */
    public void setEndsOn(String endsOn) {
        this.endsOn = endsOn;
    }

    /**
     *
     * @return
     * The synopsis
     */
    public String getSynopsis() {
        return synopsis;
    }

    /**
     *
     * @param synopsis
     * The synopsis
     */
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    /**
     *
     * @return
     * The versionUrl
     */
    public String getVersionUrl() {
        return versionUrl;
    }

    /**
     *
     * @param versionUrl
     * The version_url
     */
    public void setVersionUrl(String versionUrl) {
        this.versionUrl = versionUrl;
    }

    /**
     *
     * @return
     * The parentUrl
     */
    public Object getParentUrl() {
        return parentUrl;
    }

    /**
     *
     * @param parentUrl
     * The parent_url
     */
    public void setParentUrl(Object parentUrl) {
        this.parentUrl = parentUrl;
    }

    /**
     *
     * @return
     * The languageVersionNumber
     */
    public Integer getLanguageVersionNumber() {
        return languageVersionNumber;
    }

    /**
     *
     * @param languageVersionNumber
     * The language_version_number
     */
    public void setLanguageVersionNumber(Integer languageVersionNumber) {
        this.languageVersionNumber = languageVersionNumber;
    }

    /**
     *
     * @return
     * The languageModified
     */
    public String getLanguageModified() {
        return languageModified;
    }

    /**
     *
     * @param languageModified
     * The language_modified
     */
    public void setLanguageModified(String languageModified) {
        this.languageModified = languageModified;
    }

}
