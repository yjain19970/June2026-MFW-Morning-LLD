package org.yourcompany.mfwmorningjune26.oops.polymorphism;

public class AutoPoly extends VehiclePoly {
    
    @Override
    public double calculateFare(int km){
        System.out.println("AutoPoly....");
        return 2.0;
    }

}
 