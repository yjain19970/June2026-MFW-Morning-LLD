package org.yourcompany.mfwmorningjune26.inventorymanagementsystem;

import java.util.HashMap;
import java.util.Map;

import org.yourcompany.mfwmorningjune26.javaadvconcepts.exceptions.DuplicateItemException;
import org.yourcompany.mfwmorningjune26.javaadvconcepts.exceptions.InvalidQuantityException;

public class Inventory<T extends Item> {
    private Map<String, T> items; 

    public Inventory(){
        items = new HashMap<>();
    }
    
    public void addItem(T item) throws InvalidQuantityException, DuplicateItemException{
        if(item.getQuantity() <0){
            throw new InvalidQuantityException("Quantity must be > 0");
        }
        if(items.containsKey(item.getId())){
            // throw an exception - that Item already exist!
            throw new DuplicateItemException("Id is duplicated");
        }

        items.put(item.getId(), item);
    }

    public void removeItem(String id){
        // whether the id that you need to remove -- exists or not!
        items.remove(id);
    }

    public T getItem(String id){
        return items.get(id);
    }
}
