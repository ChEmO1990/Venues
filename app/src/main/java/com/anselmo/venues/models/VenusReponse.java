
package com.anselmo.venues.models;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VenusReponse implements Parcelable
{

    @SerializedName("venues")
    @Expose
    private List<Venue> venues = null;
    public final static Creator<VenusReponse> CREATOR = new Creator<VenusReponse>() {


        @SuppressWarnings({
            "unchecked"
        })
        public VenusReponse createFromParcel(Parcel in) {
            return new VenusReponse(in);
        }

        public VenusReponse[] newArray(int size) {
            return (new VenusReponse[size]);
        }

    }
    ;

    protected VenusReponse(Parcel in) {
        in.readList(this.venues, (com.anselmo.venues.models.Venue.class.getClassLoader()));
    }

    public VenusReponse() {
    }

    public List<Venue> getVenues() {
        return venues;
    }

    public void setVenues(List<Venue> venues) {
        this.venues = venues;
    }

    @Override
    public String toString() {
        return "VenusReponse{" +
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
