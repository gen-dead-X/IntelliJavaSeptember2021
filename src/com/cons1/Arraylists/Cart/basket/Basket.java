package com.cons1.Arraylists.Cart.basket;

import java.util.ArrayList;

public class Basket {
    ArrayList<String>myBasket = new ArrayList<String>();

    public void printBasket(){
        System.out.println("You have " + myBasket.size() + " items" );
        for (int i = 0 ; i < myBasket.size() ; i++)
            System.out.println((i+1) + ". " + myBasket.get(i));
    }

    public void addBasket(String item){
        myBasket.add(item);
    }

    public void removeBasket(int position){
        String theItem = myBasket.get(position);
        myBasket.remove(position);
    }

    public void modifyBasket(int position, String item){
        myBasket.set(position, item);
        System.out.println("Basket item at " + (position + 1) + " is updated!");
    }

    public String findBasket(String item){
        int position = myBasket.indexOf(item);
        if(position >= 0)
            return myBasket.get(position);
        return null;
    }

}
