package org.yourcompany.mfwmorningjune26.designpatterns.prototype;

public class VmInstance implements Prototype<VmInstance> {
    private String os;
    private String runtime;
    private boolean monitoringAgent;
    private boolean securityPatches;
    private String hostname;
    private String ipAddress;








    public void setOs(String os) {
        this.os = os;
    }
    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }
    public void setMonitoringAgent(boolean monitoringAgent) {
        this.monitoringAgent = monitoringAgent;
    }
    public void setSecurityPatches(boolean securityPatches) {
        this.securityPatches = securityPatches;
    }
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    // client should not call this directly.
    public VmInstance(VmInstance original){
        this.ipAddress = original.ipAddress;
        this.hostname = original.hostname;
        this.os = original.os;
        this.securityPatches = original.securityPatches;
    }

    public VmInstance(){
        
    }

    public VmInstance(String os, String runtime){
        this.os = os;
        this.runtime = runtime;
    }

    @Override
    public VmInstance createCopy() {
        return new VmInstance(this);
    }
    
    
}
