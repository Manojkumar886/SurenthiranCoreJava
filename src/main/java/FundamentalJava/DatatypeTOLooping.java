package FundamentalJava;

import java.util.Scanner;

public class DatatypeTOLooping
{
    static
    {
        System.out.println("Welcome to Zealous Tech Corp....!");
    }
    public static void main(String[] args)
    {
        int count=3;
        do
        {
            Scanner scan=new Scanner(System.in);
            System.out.println("Which process of IT Field you want learn ....\n SoftwareLanguages \n AndroidDevelopment \n Testing");
            String purpose=scan.next();
            switch (purpose)
            {
                case "SoftwareLanguages":
                    System.out.println("your are option is SoftwareLanguages \n Currently performed by language of \n JAVA \n PYTHON");
                    String opinion=scan.next();
                    switch (opinion)
                    {
                        case "JAVA" :
                            System.out.println(opinion+" your choose which amount process you want");
                            int price=scan.nextInt();
                            if(29000<=price)
                            {
                                System.out.println("your are eligible for JAVA FUll STACK DEVELOPMENT");
                                System.out.println("currently available");
                            } else if (price>=10000 && price<=20000)
                            {
                                System.out.println(price+" your choose this amount product language in java web development");
                            } else if (price<=10000 && price>=7000)
                            {
                                System.out.println("your are choose only CORE JAVA ");
                            }
                            else {
                                System.out.println( price+"not available for any languages");
                            }

                            break;
                        default:
                            System.out.println(opinion+" has language not avilable in my company");
                    }
                    break;
                case "AndroidDevelopment":
                    break;
                case "Tetsing":
                    break;
                default:
                    System.out.println(purpose+" has not available for this institude");
            }
            count--;
        }
        while(count<=3);
    }
}
