package FundamentalJava.Variables;

public class VariableTypes
{
    Long mymobileno=9789455567876L;  //global variable

   static double percentage=89.9;  //static variable

    public static void main(String[] args)
    {
        VariableTypes object=new VariableTypes(); //object creation is created by class ,performed by outside a methods...

        object.samplelocal();//called by local varible

        String myaccountholder="Manojkumar";//Instance Variable

        System.out.println("mypercentage is "+percentage);
        System.out.println("Thank you");
        manage();//static method
    }

    public void samplelocal()
    {
        int myvalue=10;  //local variable
        float myfloatvalue=myvalue; //widening

        System.out.println("my value is "+myvalue+" my float value is "+myfloatvalue);

        System.out.println("my mobile no is "+mymobileno);//accessed by global variable
    }
    static
    {
        System.out.println("welcome to java variable types");
    }


    public static  void manage()
    {
        System.out.println("this processs is manage to variables");
    }
}
