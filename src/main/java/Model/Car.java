package Model;

import java.io.Serializable;

public class Car implements Serializable {
    private String make;
    private String model;
    private int year;
    private int id;
    private int userId;


    public Car () {
    }

    public Car(String make, String model, int year, int id, int userId) {
        this.make = make;
        this.model = model;
        this.year = year;
        this. id = id;
        this.userId = userId;


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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getId() {
        return id;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

}

