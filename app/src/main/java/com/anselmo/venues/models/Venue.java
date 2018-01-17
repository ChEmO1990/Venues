
package com.anselmo.venues.models;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Venue implements Parcelable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("canonicalUrl")
    @Expose
    private String canonicalUrl;
    @SerializedName("verified")
    @Expose
    private Boolean verified;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("ratingColor")
    @Expose
    private String ratingColor;
    @SerializedName("ratingSignals")
    @Expose
    private Integer ratingSignals;
    @SerializedName("rating")
    @Expose
    private Double rating;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("storeId")
    @Expose
    private String storeId;
    @SerializedName("shortUrl")
    @Expose
    private String shortUrl;
    @SerializedName("timeZone")
    @Expose
    private String timeZone;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("contacts")
    @Expose
    private List<Contact> contacts = null;
    @SerializedName("photos")
    @Expose
    private List<Photo> photos = null;
    public final static Creator<Venue> CREATOR = new Creator<Venue>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Venue createFromParcel(Parcel in) {
            return new Venue(in);
        }

        public Venue[] newArray(int size) {
            return (new Venue[size]);
        }

    }
    ;

    protected Venue(Parcel in) {
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.canonicalUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.verified = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        this.ratingColor = ((String) in.readValue((String.class.getClassLoader())));
        this.ratingSignals = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.rating = ((Double) in.readValue((Double.class.getClassLoader())));
        this.description = ((String) in.readValue((String.class.getClassLoader())));
        this.storeId = ((String) in.readValue((String.class.getClassLoader())));
        this.shortUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.timeZone = ((String) in.readValue((String.class.getClassLoader())));
        this.location = ((Location) in.readValue((Location.class.getClassLoader())));
        in.readList(this.contacts, (com.anselmo.venues.models.Contact.class.getClassLoader()));
        in.readList(this.photos, (com.anselmo.venues.models.Photo.class.getClassLoader()));
    }

    public Venue() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCanonicalUrl() {
        return canonicalUrl;
    }

    public void setCanonicalUrl(String canonicalUrl) {
        this.canonicalUrl = canonicalUrl;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRatingColor() {
        return ratingColor;
    }

    public void setRatingColor(String ratingColor) {
        this.ratingColor = ratingColor;
    }

    public Integer getRatingSignals() {
        return ratingSignals;
    }

    public void setRatingSignals(Integer ratingSignals) {
        this.ratingSignals = ratingSignals;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    @Override
    public String toString() {
        return "Venue{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", canonicalUrl='" + canonicalUrl + '\'' +
                ", verified=" + verified +
                ", url='" + url + '\'' +
                ", ratingColor='" + ratingColor + '\'' +
                ", ratingSignals=" + ratingSignals +
                ", rating=" + rating +
                ", description='" + description + '\'' +
                ", storeId='" + storeId + '\'' +
                ", shortUrl='" + shortUrl + '\'' +
                ", timeZone='" + timeZone + '\'' +
                ", location=" + location +
                ", contacts=" + contacts +
                ", photos=" + photos +
                '}';
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(name);
        dest.writeValue(canonicalUrl);
        dest.writeValue(verified);
        dest.writeValue(url);
        dest.writeValue(ratingColor);
        dest.writeValue(ratingSignals);
        dest.writeValue(rating);
        dest.writeValue(description);
        dest.writeValue(storeId);
        dest.writeValue(shortUrl);
        dest.writeValue(timeZone);
        dest.writeValue(location);
        dest.writeList(contacts);
        dest.writeList(photos);
    }

    public int describeContents() {
        return  0;
    }

}
