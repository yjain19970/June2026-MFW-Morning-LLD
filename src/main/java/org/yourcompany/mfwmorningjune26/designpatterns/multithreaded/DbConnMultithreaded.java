package org.yourcompany.mfwmorningjune26.designpatterns.multithreaded;


public class DbConnMultithreaded {

    private static DbConnMultithreaded instance = null;

    private String url;
    private String dbName;
    private String uName;
    private String pwd;

    private DbConnMultithreaded(){

    }

    // Thread safe...
    public static DbConnMultithreaded getInstance(){
        if(instance == null){
            synchronized(DbConnMultithreaded.class){
                if(instance == null){
                    System.out.println("Creating Object...");
                    instance = new DbConnMultithreaded();
                }
            }
        }
        return instance;
    }

    // Not a better way.... unnecessary wait!
    // No problem here, just extra wait for each thread.
    public synchronized static DbConnMultithreaded getInstanceSync(){
        if(instance == null){
            System.out.println("Creating Object...");
            instance = new DbConnMultithreaded();
        }
        return instance;
    }    

    public void doSomething(){

    }    
}
