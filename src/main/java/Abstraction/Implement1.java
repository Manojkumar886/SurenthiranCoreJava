package Abstraction;

public class Implement1 extends AdditionPrograms
{

    @Override
    public void ArithemeticOperator(int a, int b)
    {
        int c=a*b;
        System.out.println(c);
    }

    @Override
    public void additional(int a, int b) {

    }

    public static void main(String[] args)
    {
        Implement1 imple=new Implement1();
        imple.AdditionMethod(55,55);
        imple.ArithemeticOperator(55,55);

  }
}
