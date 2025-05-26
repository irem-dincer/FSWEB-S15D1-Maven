package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;
import org.example.models.Grocery;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

  /*  PROJE1-
 Grocery grocery=new Grocery();
grocery.startGrocery();*/

//PROJE2-
        MobilePhone mobilePhone=new MobilePhone("0543 571 89 64",new ArrayList<>());
        mobilePhone.addNewContact(new Contact("irem" , "0526 981 36 78"));
        mobilePhone.addNewContact(new Contact("irem" , "0526 981 36 78"));
        mobilePhone.addNewContact(new Contact("aysel" , "0523 981 36 78"));
        mobilePhone.printContacts();

    }
}
