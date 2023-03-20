package FundamentalJava.ArrayCRUDLDataStructure;

public class JaggedArray
{
    public static void main(String[] args)
    {
        int [][] ROOMAVAILABLEINAPARTMENT=new int[5][];
        ROOMAVAILABLEINAPARTMENT[0]=new int[7];
        ROOMAVAILABLEINAPARTMENT[1]=new int[5];
        ROOMAVAILABLEINAPARTMENT[2]=new int[3];
        ROOMAVAILABLEINAPARTMENT[3]=new int[6];
        ROOMAVAILABLEINAPARTMENT[4]=new int[2];

        /*
        0 - 1 2 3 4 5 6 7
        1 - 5 4 3 2 1
        2 - 8 0 0
        3 - 9 9 0 0 9 8
        4 - 7 6
         */
//        Declared a Values in roomsavailable in apartment

        int count=0;
        for(int floorno=0;floorno<ROOMAVAILABLEINAPARTMENT.length;floorno++)
        {
            for( int roomsmemberscount=0;roomsmemberscount<ROOMAVAILABLEINAPARTMENT[floorno].length;roomsmemberscount++)
            {
                ROOMAVAILABLEINAPARTMENT[floorno][roomsmemberscount]=count+=2;
            }
        }
//        PRINT A VALUES IN ROOMSVAILABLEINAPARTMENT

        for(int floorno=0;floorno<ROOMAVAILABLEINAPARTMENT.length;floorno++)
        {
            for( int roomsmemberscount=0;roomsmemberscount<ROOMAVAILABLEINAPARTMENT[floorno].length;roomsmemberscount++)
            {
                System.out.print(ROOMAVAILABLEINAPARTMENT[floorno][roomsmemberscount]+" ");
            }
            System.out.println();
        }
    }
}
