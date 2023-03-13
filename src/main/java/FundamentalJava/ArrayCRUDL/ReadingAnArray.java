package FundamentalJava.ArrayCRUDL;

import java.util.Scanner;

public class ReadingAnArray
{
    public static void ReadingAnPos() //this is static method
    {
        float AnnualIncome[]={3.6f,2.6f,2.4f,7.8f,9.9f,5.6f};
//        System.out.println(AnnualIncome[3]);//7.8

        Scanner Scan=new Scanner(System.in);
        System.out.println("which position value you want need for your salary");
        int myposition=Scan.nextInt();
        System.out.println("Your need annual income is "+AnnualIncome[myposition]);
    }

    public void ReadingANStartTOEND()
    {
        String FruitsName[]={"Banana","Orange","Apple","Mango","Watermelon","KIKI"};
        Scanner scan=new Scanner(System.in);
        System.out.println("what is your starting value");
        int firstvalue=scan.nextInt();
        System.out.println("what is your end value");
        int lastvalue=scan.nextInt();
        for(;firstvalue<=lastvalue;firstvalue++)
        {
            System.out.println("your values are ;"+FruitsName[firstvalue]);
        }
    }

    public static void main(String[] args)
    {
        ReadingAnArray obj=new ReadingAnArray();
        obj.ReadingANStartTOEND();
        ReadingAnPos();


    }
}
