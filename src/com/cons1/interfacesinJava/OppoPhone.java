package com.cons1.interfacesinJava;

public class OppoPhone implements IOppo{

    private int myNumber;
    private boolean isRinging = true;

    public OppoPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("You can Now make calls!");
    }

    @Override
    public void answer() {
        if(isRinging()) {
            System.out.println("Recieving The Call!");
            isRinging = false;
        }
    }

    @Override
    public void dial(int PhoneNumber) {
        System.out.println("Now Ringing " + PhoneNumber + " on Oppo Phone!");
    }

    @Override
    public boolean callPhone(int PhoneNumber) {
        if (PhoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Calling the Number " + PhoneNumber + " Ring Ring!");
        }
        else
            isRinging = false;
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
