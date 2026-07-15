package org.yourcompany.mfwmorningjune26.inventorymanagementsystem;

import java.util.HashMap;
import java.util.Map;

public class Inventory<T extends Item> {
    private Map<String, T> items; 

    public Inventory(){
        items = new HashMap<>();
    }
    
    


    public void addItem(T item){
        if(item.getQuantity() <0){
            // throw some exception.
            // HW
        }
        if(items.containsKey(item.getId())){
            // throw an exception - that Item already exist!
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
