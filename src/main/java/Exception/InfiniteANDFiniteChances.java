package Exception;

import java.util.Scanner;

public class InfiniteANDFiniteChances
{
    public static void main(String[] args)
    {
        InfiniteANDFiniteChances FF=new InfiniteANDFiniteChances();

        FF.finitechances(1);
//        infinite();


    }
    public static void infinite()
    {
        Scanner scan=new Scanner(System.in);
        try
        {
            System.out.println("enter your a value");
            int a=scan.nextInt();
            System.out.println("enter your b value");
            int b=scan.nextInt();
            System.out.println("a value is "+a+" b value is "+b+" a / b ="+a/b);
        }
        catch(ArithmeticException ar)
        {
            System.out.println(ar+" your b value is does not using zero,so change anything vaild value");
//            System.out.println("enter your a value");
//            int a=scan.nextInt();
//            System.out.println("enter your b value");
//            int b=scan.nextInt();
//            System.out.println("a value is "+a+" b value is "+b+" a / b ="+a/b);
            infinite();
        }
        finally {
            System.out.println("done...!");
        }
    }

    public void finitechances(int looping)
    {
        Scanner scan=new Scanner(System.in);
        try
        {
            System.out.println("enter your a value");
            int a=scan.nextInt();
            System.out.println("enter your b value");
            int b=scan.nextInt();
            System.out.println("a value is "+a+" b value is "+b+" a / b ="+a/b);
        }
        catch(ArithmeticException ar)
        {
            System.out.println(ar+" your b value is does not using zero,so change anything vaild value");
//            System.out.println("enter your a value");
//            int a=scan.nextInt();
//            System.out.println("enter your b value");
//            int b=scan.nextInt();
//            System.out.println("a value is "+a+" b value is "+b+" a / b ="+a/b);
            if(looping<3)
            {
                looping++;
                finitechances(looping);

            }
            else{
                System.out.println("maximum attempt is over");
            }

        }
        finally {
            System.out.println("done...!");
        }

    }
}
