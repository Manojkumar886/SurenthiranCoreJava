package ArrayCRUDLDataStructure;

import java.util.Scanner;

public class LinearSearch
{
    public static void main(String[] args)
    {
        double CGPA[]=new double[10];

        Scanner scans=new Scanner(System.in);

        //Getting a values in size of array using runtime(Scanner)
        for(int count=0;count< CGPA.length;count++)//init:0,0<10;0++
        {
            System.out.println("what your Current CGPA-Check for goverment property");
            CGPA[count]=scans.nextDouble();//CGPA[0]=7.6,CGPA[1]=9.9,CGPA[2]=8.8;
        }
        int length= CGPA.length;
        LinearSearch ls=new LinearSearch();
        System.out.println("which value of  CGPA you want...?");
        double mark=scans.nextDouble();
        ls.LSearch(CGPA,mark);

    }
    public void LSearch(double[] score,double mark)
    {
        int mypos=0;
        for(mypos=0;mypos< score.length;mypos++)
        {
            if(score[mypos]==mark)//55==55
            {
                System.out.println("your CGPA mark is  " + mark + " index is founded by = " + mypos);
                break;
            }
        }
        if ( mypos==score.length)
        {
        System.out.println("your value is not founded");
        }


    }
}
