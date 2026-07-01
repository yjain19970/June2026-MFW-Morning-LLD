package org.yourcompany.mfwmorningjune26.oops.inheritanceinjava;

public class CabInheritance extends VehicleInheritance {

    public CabInheritance(String vehicleId, String licensePlate) {
        super(vehicleId, licensePlate); // VERY FIRST LINE IN THE CONSTRUCTOR.
        System.out.println("cab constructor just called vehicle constructor...");
    }


    private String cabType;

    public String getCabType() {
        return cabType;
    }

    public void setCabType(String cabType) {
        this.cabType = cabType;
    }


    @Override
    public double getBaseFare(){
        return 20.0;
    }

    @Override
    public boolean equals(Object obj){
        System.out.println("OVERRIDEN METHOD IS CALLED,.......");

        
        return true;
    }

    


}
