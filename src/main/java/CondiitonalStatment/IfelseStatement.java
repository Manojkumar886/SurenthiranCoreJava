package CondiitonalStatment;

import java.util.Scanner;

public class IfelseStatement
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        System.out.println("what is your age-check for categories");

        int myuservalue=scan.nextInt();

        if(myuservalue<=29)//
        {
            System.out.println("In this type of user category is Younger");
        }
        else
        {
            System.out.println("in this type of user category is familyman");
        }


    }
}
