package FundamentalJava.ArrayCRUDL;

import java.util.Scanner;

public class SearchingAnArray
{
    public static void main(String[] args)
    {
        String Bustypes[]={"TownBus","ATC","Volvo","SleeperCoach","PrivateBus","Mahindra-15","Coach-22","RouteBus","Express"};

        SearchingAnArray search=new SearchingAnArray();
        search.Checking(Bustypes,Bustypes.length);


    }

    public void Checking(String[] VehicleDetails,int VehicleCount)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("What type of bus your like");
        String myfavVehicle=scan.next(); //atc
        for(int index=0;index<VehicleCount;index++)
        {
            if(myfavVehicle.equalsIgnoreCase(VehicleDetails[index]))
            {
                System.out.println(index+" in this position value is "+myfavVehicle+" - this is your favoriate vehicle type of bus");
                return;
            }
        }
    }
}
