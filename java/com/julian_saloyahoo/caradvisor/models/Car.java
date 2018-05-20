package com.julian_saloyahoo.caradvisor.models;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;

import com.julian_saloyahoo.caradvisor.Result;

public class Car implements Parcelable{

    final static String LOG_TAG = "myLogs";

    int doors;
    String make;
    String model;
    String layout;
    String trunk;
    String gearbox;
    int price;
    int expeople;

    public Car(int doors, String make, String model, String layout, String trunk, String gearbox, int price, int expeople) {
        this.doors = doors;
        this.make = make;
        this.model = model;
        this.layout = layout;
        this.trunk = trunk;
        this.gearbox = gearbox;
        this.price = price;
        this.expeople = expeople;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String getTrunk() {
        return trunk;
    }

    public void setTrunk(String trunk) {
        this.trunk = trunk;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getExpeople() {
        return expeople;
    }

    public void setExpeople(int expeople) {
        this.expeople = expeople;
    }
    public void data() {

        Car[] car;
        car = new  Car[100];
        car[0] = new Car(4, "Volkswagen", "Passat", "4 door saloon", "Spacious", "Both", 25000, 5);
        car[1] = new Car(2, "Mazda", "MX-5", "Roadster", "Small", "Both", 20000, 2);
        car[2] = new Car(2, "BMW", "2 series", "2 door coupe", "Spacious", "Both", 20000, 4);
        car[3] = new Car(3, "Volkswagen", "Golf", "3 door hatchback", "Spacious", "Both", 20000, 4);
        car[4] = new Car(5, "Peugeot", "308", "5 door hatchback", "Spacious", "Both", 20000, 5);
        car[5] = new Car(5, "Peugeot","508","Estate", "Spacious", "Both", 25000, 5);
        car[6] = new Car(5, "Ford", "S-Max", "Minivan", "Spacious", "Both", 28000,7);
        car[7] = new Car(5, "Ford", "Transit", "Van", "Spacious", "Manual", 20000, 9);
        car[8] = new Car(3, "Jeep", "Wrangler", "3 door SUV", "Spacious", "Automatic", 40000, 4);
        car[9] = new Car(5, "KIA", "Sportage", "5 door SUV", "Spacious", "Both", 25000, 5);
        car[10] = new Car(4, "Audi", "A7", "4 door coupe", "Spacious", "Both", 60000, 4);
        car[11] = new Car(5, "Peugeot", "208", "5 door hatchback", "Small", "Both", 14000, 5);


    }
    public int describeContents(){
        return hashCode();
    }

    public void writeToParcel(Parcel parcel, int flags) {
        Log.d(LOG_TAG, "writeToParcel");
        parcel.writeInt(doors);
        parcel.writeString(make);
        parcel.writeString(model);
        parcel.writeString(layout);
        parcel.writeString(trunk);
        parcel.writeString(gearbox);
        parcel.writeInt(price);
        parcel.writeInt(expeople);
    }
    public static final Parcelable.Creator<Car> CREATOR = new Parcelable.Creator<Car>() {
        public Car createFromParcel(Parcel in) {
            Log.d(LOG_TAG, "createFromParcel");
            return new Car(in);
        }

        public Car[] newArray(int size) {
            return new Car[size];
        }
    };

    private Car(Parcel parcel) {
        Log.d(LOG_TAG, "MyObject(Parcel parcel)");
        doors = parcel.readInt();
        make = parcel.readString();
        model = parcel.readString();
        layout = parcel.readString();
        trunk = parcel.readString();
        gearbox = parcel.readString();
        price = parcel.readInt();
        expeople = parcel.readInt();
    }

}

