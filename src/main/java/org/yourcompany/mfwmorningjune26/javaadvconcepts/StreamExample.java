package org.yourcompany.mfwmorningjune26.javaadvconcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        /**
         * Given a list of Integers:
         *  XX filter out even numbers from the list XX
         *  XX sort those even numbers XX
         *  XX calculate the sq of these even numbers
         *  finally: i want collect unique square values.
         */
        List<Integer> list = Arrays.asList(5, 3, 8, 2, 9, 4, 7, 6, 2, 8);
        List<Integer> evIntegers = new ArrayList<>();
        for(Integer i: list){
            if(i%2 ==0){
                evIntegers.add(i);
            }
        }

        Collections.sort(evIntegers);

        List<Integer> squaIntegers = new ArrayList<>();
        for(int x : evIntegers){
            int squared = x*x;
            if(!squaIntegers.contains(squared)){
                squaIntegers.add(squared);
            }
        }
        System.out.println("Output: "+ squaIntegers);


        // Solving the same thing using streams.
        // (n) -> n%2==0;
        List<Integer> outputListUsingStream  =  list.stream().filter(n -> n%2==0)
            .sorted().map(x -> x*x).distinct().collect(Collectors.toList());
            System.out.println("using stream: "+ outputListUsingStream);

        












    }
}
