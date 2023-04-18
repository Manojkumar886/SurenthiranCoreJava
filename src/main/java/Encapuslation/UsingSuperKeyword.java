package Encapuslation;

public class UsingSuperKeyword
{
    public static void main(String[] args)
    {
        testingtool2 tt2=new testingtool2();
        tt2.display();

    }
}

class testingtool1
{
    int AlphavalueXY=200;

}

class testingtool2 extends  testingtool1
{
    int AlphavalueXY=450+super.AlphavalueXY;
    void display()
    {
        System.out.println("current class AlphavalueXY"+AlphavalueXY+" another class AlphavalueXY (superkeyword)"+super.AlphavalueXY);
    }

}
