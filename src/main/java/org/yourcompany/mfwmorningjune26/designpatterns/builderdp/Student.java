package org.yourcompany.mfwmorningjune26.designpatterns.builderdp;

import java.util.List;

// Lombok --> java.
public class Student {
    private String firstName;
    private String lastName;
    private Integer age;
    private Double psp;
    private String primaryEmail;
    private String secondaryEmail;
    private List<String> phoneNumbers;
    private Integer studentId;
    private String university;
    private String batchId;
    private String address;
    private String city;
    private String pincode;

    // Builder method - static. 
    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }

    

    // private constructor.
    private Student(StudentBuilder helper) {
        this.setFirstName(helper.getFirstName());
        this.setLastName(helper.getLastName());
    }

    // static inner class.
    static class StudentBuilder {
        private String firstName;
        private String lastName;
        private Integer age;
        private Double psp;
        private String primaryEmail;
        private String secondaryEmail;
        private List<String> phoneNumbers;
        private Integer studentId;
        private String university;
        private String batchId;
        private String address;
        private String city;
        private String pincode;

        public Student build() throws Exception{
        // Validate and throw exception from here......
        if(this.getFirstName() ==null || this.getLastName()==null){
            throw new Exception();
        }
            return new Student(this);
        }

        public StudentBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public StudentBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public StudentBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }
        public StudentBuilder setPsp(Double psp) {
            this.psp = psp;
            return this;
        }
        public StudentBuilder setPrimaryEmail(String primaryEmail) {
            this.primaryEmail = primaryEmail;
            return this;
        }
        public StudentBuilder setSecondaryEmail(String secondaryEmail) {
            this.secondaryEmail = secondaryEmail;
            return this;
        }
        public StudentBuilder setPhoneNumbers(List<String> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }
        public StudentBuilder setStudentId(Integer studentId) {
            this.studentId = studentId;
            return this;
        }
        public StudentBuilder setUniversity(String university) {
            this.university = university;
            return this;
        }
        public StudentBuilder setBatchId(String batchId) {
            this.batchId = batchId;
            return this;
        }
        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }
        public StudentBuilder setCity(String city) {
            this.city = city;
            return this;
        }
        public StudentBuilder setPincode(String pincode) {
            this.pincode = pincode;
            return this;
        }

        // getters
        public String getFirstName() {
            return firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public Integer getAge() {
            return age;
        }
        public Double getPsp() {
            return psp;
        }
        public String getPrimaryEmail() {
            return primaryEmail;
        }
        public String getSecondaryEmail() {
            return secondaryEmail;
        }
        public List<String> getPhoneNumbers() {
            return phoneNumbers;
        }
        public Integer getStudentId() {
            return studentId;
        }
        public String getUniversity() {
            return university;
        }
        public String getBatchId() {
            return batchId;
        }
        public String getAddress() {
            return address;
        }
        public String getCity() {
            return city;
        }
        public String getPincode() {
            return pincode;
        }
    }

    // End of Inner class.





    
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public Double getPsp() {
        return psp;
    }
    public void setPsp(Double psp) {
        this.psp = psp;
    }
    public String getPrimaryEmail() {
        return primaryEmail;
    }
    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }
    public String getSecondaryEmail() {
        return secondaryEmail;
    }
    public void setSecondaryEmail(String secondaryEmail) {
        this.secondaryEmail = secondaryEmail;
    }
    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }
    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
    public Integer getStudentId() {
        return studentId;
    }
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
    public String getUniversity() {
        return university;
    }
    public void setUniversity(String university) {
        this.university = university;
    }
    public String getBatchId() {
        return batchId;
    }
    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getPincode() {
        return pincode;
    }
    public void setPincode(String pincode) {
        this.pincode = pincode;
    }    

    

}
