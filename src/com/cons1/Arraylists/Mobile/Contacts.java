package com.cons1.Arraylists.Mobile;

import java.util.ArrayList;

import static com.cons1.Arraylists.Mobile.MobilePhone.searchContacts;

// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.
public class Contacts {
    ArrayList<String> myContacts = new ArrayList<String>();
    ArrayList<Long> myNumbers = new ArrayList<Long>();

    public void printContacts() {
        System.out.println("There are " + myContacts.size() + " contacts");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.print((i+1) + ". " + myContacts.get(i));
            System.out.print(" " + myNumbers.get(i) + " \n");
        }
    }

    public void addContacts(String contactName , long number){
        myContacts.add(contactName);
        myNumbers.add(number);
    }

    public void removeContacts(String contactName){
        if((searchContacts(contactName)) >= 0 ){
            myContacts.remove(searchContacts(contactName));
            myNumbers.remove(searchContacts(contactName));
        }
        else
            System.out.println("Contact Name Not found!");
    }

    public void editContacts(String contactName, String newName , long newNumber){
        if((searchContacts(contactName)) >= 0 ) {
            int position = searchContacts(contactName);
            myContacts.set(position, newName);
            myNumbers.set(position, newNumber);
        }
        else
            System.out.println("Contact Name Not found!");
    }

//    public void editContacts(String contactName, String newName){
//        if((searchContacts(contactName)) >= 0 )
//            myContacts.set((searchContacts(contactName)), newName);
//        else
//            System.out.println("Contact Name Not found!");
//    }

    private int searchContacts(String contactName){
        int position = myContacts.indexOf(contactName);
        if(position >= 0)
            return position;
        return -1;
    }

    public void searchContacts(String contactName, int position) {
        int pos = searchContacts(contactName);
        if(pos >= 1)
            System.out.println("Found Contact! At position " + pos);
        else
            System.out.println("Not found!");
    }
}
