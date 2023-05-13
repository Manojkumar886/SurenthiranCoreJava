package MultiThreading;

public class DemoSynchronized
{
    public static void main(String[] args)
    {
        commonsynch synch=new commonsynch();
        Thread th1=new Thread()
        {
            public void run()
            {
                try {
                    synch.TableSample(5);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread th2=new Thread()
        {
            public void run()
            {
                try {
                    synch.TableSample(7);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        th1.start();
        th2.start();
    }

}

class commonsynch
{
 synchronized public void TableSample(int add) throws InterruptedException {
        for (int number=1;number>=5;number++)
        {
            System.out.println(number+"X"+add+"="+(number*add));
            Thread.sleep(2000);
        }

    }
}