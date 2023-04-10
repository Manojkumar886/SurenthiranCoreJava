package Inheritance.Interface;

public class ConnectedInterfaceClass implements House
{
    public void RoomsDetails()// this is no implement method in House Interface class,so i have used for this class with impleted
    {
        System.out.println("Rooms details are Hall,Bedroom,PoojaRoom,Bathroom,Balcony......");
    }

    public static void main(String[] args)
    {
        ConnectedInterfaceClass cic=new ConnectedInterfaceClass();
        cic.RoomsDetails();

    }
}
