package com.example.linearalgebra.slark0.model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MySet {

    @SerializedName("uid")
    @Expose
    private String uid;
    @SerializedName("schedule_urls")
    @Expose
    private List<String> scheduleUrls = new ArrayList<String>();
    @SerializedName("publish_on")
    @Expose
    private String publishOn;
    @SerializedName("quoter")
    @Expose
    private String quoter;
    @SerializedName("featured")
    @Expose
    private Boolean featured;
    @SerializedName("language_modified_by")
    @Expose
    private java.lang.Object languageModifiedBy;
    @SerializedName("plans")
    @Expose
    private List<java.lang.Object> plans = new ArrayList<java.lang.Object>();
    @SerializedName("cached_film_count")
    @Expose
    private Integer cachedFilmCount;
    @SerializedName("modified_by")
    @Expose
    private java.lang.Object modifiedBy;
    @SerializedName("temp_id")
    @Expose
    private Integer tempId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("self")
    @Expose
    private String self;
    @SerializedName("created_by")
    @Expose
    private java.lang.Object createdBy;
    @SerializedName("language_publish_on")
    @Expose
    private String languagePublishOn;
    @SerializedName("language_modified")
    @Expose
    private String languageModified;
    @SerializedName("has_price")
    @Expose
    private Boolean hasPrice;
    @SerializedName("set_type_url")
    @Expose
    private java.lang.Object setTypeUrl;
    @SerializedName("temp_image")
    @Expose
    private String tempImage;
    @SerializedName("film_count")
    @Expose
    private Integer filmCount;
    @SerializedName("body")
    @Expose
    private String body;
    @SerializedName("language_version_url")
    @Expose
    private String languageVersionUrl;
    @SerializedName("quote")
    @Expose
    private String quote;
    @SerializedName("lowest_amount")
    @Expose
    private java.lang.Object lowestAmount;
    @SerializedName("formatted_body")
    @Expose
    private String formattedBody;
    @SerializedName("image_urls")
    @Expose
    private List<String> imageUrls = new ArrayList<String>();
    @SerializedName("hierarchy_url")
    @Expose
    private String hierarchyUrl;
    @SerializedName("schedule_url")
    @Expose
    private String scheduleUrl;
    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("version_number")
    @Expose
    private Integer versionNumber;
    @SerializedName("language_ends_on")
    @Expose
    private String languageEndsOn;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("items")
    @Expose
    private ArrayList<Item> items = new ArrayList<Item>();
    @SerializedName("language_version_number")
    @Expose
    private Integer languageVersionNumber;
    @SerializedName("modified")
    @Expose
    private String modified;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("ends_on")
    @Expose
    private String endsOn;
    @SerializedName("version_url")
    @Expose
    private String versionUrl;
    @SerializedName("set_type_slug")
    @Expose
    private String setTypeSlug;

    /**
     * 
     * @return
     *     The uid
     */
    public String getUid() {
        return uid;
    }

    /**
     * 
     * @param uid
     *     The uid
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    public MySet withUid(String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * 
     * @return
     *     The scheduleUrls
     */
    public List<String> getScheduleUrls() {
        return scheduleUrls;
    }

    /**
     * 
     * @param scheduleUrls
     *     The schedule_urls
     */
    public void setScheduleUrls(List<String> scheduleUrls) {
        this.scheduleUrls = scheduleUrls;
    }

    public MySet withScheduleUrls(List<String> scheduleUrls) {
        this.scheduleUrls = scheduleUrls;
        return this;
    }

    /**
     * 
     * @return
     *     The publishOn
     */
    public String getPublishOn() {
        return publishOn;
    }

    /**
     * 
     * @param publishOn
     *     The publish_on
     */
    public void setPublishOn(String publishOn) {
        this.publishOn = publishOn;
    }

    public MySet withPublishOn(String publishOn) {
        this.publishOn = publishOn;
        return this;
    }

    /**
     * 
     * @return
     *     The quoter
     */
    public String getQuoter() {
        return quoter;
    }

    /**
     * 
     * @param quoter
     *     The quoter
     */
    public void setQuoter(String quoter) {
        this.quoter = quoter;
    }

    public MySet withQuoter(String quoter) {
        this.quoter = quoter;
        return this;
    }

    /**
     * 
     * @return
     *     The featured
     */
    public Boolean getFeatured() {
        return featured;
    }

    /**
     * 
     * @param featured
     *     The featured
     */
    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }

    public MySet withFeatured(Boolean featured) {
        this.featured = featured;
        return this;
    }

    /**
     * 
     * @return
     *     The languageModifiedBy
     */
    public java.lang.Object getLanguageModifiedBy() {
        return languageModifiedBy;
    }

    /**
     * 
     * @param languageModifiedBy
     *     The language_modified_by
     */
    public void setLanguageModifiedBy(java.lang.Object languageModifiedBy) {
        this.languageModifiedBy = languageModifiedBy;
    }

    public MySet withLanguageModifiedBy(java.lang.Object languageModifiedBy) {
        this.languageModifiedBy = languageModifiedBy;
        return this;
    }

    /**
     * 
     * @return
     *     The plans
     */
    public List<java.lang.Object> getPlans() {
        return plans;
    }

    /**
     * 
     * @param plans
     *     The plans
     */
    public void setPlans(List<java.lang.Object> plans) {
        this.plans = plans;
    }

    public MySet withPlans(List<java.lang.Object> plans) {
        this.plans = plans;
        return this;
    }

    /**
     * 
     * @return
     *     The cachedFilmCount
     */
    public Integer getCachedFilmCount() {
        return cachedFilmCount;
    }

    /**
     * 
     * @param cachedFilmCount
     *     The cached_film_count
     */
    public void setCachedFilmCount(Integer cachedFilmCount) {
        this.cachedFilmCount = cachedFilmCount;
    }

    public MySet withCachedFilmCount(Integer cachedFilmCount) {
        this.cachedFilmCount = cachedFilmCount;
        return this;
    }

    /**
     * 
     * @return
     *     The modifiedBy
     */
    public java.lang.Object getModifiedBy() {
        return modifiedBy;
    }

    /**
     * 
     * @param modifiedBy
     *     The modified_by
     */
    public void setModifiedBy(java.lang.Object modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public MySet withModifiedBy(java.lang.Object modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    /**
     * 
     * @return
     *     The tempId
     */
    public Integer getTempId() {
        return tempId;
    }

    /**
     * 
     * @param tempId
     *     The temp_id
     */
    public void setTempId(Integer tempId) {
        this.tempId = tempId;
    }

    public MySet withTempId(Integer tempId) {
        this.tempId = tempId;
        return this;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public MySet withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 
     * @return
     *     The self
     */
    public String getSelf() {
        return self;
    }

    /**
     * 
     * @param self
     *     The self
     */
    public void setSelf(String self) {
        this.self = self;
    }

    public MySet withSelf(String self) {
        this.self = self;
        return this;
    }

    /**
     * 
     * @return
     *     The createdBy
     */
    public java.lang.Object getCreatedBy() {
        return createdBy;
    }

    /**
     * 
     * @param createdBy
     *     The created_by
     */
    public void setCreatedBy(java.lang.Object createdBy) {
        this.createdBy = createdBy;
    }

    public MySet withCreatedBy(java.lang.Object createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * 
     * @return
     *     The languagePublishOn
     */
    public String getLanguagePublishOn() {
        return languagePublishOn;
    }

    /**
     * 
     * @param languagePublishOn
     *     The language_publish_on
     */
    public void setLanguagePublishOn(String languagePublishOn) {
        this.languagePublishOn = languagePublishOn;
    }

    public MySet withLanguagePublishOn(String languagePublishOn) {
        this.languagePublishOn = languagePublishOn;
        return this;
    }

    /**
     * 
     * @return
     *     The languageModified
     */
    public String getLanguageModified() {
        return languageModified;
    }

    /**
     * 
     * @param languageModified
     *     The language_modified
     */
    public void setLanguageModified(String languageModified) {
        this.languageModified = languageModified;
    }

    public MySet withLanguageModified(String languageModified) {
        this.languageModified = languageModified;
        return this;
    }

    /**
     * 
     * @return
     *     The hasPrice
     */
    public Boolean getHasPrice() {
        return hasPrice;
    }

    /**
     * 
     * @param hasPrice
     *     The has_price
     */
    public void setHasPrice(Boolean hasPrice) {
        this.hasPrice = hasPrice;
    }

    public MySet withHasPrice(Boolean hasPrice) {
        this.hasPrice = hasPrice;
        return this;
    }

    /**
     * 
     * @return
     *     The setTypeUrl
     */
    public java.lang.Object getSetTypeUrl() {
        return setTypeUrl;
    }

    /**
     * 
     * @param setTypeUrl
     *     The set_type_url
     */
    public void setSetTypeUrl(java.lang.Object setTypeUrl) {
        this.setTypeUrl = setTypeUrl;
    }

    public MySet withSetTypeUrl(java.lang.Object setTypeUrl) {
        this.setTypeUrl = setTypeUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The tempImage
     */
    public String getTempImage() {
        return tempImage;
    }

    /**
     * 
     * @param tempImage
     *     The temp_image
     */
    public void setTempImage(String tempImage) {
        this.tempImage = tempImage;
    }

    public MySet withTempImage(String tempImage) {
        this.tempImage = tempImage;
        return this;
    }

    /**
     * 
     * @return
     *     The filmCount
     */
    public Integer getFilmCount() {
        return filmCount;
    }

    /**
     * 
     * @param filmCount
     *     The film_count
     */
    public void setFilmCount(Integer filmCount) {
        this.filmCount = filmCount;
    }

    public MySet withFilmCount(Integer filmCount) {
        this.filmCount = filmCount;
        return this;
    }

    /**
     * 
     * @return
     *     The body
     */
    public String getBody() {
        return body;
    }

    /**
     * 
     * @param body
     *     The body
     */
    public void setBody(String body) {
        this.body = body;
    }

    public MySet withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * 
     * @return
     *     The languageVersionUrl
     */
    public String getLanguageVersionUrl() {
        return languageVersionUrl;
    }

    /**
     * 
     * @param languageVersionUrl
     *     The language_version_url
     */
    public void setLanguageVersionUrl(String languageVersionUrl) {
        this.languageVersionUrl = languageVersionUrl;
    }

    public MySet withLanguageVersionUrl(String languageVersionUrl) {
        this.languageVersionUrl = languageVersionUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The quote
     */
    public String getQuote() {
        return quote;
    }

    /**
     * 
     * @param quote
     *     The quote
     */
    public void setQuote(String quote) {
        this.quote = quote;
    }

    public MySet withQuote(String quote) {
        this.quote = quote;
        return this;
    }

    /**
     * 
     * @return
     *     The lowestAmount
     */
    public java.lang.Object getLowestAmount() {
        return lowestAmount;
    }

    /**
     * 
     * @param lowestAmount
     *     The lowest_amount
     */
    public void setLowestAmount(java.lang.Object lowestAmount) {
        this.lowestAmount = lowestAmount;
    }

    public MySet withLowestAmount(java.lang.Object lowestAmount) {
        this.lowestAmount = lowestAmount;
        return this;
    }

    /**
     * 
     * @return
     *     The formattedBody
     */
    public String getFormattedBody() {
        return formattedBody;
    }

    /**
     * 
     * @param formattedBody
     *     The formatted_body
     */
    public void setFormattedBody(String formattedBody) {
        this.formattedBody = formattedBody;
    }

    public MySet withFormattedBody(String formattedBody) {
        this.formattedBody = formattedBody;
        return this;
    }

    /**
     * 
     * @return
     *     The imageUrls
     */
    public List<String> getImageUrls() {
        return imageUrls;
    }

    /**
     * 
     * @param imageUrls
     *     The image_urls
     */
    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }

    public MySet withImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
        return this;
    }

    /**
     * 
     * @return
     *     The hierarchyUrl
     */
    public String getHierarchyUrl() {
        return hierarchyUrl;
    }

    /**
     * 
     * @param hierarchyUrl
     *     The hierarchy_url
     */
    public void setHierarchyUrl(String hierarchyUrl) {
        this.hierarchyUrl = hierarchyUrl;
    }

    public MySet withHierarchyUrl(String hierarchyUrl) {
        this.hierarchyUrl = hierarchyUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The scheduleUrl
     */
    public String getScheduleUrl() {
        return scheduleUrl;
    }

    /**
     * 
     * @param scheduleUrl
     *     The schedule_url
     */
    public void setScheduleUrl(String scheduleUrl) {
        this.scheduleUrl = scheduleUrl;
    }

    public MySet withScheduleUrl(String scheduleUrl) {
        this.scheduleUrl = scheduleUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The active
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * 
     * @param active
     *     The active
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    public MySet withActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * 
     * @return
     *     The slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     * 
     * @param slug
     *     The slug
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

    public MySet withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * 
     * @return
     *     The versionNumber
     */
    public Integer getVersionNumber() {
        return versionNumber;
    }

    /**
     * 
     * @param versionNumber
     *     The version_number
     */
    public void setVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
    }

    public MySet withVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
        return this;
    }

    /**
     * 
     * @return
     *     The languageEndsOn
     */
    public String getLanguageEndsOn() {
        return languageEndsOn;
    }

    /**
     * 
     * @param languageEndsOn
     *     The language_ends_on
     */
    public void setLanguageEndsOn(String languageEndsOn) {
        this.languageEndsOn = languageEndsOn;
    }

    public MySet withLanguageEndsOn(String languageEndsOn) {
        this.languageEndsOn = languageEndsOn;
        return this;
    }

    /**
     * 
     * @return
     *     The created
     */
    public String getCreated() {
        return created;
    }

    /**
     * 
     * @param created
     *     The created
     */
    public void setCreated(String created) {
        this.created = created;
    }

    public MySet withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 
     * @return
     *     The items
     */
    public ArrayList<Item> getItems() {
        return items;
    }

    /**
     * 
     * @param items
     *     The items
     */
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public MySet withItems(ArrayList<Item> items) {
        this.items = items;
        return this;
    }

    /**
     * 
     * @return
     *     The languageVersionNumber
     */
    public Integer getLanguageVersionNumber() {
        return languageVersionNumber;
    }

    /**
     * 
     * @param languageVersionNumber
     *     The language_version_number
     */
    public void setLanguageVersionNumber(Integer languageVersionNumber) {
        this.languageVersionNumber = languageVersionNumber;
    }

    public MySet withLanguageVersionNumber(Integer languageVersionNumber) {
        this.languageVersionNumber = languageVersionNumber;
        return this;
    }

    /**
     * 
     * @return
     *     The modified
     */
    public String getModified() {
        return modified;
    }

    /**
     * 
     * @param modified
     *     The modified
     */
    public void setModified(String modified) {
        this.modified = modified;
    }

    public MySet withModified(String modified) {
        this.modified = modified;
        return this;
    }

    /**
     * 
     * @return
     *     The summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 
     * @param summary
     *     The summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    public MySet withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * 
     * @return
     *     The endsOn
     */
    public String getEndsOn() {
        return endsOn;
    }

    /**
     * 
     * @param endsOn
     *     The ends_on
     */
    public void setEndsOn(String endsOn) {
        this.endsOn = endsOn;
    }

    public MySet withEndsOn(String endsOn) {
        this.endsOn = endsOn;
        return this;
    }

    /**
     * 
     * @return
     *     The versionUrl
     */
    public String getVersionUrl() {
        return versionUrl;
    }

    /**
     * 
     * @param versionUrl
     *     The version_url
     */
    public void setVersionUrl(String versionUrl) {
        this.versionUrl = versionUrl;
    }

    public MySet withVersionUrl(String versionUrl) {
        this.versionUrl = versionUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The setTypeSlug
     */
    public String getSetTypeSlug() {
        return setTypeSlug;
    }

    /**
     * 
     * @param setTypeSlug
     *     The set_type_slug
     */
    public void setSetTypeSlug(String setTypeSlug) {
        this.setTypeSlug = setTypeSlug;
    }

    public MySet withSetTypeSlug(String setTypeSlug) {
        this.setTypeSlug = setTypeSlug;
        return this;
    }

}
