package ArrayCRUDLDataStructure;

import java.util.Scanner;

public class SearchingAnArray
{
    public static void main(String[] args)
    {
        String Bustypes[]={"TownBus","ATC","Volvo","SleeperCoach","PrivateBus","Mahindra-15","Coach-22","RouteBus","Express"};

//        SearchingAnArray search=new SearchingAnArray();
//        search.Checking(Bustypes,8);//Arguments is passed (one is array value another one is integer of array.length)


    }

    public void Checking(String[] VehicleDetails,int VehicleCount)//parameter is passed with arravalus and array length (any variable will be declared in arguaments)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("What type of bus your like");
        String myfavVehicle=scan.next(); //atc
        for(int index=0;index<VehicleCount;index++)
        {
            if(myfavVehicle.equalsIgnoreCase(VehicleDetails[index]))//ignoreAlphabets(any have uppercase and lowercase)
            {
                System.out.println(index+" in this position value is "+myfavVehicle+" - this is your favoriate vehicle type of bus");
                return;//suppose your favoriate value is first position then other process will be stop,so i have used return statement
            }
        }
    }
}
