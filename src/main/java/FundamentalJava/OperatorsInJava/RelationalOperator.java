package FundamentalJava.OperatorsInJava;

import java.util.Scanner;

public class RelationalOperator
{
    //Relational Operator -   >,<,>=,<=,+==,!=
    public static void main(String[] args)
    {
        int myAge;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please tell us your age ....!");
        myAge=scan.nextInt();

        System.out.println("Your age is "+myAge+" -in this age is eligible to term insurance- " +(myAge>=35));

    }

}
