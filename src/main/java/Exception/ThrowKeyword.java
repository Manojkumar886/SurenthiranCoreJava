package Exception;

public class ThrowKeyword
{
//    throw keyword is used to customized/user defined exception has throw to use..
//    throw keyword is used to method definition

    public static void main(String[] args) {
        ThrowKeyword obj1=new ThrowKeyword();
        ThrowKeyword obj2;
        try
        {
            obj1.process();
        }
        catch(NullPointerException NPE)
        {
            System.out.println("null pointer exception is caughtto second time");
        }
    }
    private void process()
    {
        try
        {
            throw new NullPointerException();
        }
        catch (NullPointerException npe)
        {
            System.out.println("i have got a nullpointerexception");
            throw npe;
        }
    }
}
