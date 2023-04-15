package StringClass;

public class StringClass1
{
    int a1=0100;

    public static void main(String[] args)
    {
//        StringClass1 class1=new StringClass1();
//
//        System.out.println(class1.a1);

        String username1="Surenthiran";//Literal

        String username2=new String("Manojkumar"); //non-literal
//immutable
//        username2=username2.concat("Madheswaran");
//        username2=username2.replace("ManojkumarMadheswaran","Manojkumar");
//
//        System.out.println(username2);


        System.out.println(username2.charAt(4));
        System.out.println(username2.contains("noj"));//boolean =true/false

        String username3="manojkumar";

        System.out.println(username2.equals("manojkumar"));//false
        System.out.println(username2.equalsIgnoreCase(username3));//true

        System.out.println(username2.compareTo(username3)); //121-143=-23
        System.out.println(username2.compareToIgnoreCase(username3));  // 121-121=0

        System.out.println(username1.substring(5));
        System.out.println(username1.substring(0,5));

        String sentence="    Surenthiran -he is java stack developer    ";

        System.out.println(sentence);
        System.out.println(sentence.trim());

        String FavoriateHero="Thalapathy is my favoriate hero of pan india";

        String[] arrofsplit=FavoriateHero.split("o");

        for(String arr: arrofsplit)
        {
            System.out.print(arr+"A");
        }
    }
}
