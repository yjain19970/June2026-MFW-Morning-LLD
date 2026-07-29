package org.yourcompany.mfwmorningjune26.designpatterns;

public class DBConn {

    private static DBConn instance = null;

    private String url;
    private String dbName;
    private String uName;
    private String pwd;

    private DBConn(){

    }

    // Not thread safe!!
    public static DBConn getInstance(){
        if(instance ==null){
            instance = new DBConn();
        }
        return instance;
    }

    public void doSomething(){

    }
}
