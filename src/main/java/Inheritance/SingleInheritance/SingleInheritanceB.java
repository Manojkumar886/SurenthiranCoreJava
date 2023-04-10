package Inheritance.SingleInheritance;

public class SingleInheritanceB extends  SingleInheritanceA
{
    public static void main(String[] args)
    {
        SingleInheritanceB obj=new SingleInheritanceB();
        obj.Tiger();
        obj.Dog();

    }

    public void Tiger()
    {
        System.out.println("Toger is gud running animal");
    }
}
