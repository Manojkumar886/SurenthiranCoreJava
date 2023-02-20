package FundamentalJava;

public class DemoTypecasting
{
    public static void main(String[] args)
    {
//        byte-->short-->char-->int--->long-->float-->double
        //widening-smaller datatype to largest datatype

        char bloodysweet='B';

        int myascinumber=bloodysweet;

        System.out.println("my blood is :"+bloodysweet+" convert a value ascinumber is :"+myascinumber);

        //narrowing-largest datatype to smallest datatype

        double myweight=59.78;
        int myholeweight=(int)myweight;

        long mobileno=97893558930L;

        int convertmobileno=(int) mobileno;

        System.out.println("my mobile number is "+mobileno+" is converted by integer"+convertmobileno);

        int mynumber=99;

        char value=(char)mynumber;
        System.out.println("my number is :"+mynumber+" is converted asni value is :"+value);



    }
}
