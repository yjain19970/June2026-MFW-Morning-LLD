package org.yourcompany.mfwmorningjune26.designpatterns.prototype;

public class GpuInstance extends VmInstance {
    String gpuType;

    public GpuInstance() { }

    public GpuInstance(GpuInstance instance) {
        super(instance);                    // fills the parent's fields
        this.gpuType = instance.gpuType;    // fills its own field
    }    

    // @Override
    // public GpuInstance createCopy(){
    //     return new GpuInstance(this);
    // }

}
