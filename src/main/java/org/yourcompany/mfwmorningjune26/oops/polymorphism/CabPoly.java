package org.yourcompany.mfwmorningjune26.oops.polymorphism;

public class CabPoly extends VehiclePoly {

    @Override
    public double calculateFare(int km){
        System.out.println("CabPoly....");
        return 4.0;
    }
}
