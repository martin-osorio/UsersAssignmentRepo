package com.example.martinosorio.usersapp;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by User on 12/15/2016.
 */

public class User implements Parcelable {
    private String FirstName;
    private String LastName;

    public User(String firstName, String lastName) {
        FirstName = firstName;
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    protected User(Parcel in) {
        FirstName = in.readString();
        LastName = in.readString();
    }

    @Override
    public String toString() {
        return LastName + ", " + FirstName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(FirstName);
        dest.writeString(LastName);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<User> CREATOR = new Parcelable.Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };
}
