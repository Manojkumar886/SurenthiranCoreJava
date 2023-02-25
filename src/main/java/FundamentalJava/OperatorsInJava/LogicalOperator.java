package FundamentalJava.OperatorsInJava;

public class LogicalOperator
{
    public static void main(String[] args) {
        //and-&&,or-||,not-!

        String mystate = "Tamilnadu";
        String Firstbeststate = "Tamilnadu";

        int myheight = 177;
        int myweight = 77;

        System.out.println(mystate == Firstbeststate && myheight != myweight);//  true && true = true

        System.out.println(Firstbeststate == "Kerala" || "Tamilnadu"==mystate);//  false || true =true

        System.out.println(!(myheight>=77));//177>=77 =true ....False
    }
}
