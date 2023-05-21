package ConsoleApplication;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class CollectionExecution implements ElectricityBillManagementActios,Runnable
{
    TreeSet<ElectricityBillManagement> gov=new TreeSet<ElectricityBillManagement>();

    public CollectionExecution()
    {
        gov.add(new ElectricityBillManagement(9808,"Manojkumar",827382739628736l,"Manojmano@gmail.com","Namakkal",89.0));
        gov.add(new ElectricityBillManagement(9810,"Aarthi",78328733356l,"AarthiAyyanar@gmail.com","KandhamPatti",239.0));
    }

    @Override
    public String AddnewCustomers(ElectricityBillManagement customer)
    {
        gov.add(customer);
        return customer.getUsername()+"has been added successfully";
    }

    @Override
    public void ListallCustomerdetails()
    {
        Iterator<ElectricityBillManagement> it= gov.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
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
//        Iterator<ElectricityBillManagement> it=gov.iterator();
//        while (it.hasNext())
//        {
//            if(it.next().getUsername()==name)
//            {
//                gov.remove(it.next());
//                System.out.println(it.next()+"has been deleted");
//            }
//            System.out.println(it.next());
//            break;
//        }
    }

    @Override
    synchronized public void run()
    {
        System.out.println("currently accessed person name by "+Thread.currentThread().getName()+" welcome");
        Scanner scan=new Scanner(System.in);
        CollectionExecution collect=new CollectionExecution();
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
                    System.out.println(collect.AddnewCustomers(customer1));
                    break;
                case 2:
                    System.out.println("Electricity customer details is viewed");
                    collect.ListallCustomerdetails();
                    break;
                case 3:
                    System.out.println("which customer name you want update");
                    String customer=scan.next();
                    collect.UpdatingCustomerdetails(customer);
                    break;
                case 4:
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("which name you want delete to electricity bill management");
                    String username= scan.next();
                    collect.DeletingCustomerdetail(username);
                    break;
                default:
                    return;
            }
        }
        while (true);
    }
}
