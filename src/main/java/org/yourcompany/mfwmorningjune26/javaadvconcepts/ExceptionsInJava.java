package org.yourcompany.mfwmorningjune26.javaadvconcepts;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.yourcompany.mfwmorningjune26.inventorymanagementsystem.Book;
import org.yourcompany.mfwmorningjune26.inventorymanagementsystem.Clothing;
import org.yourcompany.mfwmorningjune26.inventorymanagementsystem.Electronics;
import org.yourcompany.mfwmorningjune26.inventorymanagementsystem.Inventory;
import org.yourcompany.mfwmorningjune26.inventorymanagementsystem.Item;
import org.yourcompany.mfwmorningjune26.javaadvconcepts.exceptions.DuplicateItemException;
import org.yourcompany.mfwmorningjune26.javaadvconcepts.exceptions.InvalidQuantityException;

public class ExceptionsInJava {
    public static void main(String[] args) {
        // Integer x = 10;
        // Integer y = 10;

        // int sum =0;
        // double divResult =0;
        // try{
        //     sum = calculateSum(null,y);
        //     System.out.println("Sum: " + sum);
        // }catch(Exception e){
        //     System.out.println("\n Exception happened!!! "+ e.getMessage());
        //     //throw e;
        // }

        // System.out.println("\n Everything executed successfully now!!!");


        // try{
        //     divResult =  calculateDivision(x,y);
        //     System.out.println("\n division: " + divResult);
        // }catch(Exception e){
        //     System.out.println("\n Exception happened!!! "+ e.getMessage());
        // }

        System.out.println(" -------- List of Items created ------ ");
        Inventory<Item> inventory2 = new Inventory<>();
        Item laptop = new Electronics("E1", "Laptop", 55000, 5, 24);
        Item mobilePhone = new Electronics("E2", "Mobile Phone", 22000, 8, 12);
        Item earphones = new Electronics("E3", "Earphones", 1500, -2, 6);   // invalid quantity, on purpose
        Item javaBook = new Book("B1", "Java", 799, 10, "James Gosling");
        Item tShirt = new Clothing("C1", "T-Shirt", 499, 20, "M");        

        ExecutorService executorService = null;
        try{
            executorService = Executors.newCachedThreadPool();
            inventory2.addItem(laptop);
            inventory2.addItem(mobilePhone);
            inventory2.addItem(null);   // throws InvalidQuantityException
            
            System.out.println("\n After exception!!");
            inventory2.addItem(javaBook);
            inventory2.addItem(tShirt);
        }catch(DuplicateItemException | InvalidQuantityException exception){
            executeForInvalidQuantity();
        }catch(Exception exception){
            System.out.println("Exception happened!!!!!");
            //executeForDuplicateItem();
        }
        finally{
            System.out.println("Finally block execution...");
            executorService.shutdown();
        }






    }

    private static void executeForInvalidQuantity() {
        System.out.println("Executing the function for Invalid Quantity");
    }

    private static void executeForDuplicateItem() {
         System.out.println("Executing the function for DuplicateItem");
    }

    public static int calculateSum(Integer x, Integer y){
        System.out.println("inside sum");
        return x+y;
    }



    public static int calculateDivision(Integer x, Integer y){
        System.out.println("inside division");
        return x/y;
    }
}
