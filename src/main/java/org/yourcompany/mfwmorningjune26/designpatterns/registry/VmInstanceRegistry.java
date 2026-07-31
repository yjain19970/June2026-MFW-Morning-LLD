package org.yourcompany.mfwmorningjune26.designpatterns.registry;

import java.util.HashMap;
import java.util.Map;

import org.yourcompany.mfwmorningjune26.designpatterns.prototype.VmInstance;

public class VmInstanceRegistry {
    private Map<String, VmInstance> vmInstanceRegistry = new HashMap<>();

    public void register(String key, VmInstance value){
        vmInstanceRegistry.put(key, value);
    }

    public VmInstance get(String key){
        // Use Optional<> so as to avoid NPEs.
        return vmInstanceRegistry.get(key);
    }

    public void printRegistry(){
        System.out.println("Registry is: \n " + vmInstanceRegistry);
    }

}
