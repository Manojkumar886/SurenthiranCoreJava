package Polymorphism;

public class MethodOverriding1
{
    public void Statename(String state1,String state2)
    {
        if((state1==state2)||(state1!=state2))
        {
            System.out.println("Your condition is true");
        }
        else {
            System.out.println("Your condition is false");
        }
    }
}
