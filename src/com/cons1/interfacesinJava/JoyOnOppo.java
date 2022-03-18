package com.cons1.interfacesinJava;

public class JoyOnOppo {
    public static void main(String[] args) {
        IOppo JoysPhone;
        JoysPhone = new OppoPhone(798);
        JoysPhone.powerOn();
        JoysPhone.answer();
        JoysPhone.dial(456);
        JoysPhone.callPhone(798);
        JoysPhone.isRinging();

    }
}
