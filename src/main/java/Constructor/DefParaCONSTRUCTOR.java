package Constructor;

public class DefParaCONSTRUCTOR
{
    String AccountHolderName;
    Long AccountNo;
    double AccountBalance;

    public  DefParaCONSTRUCTOR()//Default constructor
    {
        System.out.println("Welcome to Default Constructor");
        AccountHolderName="Manojkumar";
        AccountBalance=8900.0;
        AccountNo=607196538209l;
        System.out.println("AccountHolder is :"+AccountHolderName+"\n AccountBalance :"+AccountBalance+"\n Account Number :"+AccountNo);
    }
    public DefParaCONSTRUCTOR(String AccountHolderName,Long Accountno,Double AccountBalance)
    {
        this.AccountHolderName=AccountHolderName;//
        AccountNo=Accountno;
        this.AccountBalance=AccountBalance;
        System.out.println("AccountHolder is :"+AccountHolderName+"\n AccountBalance :"+AccountBalance+"\n Account Number :"+Accountno);
    }
    public static void main(String[] args)
    {
//        Classname objname=bnew Constructorname(or)MethodName;
        DefParaCONSTRUCTOR def=new DefParaCONSTRUCTOR();//Initialization an object is called constructor
        DefParaCONSTRUCTOR def1=new DefParaCONSTRUCTOR("Surenthiran",978937837763l,89000.0);

    }

}
