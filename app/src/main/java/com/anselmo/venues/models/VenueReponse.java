
package com.anselmo.venues.models;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VenueReponse implements Parcelable
{

    @SerializedName("venues")
    @Expose
    private List<Venue> venues = null;
    public final static Creator<VenueReponse> CREATOR = new Creator<VenueReponse>() {


        @SuppressWarnings({
            "unchecked"
        })
        public VenueReponse createFromParcel(Parcel in) {
            return new VenueReponse(in);
        }

        public VenueReponse[] newArray(int size) {
            return (new VenueReponse[size]);
        }

    }
    ;

    protected VenueReponse(Parcel in) {
        in.readList(this.venues, (com.anselmo.venues.models.Venue.class.getClassLoader()));
    }

    public VenueReponse() {
    }

    public List<Venue> getVenues() {
        return venues;
    }

    public void setVenues(List<Venue> venues) {
        this.venues = venues;
    }

    @Override
    public String toString() {
        return "VenueReponse{" +
                "venues=" + venues +
                '}';
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(venues);
    }

    public int describeContents() {
        return  0;
    }

}
