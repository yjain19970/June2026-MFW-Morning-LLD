package org.yourcompany.mfwmorningjune26.designpatterns.registry;

import org.yourcompany.mfwmorningjune26.designpatterns.prototype.VmInstance;

public class Client {
    public static void main(String[] args) {
        VmInstance v16GB = new VmInstance("linux-16", "runtime");
        VmInstance v32GB = new VmInstance("linux-32", "runtime");
        VmInstanceRegistry registry = new VmInstanceRegistry();

        registry.register("vm-16gb", v16GB);
        registry.register("vm-32gb", v32GB);



        // create a copy of 16gb
        registry.printRegistry();

        VmInstance copy =  registry.get("vm-16GB").createCopy();
        System.out.println("\n Copy: " + copy);


        




    }
}
