package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTryandCatch
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int Avalue=0,Bvalue=0;
        try
        {
            System.out.println("A value :");
            Avalue=scan.nextInt();
            System.out.println("B value :");
            Bvalue=scan.nextInt();
            System.out.println(Avalue/Bvalue);
        }
        catch (ArithmeticException ar)
        {
            System.out.println(ar);
            try
            {
                System.out.println("A value :");
                Avalue=scan.nextInt();
                System.out.println("B value :");
                Bvalue=scan.nextInt();
                System.out.println(Avalue/Bvalue);
            }
            catch (InputMismatchException ime)
            {
                System.out.println(ime+" so only used numeric values");
                System.out.println("A value :");
                Avalue=scan.nextInt();
                System.out.println("B value :");
                Bvalue=scan.nextInt();
                System.out.println(Avalue/Bvalue);
            }
        }


    }
}
