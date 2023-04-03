package Polymorphism;

public class MethodOverriding2 extends MethodOverriding1
{
    public void Statename(String state1,String state2)
    {
       if(state1=="Tamilnadu")
       {
           System.out.println("This is my statename");
       } else if (state2=="Kerala")
       {
           System.out.println("my statename is kerala");
       }
       else {
           System.out.println("my statename is anyone");
       }
    }
}
