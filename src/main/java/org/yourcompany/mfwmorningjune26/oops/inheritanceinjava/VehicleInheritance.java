package org.yourcompany.mfwmorningjune26.oops.inheritanceinjava;

public class VehicleInheritance {

    private String vehicleId;
    private String licencePlate;
    private String color;
    private Integer capacity;

    public VehicleInheritance(){
        System.out.println("vehicle constructor gets called....");
    }


    public VehicleInheritance(String vehicleId, String licensePlate){
        System.out.println("vehicle constructor called....");
        this.licencePlate = licensePlate;
        this.vehicleId = vehicleId;
    }



    public void registerVehicle(){
        System.out.println("vehicle is registered....");
    }

    protected double getBaseFare(){
        return 2.0;
    }



    public String getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
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
    public Integer getCapacity() {
        return capacity;
    }
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    } 
    
    
}
