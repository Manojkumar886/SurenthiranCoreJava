package ArrayCRUDLDataStructure;

import java.util.Arrays;

public class CreatingAnArray
{
    public void ArrayCreate()
    {
        String Technologies[]={"Html","Css","Bootstrap","JavaScritp","Node Js","React Js","Ajax","ScriptingLanguages"};//Array Declaration

        System.out.println("4 th index of value is :"+Technologies[4]);//Chehckimng For array value
        System.out.println("my array index length is "+Technologies.length);//print a array length(starting pointy is one)
//        System.out.println(Technologies);

//        for(int index=0;index<Technologies.length;index++)//for loop using print a array values
//        {
//            System.out.print(Technologies[index]+", ");
//        }

        //for-each looping
//        for(String tech:Technologies)
//        {
//            System.out.println(tech);
//        }

        //using Arrays.tostring method
        System.out.println(Arrays.toString(Technologies));

    }

    public static void main(String[] args)
    {
        CreatingAnArray obj=new CreatingAnArray();//object creation
        obj.ArrayCreate();

    }
}
