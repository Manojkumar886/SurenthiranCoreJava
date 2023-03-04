package FundamentalJava.CondiitonalStatment;

import java.util.Scanner;

public class ElseIFstatement
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        System.out.println("what is your age-check for categories");

        int myuservalue=scan.nextInt();

        if(myuservalue<=18)
        {
            System.out.println("this type of category is childish people");
        }
        else if(myuservalue >=18 && myuservalue<=29)
        {
            System.out.println("this type of category is younger people");
        }
        else if ( myuservalue>=29 && myuservalue <=50)
        {
            System.out.println("this type of category is family man peoples");
        }
        else {
            System.out.println("this type of category is old people");
        }

    }
}
