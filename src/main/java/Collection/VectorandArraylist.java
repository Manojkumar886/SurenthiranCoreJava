package Collection;

import java.util.ArrayList;
import java.util.Vector;

public class VectorandArraylist
{
//    set(index,object)// update,  add , addAll,  add(index,object), remove(index),   remove(object), contains ,get(index), indexOf(object), removeAll-only removed for original element, retainAll-only removed for dupliicates values
//    ArrayList bj=new ArrayList();

    public static void main(String[] args)
    {
        ArrayList list=new ArrayList();

        list.add("SakthiMasala");
        list.add(55);
        list.add(6.7);
        list.add(938283728392738l);
        list.add('A');


        Vector list1=new Vector();

        list1.addAll(list);
        list1.add("Sugan");
        list1.add(97893647847l);

        System.out.println(" my arralist value "+list);
        System.out.println("my vector value is "+list1);
//
//        list1.remove("Sugan");
//        System.out.println("Arraylist remove and original values :"+list1);

//        list1.removeAll(list);//only removed for original element
//        System.out.println(list1);

        list1.retainAll(list);
        System.out.println(list1);//only removed duplicates element




    }


}
