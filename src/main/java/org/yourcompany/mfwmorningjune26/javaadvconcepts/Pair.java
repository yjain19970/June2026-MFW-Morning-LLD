package org.yourcompany.mfwmorningjune26.javaadvconcepts;

import java.util.List;
import java.util.Map;

public class Pair<T,V> {
    public T first;
    public V second;

    public Pair(){}

    public Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }
    public void setFirst(T first) {
        this.first = first;
    }
    public V getSecond() {
        return second;
    }
    public void setSecond(V second) {
        this.second = second;
    }


    // Pair<String,String>
    public T doSomething(T first, V second){
        System.out.println("Input First: ");
        return null;
        // Generic method. Returning generic argument.
    }


    public static void  somemethod(){

    }

    /**
     * 
     * Static generic method
     * 
     */
    public static <X,Y>  Map<X,Y> doSomethingWithStatic(X first, Y second){
        // <X,Y> --> generic dataType that my method will support...
        return null;
    }
    
    
}
