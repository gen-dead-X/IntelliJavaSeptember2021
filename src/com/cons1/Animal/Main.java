package com.cons1.Animal;
import  java.util.*;

public class Main {
    public static void main(String[] args) {

/*
        System.out.println("Enter 1.Name 2.Tail 3.Weight 4.Move Speed of the Dog");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int tail = sc.nextInt();
        double weight = sc.nextDouble();
        int move_speed = sc.nextInt();
*/
        int attack1 = 5;
        double attack2 = 4.0;

        dog my_dog1 = new dog("Mark" ,1 , 25.0 , 10 );
        dog my_dog2 = new dog("Mike" ,1 , 22.0 , 8 );
//        dog my_dog2 = new dog(name , tail , weight, move_speed);

        my_dog1.can_move(10);
        my_dog2.can_move(8);
        my_dog2.can_move(10.0);


        my_dog1.can_hunt(attack1);
        my_dog2.can_hunt(attack2);


    }

}
