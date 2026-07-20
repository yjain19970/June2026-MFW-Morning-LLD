package org.yourcompany.mfwmorningjune26.javaadvconcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.yourcompany.mfwmorningjune26.inventorymanagementsystem.Book;
import org.yourcompany.mfwmorningjune26.inventorymanagementsystem.Clothing;
import org.yourcompany.mfwmorningjune26.inventorymanagementsystem.Electronics;
import org.yourcompany.mfwmorningjune26.inventorymanagementsystem.Item;

public class StreamExamples {
    public static void main(String[] args) {

        List<Item> itemsList1 = new ArrayList<>();
        itemsList1.add(new Electronics("E1", "Laptop", 55000, 5, 24));
        itemsList1.add(new Electronics("E2", "Mobile Phone", 22000, 8, 12));
        itemsList1.add(new Electronics("E3", "Earphones", 1500, 0, 6));
        itemsList1.add(new Book("B1", "Java", 799, 10, "James Gosling"));
        itemsList1.add(new Clothing("C1", "T-Shirt", 499, 20, "M"));  

        /**
         * 
         * 1. get me List of Ids only as output.
         * 2. print me all the Ids of each Item, do not return anything.
         * 
         */

        List<String> ids =  itemsList1.stream()
            .map(item -> item.getId()).collect(Collectors.toList());
        System.out.println("Ids: " + ids);

        itemsList1.stream().map(item -> item.getName().length())
            .forEach(id -> System.out.println(id));
        
        
        /**
         * 
         * 1. Print the Items which are priced only above 1000 (filter)
         * 2. Check and return true -> If all the Items have a price associated with them,
         *      else return false. (allMatch)
         * 
         */

        itemsList1.stream().filter(item -> item.getPrice() > 1000)
        .forEach(item -> System.out.println("item is: " + item.getName()));
        

        List<Item> dummyList = new ArrayList<>();
        boolean hasPrice =  dummyList.stream()
            .allMatch(item -> item.getPrice() > 0);

        System.out.println("hasPrice: "+hasPrice);
        // Return TRUE.

        boolean anyHasPrice =  dummyList.stream()
            .anyMatch(item -> item.getPrice() > 0); 
        System.out.println("anyHasPrice: "+anyHasPrice);
        // Return False.






        /**
         * I want to filter items priced above 1000 and in stock, get just their names, 
         * remove duplicates, sort alphabetically, keep only the top 2.
         * 
         * And return the output (name of items) -> List<String>
         * 
         * 
         */

    }
}
