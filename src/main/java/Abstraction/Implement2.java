package Abstraction;

public class Implement2 extends AdditionPrograms
{

    public static void main(String[] args)
    {
        Implement2 obj=new Implement2();
        obj.additional(555,76);
        obj.ArithemeticOperator(233,232);
    }


    @Override
    public void ArithemeticOperator(int a, int b) {
        int c=a/b;
        System.out.println(c);
    }

    @Override
    public void additional(int a, int b)
    {
        System.out.println(a+b);
    }
}


