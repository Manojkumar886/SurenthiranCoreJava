package ConsoleApplication;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Encapsulation
@Data //Provided getter setter method
@NoArgsConstructor//Def-Constuctor
@AllArgsConstructor//PARA-Constructor
public class ElectricityBillManagement
{
    private int Userid;
    private String Username;
    private Long Billnumber;
    private String Emailid;
    private String Address;
    private double Amount;


}
