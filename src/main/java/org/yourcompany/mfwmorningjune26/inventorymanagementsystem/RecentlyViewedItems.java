package org.yourcompany.mfwmorningjune26.inventorymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class RecentlyViewedItems {
    private List<Item> items;
    private Integer MAX_SIZE;

    public RecentlyViewedItems() {
        items = new ArrayList<>();
        MAX_SIZE= 10;
    }

    public void addRecentlyViewedItem(Item item){
        // if the item was already present as part of the list.
        items.remove(item);

        items.addFirst(item);
        if(items.size() > MAX_SIZE){
            items.removeLast();
        }
    }

    public List<Item> getAllRecentlyViewedItems(){
        return new ArrayList<>(items);
    }

    
}
