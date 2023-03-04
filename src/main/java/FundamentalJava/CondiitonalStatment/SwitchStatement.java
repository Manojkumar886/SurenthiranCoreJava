package FundamentalJava.CondiitonalStatment;

import java.util.Scanner;

public class SwitchStatement
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

//        System.out.println("tell us your favoriate week days");
//
//        String day=scan.nextLine();
//
//        switch (day)
//        {
//            case "sunday" :
//                System.out.println("Sunday is Holiday and Rest Day");
//                break;
//            case "monday":
//                System.out.println("Monday is Week Working day is start");
//                break;
//            case "saturday":
//                System.out.println("Saturday is week end of the day");
//                break;
//            default:
//                System.out.println(day+" in the day is full working day-Any field");
//        }

//        char myinitial='m';
//
//        switch (myinitial)
//        {
//            case 'm':
//                System.out.println(" m letter is best alphabetical letter in the world");
//                break;
//            default:
//                System.out.println("wrong");
//        }
        System.out.println("please enter the number between 1 to 9");
        int number= scan.nextInt();

        switch (number)
        {
            case 1:
                System.out.println("your eligible for first person");
                break;
            case 9:
                System.out.println("your eligible for "+number+"th rank");
                break;
            default:
                System.out.println(number+" in this number is wrong");
        }
    }
}
