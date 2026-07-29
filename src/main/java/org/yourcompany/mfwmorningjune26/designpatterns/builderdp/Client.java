package org.yourcompany.mfwmorningjune26.designpatterns.builderdp;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        Student student = null;
        try {
            student =  Student.getBuilder().setFirstName("Yash")
            .setLastName("Jain")
            .setAddress("Address")
            .setAge(29)
            .setBatchId("S123")
            .setCity("Bangalore")
            .setPhoneNumbers(new ArrayList<>())
            .setPsp(92.1)
            .setSecondaryEmail("sec@gmail.com")
            .setPrimaryEmail("primary@gmai.com")
            .build();
        } catch (Exception e) {
            System.out.println("Exception happened!");
        }

        System.out.println("Student: " + student);
    }
}
