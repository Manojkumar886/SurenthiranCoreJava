package FundamentalJava.ArrayCRUDLDataStructure;

import java.util.Scanner;

public class BinarySearch
{
    public static void main(String[] args)
    {
        int RegisterNumber[]={101,111,121,131,141,151,161,171,181};

        Scanner scan=new Scanner(System.in);
        System.out.println("Which person project you want need...?");
        int searchingvalue=scan.nextInt();
        System.out.println(searchingvalue+" in this number founded index is"+Bsearch(RegisterNumber,0, RegisterNumber.length, searchingvalue));
    }

    public static int Bsearch(int [] newperson,int start,int end,int newuser)
    {
        if(end>start)
        {
            int mid=(start+end)/2;
            if(newperson[mid]==newuser)
            {
                return mid;
            }
            else if (newperson[mid]>newuser)
            {
                return Bsearch(newperson,start,mid,newuser);
            }
            else if(newperson[mid]<newuser) {
                return Bsearch(newperson, mid + 1, end, newuser);
            }
        }
        return -1;

    }
}
