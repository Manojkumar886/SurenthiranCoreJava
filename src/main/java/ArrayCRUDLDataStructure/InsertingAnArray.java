package ArrayCRUDLDataStructure;

import java.util.Scanner;

public class InsertingAnArray
{
    public static void main(String[] args)
    {
//        char [] StackChar=new char[10];//declared array variable using fixed size
//        StackChar[2]='C';
//        System.out.println(Arrays.toString(StackChar));
        Scanner scan=new Scanner(System.in);

//        for(int pos=0;pos<StackChar.length;pos++)
//        {
//            System.out.println("what is your stackchar value");
//            StackChar[pos]=scan.next()
//        }

        double CGPA[]=new double[10];

        Scanner scans=new Scanner(System.in);

        //Getting a values in size of array using runtime(Scanner)
        for(int count=0;count< CGPA.length;count++)//init:0,0<10;0++
        {
            System.out.println("what your Current CGPA-Check for goverment property");
            CGPA[count]=scans.nextDouble();//CGPA[0]=7.6,CGPA[1]=9.9,CGPA[2]=8.8;
        }

        for(double percentage:CGPA)//print a array value in for-each method
        {
            System.out.println("my CGPA value is :"+percentage);
        }


    }
}
