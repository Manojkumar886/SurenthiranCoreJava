package ConsoleApplication;

public class MyMainApplication
{
    public static void main(String[] args)
    {
        InsertedValues insert=new InsertedValues();
        Thread th=new Thread(insert,"Manojkumar");
        Thread th2=new Thread(insert,"Surendhar");
        Thread th3=new Thread(insert,"annamalai");

        th.start();
        th2.start();
        th3.start();

    }
}
