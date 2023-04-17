package Exception;

import java.io.IOException;

public class DemoCompileTimeException
{

    public static void main(String[] args) throws IOException,InterruptedException
    {
        Runtime run=Runtime.getRuntime();//default class and method
        Process pro;//abstract class
        pro=run.exec("notepad");
        Thread.sleep(8000);
        pro=run.exec("calc");
    }
}


//class Runtime
//{
//    private Runtime()//def-constructor
//    {
//
//    }
//    private static Runtime getRuntime()
//    {
//        return run;
//    }
//    private static java.lang.Runtime run=new Runtime();
//}