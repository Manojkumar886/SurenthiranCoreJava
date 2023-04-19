package ConsoleApplication;

import java.util.Scanner;

public class InsertedValues  implements  ElectricityBillManagementActios
{
    Scanner scan=new Scanner(System.in);
    ElectricityBillManagement [] managements=new ElectricityBillManagement[5];//Array declared by a class

    public InsertedValues()//Constructor-Initialize object
    {
        managements[0]=new ElectricityBillManagement(1001,"Manojkumar",887654535679l,"manojgeetha12.10.2001@gmail.com","7/234-1 Agaram,Elachipalayam",345.3);
        managements[1]=new ElectricityBillManagement(1002,"Surenthiran",7575656756756l,"Sura1@gmail.com","9/78-Salem",90.1);
        managements[2]=new ElectricityBillManagement(1003,"Annamalai",909097866545l,"Annamalais@gmail.com","56-12/Guhai,Salem",980);
    }

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        InsertedValues values=new InsertedValues();
        do
        {
            System.out.println("which process you want performing in your billing statement \n " +
                    "1.AddnewCustomerDetails\n2.ListallValues\n3.Update\n4.Search\n5.Sort\n6.Delete");
            int menuitem=scan.nextInt();
            switch (menuitem)
            {
                case 1:
                    System.out.println("new customer details are created by management Userid,username,billnumber,Emailid,address,amount");
                    ElectricityBillManagement customer1=new ElectricityBillManagement(scan.nextInt(), scan.next(), scan.nextLong(), scan.next(),scan.next(),scan.nextDouble());
                    System.out.println(values.AddnewCustomers(customer1));
                    break;
                case 2:
                    System.out.println("Electricity customer details is viewed");
                    values.ListallCustomerdetails();
                    break;
                case 3:
                    System.out.println("which customer name you want update");
                    String customer=scan.next();
                    values.UpdatingCustomerdetails(customer);
                    break;
                case 4:
                    System.out.println("");

                default:
                    System.out.println("not matching");
            }
        }
        while (true);
    }


    @Override
    public String AddnewCustomers(ElectricityBillManagement customer)
    {
        for(int i=0;i< managements.length;i++)
        {
            if(managements[i]==null)
            {
                managements[i]=customer;
                return customer.getUsername()+" has been added in electricity management successfully";
            }
        }
        return customer.getUsername()+" has not been added in your values";
    }

    @Override
    public void ListallCustomerdetails()
    {

        for(ElectricityBillManagement bill:managements)
        {
            System.out.println(bill);
        }

    }

    @Override
    public void UpdatingCustomerdetails(String name)
    {
        for(int index=0;index< managements.length;index++)
        {
            if(managements[index].getUsername().equalsIgnoreCase(name))
            {
                System.out.println(name+" which index calue you want update");
                System.out.println(managements[index]);
                String FieldName=scan.next();
                switch (FieldName)
                {
                    case "Username":
                        String newstud=scan.next();
                        managements[index].setUsername(newstud);
                        break;
                }
                System.out.println(FieldName+"has been updated"+name);
                return;
            }
        }

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
