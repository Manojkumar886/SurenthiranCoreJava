package Exception;

import java.util.InputMismatchException;

public class ThrowKeyword
{
//    throw keyword is used to customized/user defined exception has throw to use..
//    throw keyword is used to method definition

    public static void main(String[] args)
    {
        ThrowKeyword obj1=new ThrowKeyword();
        try
        {
            obj1.process(null);
        }
        catch (NullPointerException npe)
        {
            System.out.println("in this time my obj declaretion condition is executed");
        }
        catch(ArithmeticException ae)
        {
            System.out.println("in this time arithemetic exception will be executed");
        }


    }
    public void process(String obj)
    {
        try
        {
            System.out.println(obj.substring(3,4));
            throw new NullPointerException();
        }
        catch (NullPointerException npe)
        {
            System.out.println("in this time run a method block null pointer exception is executed");
            throw npe;
        }

    }
}
