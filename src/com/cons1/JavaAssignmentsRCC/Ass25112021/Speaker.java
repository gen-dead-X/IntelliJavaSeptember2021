package com.cons1.JavaAssignmentsRCC.Ass25112021;

interface Speaker
{
    void speak();
}
class Lecturer implements Speaker
{
    public void speak()
    {
        System.out.println("This is Lecturer");
    }
}
class Politician implements Speaker
{
    public void speak()
    {
        System.out.println("This is Politician");
    }
}
class Q5
{
    public static void main(String args[])
    {
        Speaker sp;
        sp=new Lecturer();
        sp.speak();

        sp=new Politician();
        sp.speak();
    }
}
