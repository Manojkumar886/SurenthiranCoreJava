package FundamentalJava;

import java.util.Scanner;
// liabrsary-->package-->class--->method
public class DemoScanner
{
    public static void main(String[] args)
    {

        String myoldname="surenthiran";//compile time
        System.out.println("myold name is "+myoldname);

        DemoScanner obj=new DemoScanner();//normal object creation
        //object cretaion-scanner //new-runtime memory allocation
        Scanner scan=new Scanner(System.in);

        System.out.println("what is your name");
        String myname=scan.nextLine();   //runtime

        System.out.println("what is your age");
        int myage=scan.nextInt();

        System.out.println("whata is your mobileno");
        Long mynumber= scan.nextLong();
        System.out.println("my mobile number is :"+mynumber);

        System.out.println("my age is:"+myage);
        System.out.println("my name is :"+myname);





    }
}
