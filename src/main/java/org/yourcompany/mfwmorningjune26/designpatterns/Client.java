package org.yourcompany.mfwmorningjune26.designpatterns;

import org.yourcompany.mfwmorningjune26.designpatterns.multithreaded.DbConnMultithreaded;

public class Client {
    public static void main(String[] args) {
        DBConn d1 = DBConn.getInstance();
        DBConn d2 = DBConn.getInstance();

        System.out.println("d1: " + d1);
        System.out.println("d2: " + d2);


        DbConnMultithreaded dbC1 = DbConnMultithreaded.getInstance();
        DbConnMultithreaded dbC2 = DbConnMultithreaded.getInstance();

        System.out.println("dbC1: " + dbC1);
        System.out.println("dbC2: " + dbC2);

    }
}
