package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class DemoSet
{
    public static void main(String[] args)
    {
        TreeSet<Double> Heights=new TreeSet<Double>();

        Heights.add(84.2);
        Heights.add(12.2);
        Heights.add(24.2);
        Heights.add(36.2);
        Heights.add(48.2);
        Heights.add(60.2);
        Heights.add(72.2);
        Heights.add(96.2);

        System.out.println(Heights);

        HashSet<Double> HeightsDemo1=new HashSet<Double>();

        HeightsDemo1.addAll(Heights);

        Iterator<Double> it=HeightsDemo1.iterator();

        while(it.hasNext())//Boolean-True/False
        {
            System.out.println(it.next()+" demo values");
        }
    }

}
