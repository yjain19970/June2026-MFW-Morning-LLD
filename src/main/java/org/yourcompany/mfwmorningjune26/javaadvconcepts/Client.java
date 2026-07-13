package org.yourcompany.mfwmorningjune26.javaadvconcepts;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        PairWithObject pWithObject = new PairWithObject();
        pWithObject.x = "Yash";
        pWithObject.y = 29;
        System.out.println("\n calling method \n");
        //calculateSum(pWithObject);
        

        Pair.doSomethingWithStatic("Hello", true);
        Pair.doSomethingWithStatic(29, 31);

            // T, V
       Pair<String,String> p1 = new Pair<>();
       p1.first = "Yash";
       p1.second = "Jain";

       Pair<Integer,Integer> p2 = new Pair<>();
       p2.first = 29;
       p2.second = 31;
       

    }

    public static Integer calculateSum(PairWithObject pairWithObject){
        return (Integer) pairWithObject.x + (Integer) pairWithObject.y;
    }
}
