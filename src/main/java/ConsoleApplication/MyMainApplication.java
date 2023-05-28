package ConsoleApplication;

public class MyMainApplication
{
    public static void main(String[] args)
    {
//        InsertedValues insert=new InsertedValues();
//        Thread th=new Thread(insert,"Manojkumar");
//        Thread th2=new Thread(insert,"Surendhar");
//        Thread th3=new Thread(insert,"annamalai");
//
//        th.start();
//        th2.start();
//        th3.start();

//        CollectionExecution collect=new CollectionExecution();
//        Thread th1=new Thread(collect,"Nivash");
//        Thread th2=new Thread(collect,"Nandhakumar");
//        Thread th3=new Thread(collect,"Manikandan");
//
//        th1.start();
//        th2.start();
//        th3.start();

        FileExecution files=new FileExecution();
        Thread th1=new Thread(files,"Nivash");
        Thread th2=new Thread(files,"Nandhakumar");
        Thread th3=new Thread(files,"Manikandan");

        th1.start();
        th2.start();
        th3.start();


    }
}
