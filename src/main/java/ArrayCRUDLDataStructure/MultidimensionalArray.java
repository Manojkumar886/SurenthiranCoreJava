package ArrayCRUDLDataStructure;

import java.util.Scanner;

public class MultidimensionalArray
{
    public static void main(String[] args)
    {
//        double WEIGHT [][]={{34.3,23.3,66},{77,88,99.9},{11,22,33.2}};//Declared multidimensional ARRAY using double datatype
//
//        for(int myrowvalue=0;myrowvalue<3;myrowvalue++)
//        {
//            for(int mycolumnvalue=0;mycolumnvalue<=2;mycolumnvalue++)
//            {
//                System.out.print(WEIGHT[myrowvalue][mycolumnvalue]+" ");
//            }
//            System.out.println();
//        }

        String [][] SUDHAMEDICAL1=new String[2][3]; //this is declared a size of multidimensional array

        SUDHAMEDICAL(SUDHAMEDICAL1);//this method is used to set values

        SUDHAMEDICALPATIENTDETAILS(SUDHAMEDICAL1);//LIST OF PATIENTDETAILS-using for each loop with nested

    }
    public static void SUDHAMEDICAL(String[][] newSUDHAMEDICAL1)
    {
        for(int myrowisFLOOR=0;myrowisFLOOR< newSUDHAMEDICAL1.length;myrowisFLOOR++)
        {
            //for( int i=0;0<mySUDHAMEDICAL1[0].length(3);i++
            for(int mycolumnisROOM=0;mycolumnisROOM<newSUDHAMEDICAL1[myrowisFLOOR].length;mycolumnisROOM++)
            {
                Scanner scan=new Scanner(System.in);//Declared a runtime values
                System.out.println("FLOOR NO IS "+myrowisFLOOR+" \t YOUR ROOM NO IS "+mycolumnisROOM+" \n WHAT IS THIS ROOM PATIENT NAME :");
                newSUDHAMEDICAL1 [myrowisFLOOR][mycolumnisROOM]=scan.next();
            }
        }
    }

    public static void  SUDHAMEDICALPATIENTDETAILS(String [][] newSUDHAMEDICAL1)
    {
        /*

         */
        for(String patientdetails[]:newSUDHAMEDICAL1)
        {
            for(String patientdetails1:patientdetails )
            {
                System.out.print(patientdetails1+" ");
            }
            System.out.println();
        }

    }


}
