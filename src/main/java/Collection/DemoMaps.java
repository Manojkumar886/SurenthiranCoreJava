package Collection;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class DemoMaps
{
    public static void main(String[] args)
    {
//        Hashtable<String,Integer> Nameage=new Hashtable<String ,Integer>();
//
//        Nameage.put("Manojkumar",22);
//        Nameage.put("surendhiran",23);
//        Nameage.put("Annamalai",27);
//        Nameage.put("Razak",20);
//
//        System.out.println(Nameage);

        TreeMap<String,MasalaItems> obj=new TreeMap<String,MasalaItems>();
        MasalaItems item1=new MasalaItems("Sakthimasala","RasamPowder",19.2f,'W',98826726726267l);
       MasalaItems item2 =new MasalaItems("Sakthimasala","zChilliPowder",98.3f,'A',29898989389298l);
        MasalaItems item3 =new MasalaItems("Sakthimasala","SambarPowder",23.2f,'B',27287287882l);

                obj.put("Manojkumar",item1);
                obj.put("Ravi",item2);
                obj.put("razak",item3);
                obj.put("Annamalai",item2);
                obj.put("aarthi",item1);
        System.out.println(obj);

        System.out.println(obj.entrySet());


//        System.out.println(obj);

        for(Map.Entry newobj: obj.entrySet())
        {
            System.out.println("My Key value :"+newobj.getKey()+"\nMy Value Class"+newobj.getValue());
        }


    }
}
