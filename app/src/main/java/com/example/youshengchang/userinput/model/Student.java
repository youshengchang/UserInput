package com.example.youshengchang.userinput.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/**
 * Created by youshengchang on 3/27/15.
 */
public class Student implements Parcelable {

    private final String LOGTAG = "Student";

    private String firstName;
    private String lastName;
    private String email;

    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Student(Parcel source) {
        firstName = source.readString();
        lastName = source.readString();
        email = source.readString();
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int describeContents() {
        return 0;
    }


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(firstName);
        dest.writeString(lastName);
        dest.writeString(email);
    }

    public final static Parcelable.Creator<Student> CREATOR =
            new Creator<Student>(){

                @Override
                public Student createFromParcel(Parcel source) {
                    Log.i("Stdent", "createFromParcel called.");
                    return new Student(source);
                }

                @Override
                public Student[] newArray(int size) {
                    Log.i("Stdent", "newArray called");
                    return new Student[size];
                }
            };
}
