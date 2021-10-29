package com.cons1.Arraylists.Cart;

import java.util.ArrayList;

public class Cart {
    ArrayList<String>myCart = new ArrayList<String>();

    public void printCart(){
        System.out.println("You have " + (myCart.size()) + " items." );
        for(int i = 0 ; i <myCart.size() ; i++)
            System.out.println((i+1) + ". " + myCart.get(i));
    }
    public void modifyCart(int position , String newItem){
        myCart.set(position , newItem);
        System.out.println("Cart item at " + (position + 1) + " is updated!" );
    }
    public void removeCart(int position){
        String theItem = myCart.get(position);
        myCart.remove(position);
    }

    public String findItem(String searchItems){
        int position = myCart.indexOf(searchItems);
        if(position > -1)
            return myCart.get(position);
        return null;
    }

    public void addCart(String item) {
        myCart.add(item);
    }
}
