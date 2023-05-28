package ConsoleApplication;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

//Encapsulation
@Data //Provided getter setter method
@NoArgsConstructor//Def-Constuctor
@AllArgsConstructor//PARA-Constructor
public class ElectricityBillManagement implements Comparable<ElectricityBillManagement>, Serializable
{
    private int Userid;
    private String Username;
    private Long Billnumber;
    private String Emailid;
    private String Address;
    private double Amount;


    @Override
    public int compareTo(ElectricityBillManagement o)
    {
        return getUsername().compareTo(o.Username);
    }
}
