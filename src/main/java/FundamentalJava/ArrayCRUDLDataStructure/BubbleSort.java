package FundamentalJava.ArrayCRUDLDataStructure;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort
{
    public static void main(String[] args)
    {
        double[] pointers={45.3,45.5,56.5,98.9,89.9,65.7,69.1,11.2,32.1,1.1,66.6};
        System.out.println("Before Sorting a array values "+ Arrays.toString(pointers));

        for(int i=0;i<pointers.length;i++)
        {
            for(int j=0;j< pointers.length-i-1;j++)
            {
               if(pointers[j]<pointers[j+1])//45.3<45.5
               {
                   double swaping=pointers[j]; //swapping=45.3
                   pointers[j]=pointers[j+1]; //j=45.5
                   pointers[j+1]=swaping;// j+1= 45.3
               }
            }
        }

        System.out.println("Aftyer sorting a Array values"+Arrays.toString(pointers));
    }
}
