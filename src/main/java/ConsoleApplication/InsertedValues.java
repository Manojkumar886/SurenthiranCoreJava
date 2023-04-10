package ConsoleApplication;

import java.util.Arrays;
import java.util.Scanner;

public class InsertedValues  implements  ElectricityBillManagementActios
{
    ElectricityBillManagement [] managements=new ElectricityBillManagement[5];//Array declared by a class

    Scanner scan=new Scanner(System.in);

    public InsertedValues()//Constructor-Initialize object
    {
        managements[0]=new ElectricityBillManagement(1001,"Manojkumar",887654535679l,"manojgeetha12.10.2001@gmail.com","7/234-1 Agaram,Elachipalayam",345.3);
        managements[1]=new ElectricityBillManagement(1002,"Surenthiran",7575656756756l,"Sura1@gmail.com","9/78-Salem",90.1);
        managements[2]=new ElectricityBillManagement(1003,"Annamalai",909097866545l,"Annamalais@gmail.com","56-12/Guhai,Salem",980);
    }

    public static void main(String[] args)
    {
        InsertedValues values=new InsertedValues();
//        System.out.println(Arrays.toString(managements
//        ));
    }

    @Override
    public String AddnewCustomers()
    {
        return null;
    }

    @Override
    public void ListallCustomerdetails()
    {

    }

    @Override
    public void UpdatingCustomerdetails(String name)
    {

    }

    @Override
    public void SearchingCustomerdetail(int userid)
    {

    }

    @Override
    public void DeletingCustomerdetail(String name)
    {

    }
}
