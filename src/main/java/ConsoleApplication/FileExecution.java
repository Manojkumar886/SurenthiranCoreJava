package ConsoleApplication;

import java.io.*;
import java.util.*;

public class FileExecution implements ElectricityBillManagementActios,Runnable
{
    File mybillfill=new File("E:\\SurendaranCoreJava\\src\\main\\java\\ConsoleApplication\\Electricitybillfile.doc");

//    ArrayList<ElectricityBillManagement> goverment=new ArrayList<>();//Initilize anobject
        ArrayList<ElectricityBillManagement> goverment=null;//declared an object
    public void writing() throws IOException
    {
        FileOutputStream fos=new FileOutputStream(mybillfill);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(goverment);

        oos.close();
        fos.close();
        System.out.println("the object was successfully written to a your file........!");
    }

    public void reading() throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream(mybillfill);
        ObjectInputStream ois=new ObjectInputStream(fis);
        goverment=(ArrayList<ElectricityBillManagement>) ois.readObject();
        ois.close();
        fis.close();
    }

    public FileExecution()
    {
        System.out.println("welcome to everyone");
        goverment=new ArrayList<>();
    }

    @Override
    public String AddnewCustomers(ElectricityBillManagement customer)
    {
       try
       {

               reading();
               goverment.add(customer);
               writing();
       }
       catch (ClassNotFoundException cnfe)
       {
       }
       catch (IOException ie)
       {

       }
        return customer.getUsername()+"has been added";
    }

    @Override
    public void ListallCustomerdetails()
    {
        try
        {
            reading();
            Iterator<ElectricityBillManagement> it=goverment.iterator();
            while (it.hasNext())
            {
                System.out.println(it.next());
            }

        }
        catch (ClassNotFoundException  cnfe)
        {

        }
        catch (IOException io)
        {

        }
    }

    @Override
    public void UpdatingCustomerdetails(String name) {

    }

    @Override
    public void SearchingCustomerdetail(int userid) {

    }

    public void SortingCustomerdetails()
    {
        try
        {
            reading();
            Collections.sort(goverment);
            writing();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void DeletingCustomerdetail(String name)
    {
        try
        {
            reading();
            Vector<ElectricityBillManagement> temp=new Vector<ElectricityBillManagement>();
            temp.addAll(goverment);
            try
            {
                for (int i=0;i< temp.size();i++)
                {
                    if(temp.get(i).getUsername().equalsIgnoreCase(name))
                    {
                        goverment.remove(temp.get(i));
                        System.out.println(name+" has been deleted successfully");
                        writing();
                        break;
                    }
                }
            }
            finally {
                System.out.println("Deleted...!");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    synchronized public void run()
    {
        System.out.println("currently accessed person name by "+Thread.currentThread().getName()+" welcome");
        Scanner scan=new Scanner(System.in);
        FileExecution collect=new FileExecution();
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
                case 5:
                    System.out.println("sorting your values");
                    collect.SortingCustomerdetails();
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
