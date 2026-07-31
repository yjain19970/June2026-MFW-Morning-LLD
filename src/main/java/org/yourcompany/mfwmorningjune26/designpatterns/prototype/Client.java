package org.yourcompany.mfwmorningjune26.designpatterns.prototype;

public class Client {
    public static void main(String[] args) {
        VmInstance vOg = new VmInstance();

        // Copy
        VmInstance vCopy = vOg.createCopy();



        GpuInstance gpuOg = new GpuInstance();
        VmInstance gpuCopy = gpuOg.createCopy();




        // polumorphism here....

    }
}
