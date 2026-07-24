package org.yourcompany.mfwmorningjune26.solid;

import java.util.ArrayList;
import java.util.List;

import org.yourcompany.mfwmorningjune26.solid.interfaces.Flyable;

public class Client {
    public static void main(String[] args) {
        List<Flyable> birds = new ArrayList<>();
        //birds.add(new Penguin()); XXXX


        birds.add(new Sparrow());
        birds.add(new Peacock());


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        doSomethingOnList(list);

        

        doSomething(birds);

    }

    private static void doSomethingOnList(List<Integer> list) {
        for(Integer i : list){
            i.byteValue();
        }
    }




    /*
        Liscov's substitution principle -->

        All the child classes of any parent, should be treated equally.
        No child class should be given special advantage..
    */
    private static void doSomething(List<Bird> birds) {
        for(Bird bird : birds){
            if(bird.type=="Penguin"){
                continue;
            }
            bird.fly();
        }
    }   
}
