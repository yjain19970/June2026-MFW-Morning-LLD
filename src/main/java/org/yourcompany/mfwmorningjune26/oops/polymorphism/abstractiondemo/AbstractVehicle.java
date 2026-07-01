package org.yourcompany.mfwmorningjune26.oops.polymorphism.abstractiondemo;

public abstract class AbstractVehicle {

    private String licencePlate;
    private String color;
    private int capacity;


    abstract double calculateFare(int km);

    public void printVehicleDetails(){
        System.out.println("printing details from common abstract class");
    }


    public String getLicencePlate() {
        return licencePlate;
    }


    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public int getCapacity() {
        return capacity;
    }


    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
}
