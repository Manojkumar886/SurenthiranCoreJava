package FundamentalJava.ArrayCRUDLDataStructure;

import java.util.Arrays;

public class SelectionSort
{
    public static void main(String[] args)
    {
        int [] array={45,65,34,33,23,23,68,78,11,8,56};

        SelectionSort obj=new SelectionSort();
        obj.SelectionSort(array);

        System.out.println("After sorting values"+Arrays.toString(array));

    }

    public  void SelectionSort(int[]array)
    {
        System.out.println("before sorting an array values"+ Arrays.toString(array));

        for(int a=0;a<array.length;a++)
        {
            for(int b=0;b<array.length;b++)
            {
                if(array[a]<array[b])
                {
                    array[a]^=array[b];  //  a=8
                    array[b]^=array[a]; // b=45

                    array[a]^=array[b]; /// a=45

                }
            }
        }
    }
}
