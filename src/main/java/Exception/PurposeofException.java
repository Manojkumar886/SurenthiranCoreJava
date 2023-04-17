package Exception;

import java.util.Scanner;

public class PurposeofException
{
    public static void main(String[] args)
    {
        String makecreate="The verb “create” usually suggests newness or innovation.";
        Scanner scan=new Scanner(System.in);
        try
        {
            System.out.println("which index start/end value you want");
            System.out.println(makecreate.substring(scan.nextInt(),scan.nextInt()));
        }
        catch (StringIndexOutOfBoundsException siobe)
        {
            System.out.println(siobe+"your anything one value is out of length in string,you have declared below value for "+makecreate.length());
            System.out.println("another one chance/which index start/end value you want");
            System.out.println(makecreate.substring(scan.nextInt(),scan.nextInt()));
        }
        finally
        {
            System.out.println("Thank you");
        }
Staticmethod();
    }
public static void Staticmethod()
{
    Scanner newscan=new Scanner(System.in);

    try {
        int a=newscan.nextInt();
        int b=newscan.nextInt();
        System.out.println(a/b);
    }
    catch (ArithmeticException AE)
    {
        System.out.println(AE+ "this error is showing, ahything divided by zero is infinitive, your input b might not equal to zero");
        System.out.println("Try once again");
        int a=newscan.nextInt();
        int b=newscan.nextInt();
        System.out.println(a/b);
    }
    finally {
        System.out.println("Good");
    }

}

}
