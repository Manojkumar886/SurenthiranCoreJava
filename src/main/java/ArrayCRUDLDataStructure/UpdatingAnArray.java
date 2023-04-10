package ArrayCRUDLDataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class UpdatingAnArray
{
    public static void main(String[] args)
    {
        UpdatingValues();
    }

    public static void UpdatingValues()
    {
        Long AadharNumbers[]={896754673454l,78563554873l,896745321324l,123456785423l,875654678968l,908780907067l};

        System.out.println("Before updating my AadharDetails"+ Arrays.toString(AadharNumbers));

        Scanner scan=new Scanner(System.in);
        System.out.println("which index of value you want update");
        int index=scan.nextInt();//geetting a index value -
        System.out.println(index+" in  the position which value you want add");
        Long newAadharno=scan.nextLong();//getting a new value for that index of position
        AadharNumbers[index]=newAadharno;//change a old value to new value for the array updating
        System.out.println("After updating my Aadhar Details "+Arrays.toString(AadharNumbers));

//        for(int pos=0;pos<6;pos++)//updating a array value print a for loop
//        {
//            System.out.println(AadharNumbers[pos]);
//        }
    }
}
