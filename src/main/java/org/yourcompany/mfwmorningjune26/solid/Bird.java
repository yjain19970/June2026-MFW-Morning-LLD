package org.yourcompany.mfwmorningjune26.solid;

import java.util.List;

public abstract class Bird {
    String name;
    String type;
    int age;
    String color;

    public void eat(){
        System.out.println("generic eat for all birds...");
    }
    
}
