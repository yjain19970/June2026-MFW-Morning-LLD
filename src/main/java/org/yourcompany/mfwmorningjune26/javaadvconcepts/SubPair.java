package org.yourcompany.mfwmorningjune26.javaadvconcepts;

import java.util.List;

public class SubPair extends Pair {




    public void doSomething(List<? extends Pair> list){
        // Any List<Child class of Pair>
            // List<SubPair>
            // List<SubAnotherPair>
    }

    public void doSomethingX(List<? super SubPair> list){
        // Super: parent
        // List<Pair> 
        // List<AnotherPair>
    }
    
}

/**
 * class Pair<T>{
    T obj = new T();
    } Pair<String> p = new Pair<>(); can we do something like these
 * 
 * 
 * 
 */
