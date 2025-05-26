package org.example.mobile;

import java.util.Objects;

public class Contact {

    private String name;
    private  String phoneNumber;

public  Contact(String name, String phoneNumber){
    this.name=name;
    this.phoneNumber=phoneNumber;


}

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

   static String createContact(String name, String phoneNumber){
    return createContact(name,phoneNumber);
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Contact contact = (Contact) object;
        return Objects.equals(name, contact.name) && Objects.equals(phoneNumber, contact.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumber);
    }
}
