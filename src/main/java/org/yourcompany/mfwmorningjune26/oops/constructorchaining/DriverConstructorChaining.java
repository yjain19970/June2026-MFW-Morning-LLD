package org.yourcompany.mfwmorningjune26.oops.constructorchaining;

public class DriverConstructorChaining {
    private final String id;
    public String name;
    double rating;
    boolean isOnline;

    public DriverConstructorChaining(String id, String name, 
        double rating, boolean isOnline){
            System.out.println("calling original constructor");
            this.id = id;
            this.isOnline = isOnline;
            this.name = name;
            this.rating = rating;

    }

    public DriverConstructorChaining(String id, String name){
        this(id, name, 0.0, true);
        System.out.println( "called original constructor from sub constructor");
    }


    public static void main(String[] args) {
        DriverConstructorChaining d1 = new 
            DriverConstructorChaining("d101", "Yash");
        System.out.println("D1: " + d1);

        //d1.setId("D102");
    }

    public final String getDriverId(){
        // This method: cannot be overriden now.....
        return this.id;
    }


    // public void setId(String id) {
    //     this.id = id;
    // }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public boolean isOnline() {
        return isOnline;
    }
    public void setOnline(boolean isOnline) {
        this.isOnline = isOnline;
    }
    
}
