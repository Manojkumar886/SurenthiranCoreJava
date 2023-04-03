package Polymorphism;

public class OverridingPerforamnce
{
    public static void main(String[] args)
    {
//        parentclass obj=new Childclass(); //upcasting-object is created by parent class but referenced by childclass-i got a o/p in childclassmethod
        MethodOverriding1 obj=new MethodOverriding2();
        obj.Statename("Tamilnadu","Kerala");

        MethodOverriding1 obj1=new MethodOverriding1();
        obj1.Statename("Kerala","Andhra");


    }
}
