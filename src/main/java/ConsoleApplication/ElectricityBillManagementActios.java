package ConsoleApplication;

public interface ElectricityBillManagementActios
{
    public String AddnewCustomers(ElectricityBillManagement customer);//no implements  method
    public void ListallCustomerdetails();
    public void UpdatingCustomerdetails(String name);
    public void SearchingCustomerdetail(int userid);
    public void DeletingCustomerdetail(String name);

}
