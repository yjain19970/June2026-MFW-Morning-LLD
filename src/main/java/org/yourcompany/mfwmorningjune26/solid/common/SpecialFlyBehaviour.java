package org.yourcompany.mfwmorningjune26.solid.common;

import java.util.ArrayList;
import java.util.List;

import org.yourcompany.mfwmorningjune26.solid.interfaces.CommonFlyBehaviour;

public class SpecialFlyBehaviour implements CommonFlyBehaviour {
 
    public List<String> commonFly(){
    List<String> list = new ArrayList<>();
        System.out.println("special fly...");
        return list;        
    }    
}
