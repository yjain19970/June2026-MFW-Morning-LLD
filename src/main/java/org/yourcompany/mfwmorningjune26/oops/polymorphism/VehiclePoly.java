package org.yourcompany.mfwmorningjune26.oops.polymorphism;

public class VehiclePoly {
    private String licencePlate;
    private String color;
    private int capacity;


    public double calculateFare(int km){
        System.out.println("VehiclePoly....");
        return 0.0;
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
