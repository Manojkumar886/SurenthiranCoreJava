package ConsoleApplication;

import java.io.IOException;

public interface ElectricityBillManagementActios
{
    public String AddnewCustomers(ElectricityBillManagement customer) throws IOException, ClassNotFoundException;//no implements  method
    public void ListallCustomerdetails();
    public void UpdatingCustomerdetails(String name);
    public void SearchingCustomerdetail(int userid);
    public void DeletingCustomerdetail(String name);

}
