package Collection;

import lombok.AllArgsConstructor;

import java.util.Iterator;
import java.util.TreeSet;

public class DemoTreeset
{

    public static void main(String[] args)
    {
        TreeSet<MasalaItems>  SakthiMasalas=new TreeSet<MasalaItems>();

        SakthiMasalas.add(new MasalaItems("Sakthimasala","zChilliPowder",98.3f,'A',29898989389298l));
        SakthiMasalas.add(new MasalaItems("Sakthimasala","SambarPowder",23.2f,'B',27287287882l));

        MasalaItems masala=new MasalaItems("Sakthimasala","RasamPowder",19.2f,'W',98826726726267l);
        SakthiMasalas.add(masala);// this also constructor calling

        Iterator<MasalaItems> it=SakthiMasalas.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }

}


@AllArgsConstructor //constructor called
class MasalaItems implements  Comparable<MasalaItems>
{
    String MasalaBrand;
    String MasalaName;
    float MasalaPrice;
    char MasalaType;
    long MasalaCode;



    @Override
    public String toString() {
        return "MasalaItems{" +
                "MasalaBrand='" + MasalaBrand + '\'' +
                ", MasalaName='" + MasalaName + '\'' +
                ", MasalaPrice=" + MasalaPrice +
                ", MasalaType=" + MasalaType +
                ", MasalaCode=" + MasalaCode +
                '}';
    }

    @Override
    public int compareTo(MasalaItems o)
    {
        return this.MasalaName.compareTo(o.MasalaName);
    }
}