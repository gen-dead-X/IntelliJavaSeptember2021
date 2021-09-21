package com.cons1.Animal;

public class dog extends Animal {
    double weight;
    int move_speed;

    public dog(String name,  int tail, double weight , int move_speed) {
        super("Dog", name,1, 2 ,1 );
        this.weight = weight;
        this.move_speed = move_speed;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void can_move(int speed) {
        System.out.println("can_Move() is called. Not Super. The move speed is : " + move_speed);
        System.out.println("So,the run speed is : " + speed*2);
    }

    public void can_move(double speed){
        this.move_speed = (int)speed;
        super.can_move(move_speed);
    }

    @Override
    public void can_hunt(int attack) {
        super.can_hunt(attack);
    }

    public void can_hunt(double attack){
        System.out.println("Damage Potential : " +  attack*2.5);
    }

    public int getMove_speed() {
        return move_speed;
    }
}

