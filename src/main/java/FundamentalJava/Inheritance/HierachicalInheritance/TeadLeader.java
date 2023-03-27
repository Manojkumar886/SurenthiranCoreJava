package FundamentalJava.Inheritance.HierachicalInheritance;

public class TeadLeader  extends Human
{
    public static void main(String[] args)
    {
        TeadLeader tl=new TeadLeader();
        tl.TeamLeaderProcess();
        tl.HumanTypes();
    }
    public void TeamLeaderProcess()
    {
        System.out.println("A Team Leader is a professional in charge of guiding, monitoring and leading an entire group. \n They are responsible for motivating their teammates as well as inspiring positive communication within them so that they can work together toward achieving goals.");
    }
}
