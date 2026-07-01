package org.yourcompany.mfwmorningjune26.oops.inheritanceinjava;

public class ClientInheritance {
    public static void main(String[] args) {
        

        CabInheritance cab = new CabInheritance("V101","KA-01-HG-1234");
        CabInheritance cab2 = new CabInheritance("V101","KA-01-HG-1234");
        boolean val1 = cab == cab2;
        System.out.println("Result: " + val1);


        boolean val2 = cab.equals(cab2);
        





        cab.registerVehicle();
        cab.getBaseFare();


       // VehicleInheritance vehicle = new VehicleInheritance(null, null);

    }
}
