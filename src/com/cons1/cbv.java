package com.cons1;

public class cbv {
    
    String model;
    String name;
    String type;
    
    protected void accept_model(String model){
        this.model = model;
        if(this.model.equals("Mercedes") ||  this.model.equals("Maclaren")){
            System.out.println("Good one");
        }
        else
            System.out.println("Bad Choice");
    }
}

