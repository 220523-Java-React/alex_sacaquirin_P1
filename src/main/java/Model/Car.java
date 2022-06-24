package Model;

import Model.example.model.Rank;

import java.io.Serializable;
import java.util.Objects;

public class Car implements Serializable {
    private String make;
    private String model;
    private int year;
    private int id;


    public Car () {
    }

    public Car(Integer id, String model, String make, Integer years) {
        this.id= id;
        this.model=model;
        this.make=make;
        this.year=years;
    }

    public String getMake () {
            return make;
        }

        public Car setMake (String make){
            this.make = make;
            return this;
        }
        public Car setModel (String model){
            this.model = model;
            return this;
        }
        public String getModel () {
            return model;

        }
        public int getYear () {
            return year;
        }

        public Car setYear ( int year){
            this.year = year;
            return this;
        }

        public int getId () {
            return id;

        }
        public Car setId ( int id){
            this.id = id;
            return this;

        }



    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car =(Car) o;
        return id == car.id && Objects.equals(make, car.make) && Objects.equals(model, car.model) && Objects.equals(year, car.year);
    }
    @Override
    public int hashCode(){
        return Objects.hash(id,year,make,model);
    }

    @Override
    public String toString(){
        return "Car{" +
                "id =" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\''+
                ",year ='" + year + '\'' +
                '}';
    }



    }




