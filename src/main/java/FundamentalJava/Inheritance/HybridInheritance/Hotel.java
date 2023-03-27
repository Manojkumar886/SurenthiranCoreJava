package FundamentalJava.Inheritance.HybridInheritance;

public class Hotel extends Meals implements BreakFastDetails,LunchDetails,DinnerDetails
{
    public void Hotels()
    {
        System.out.println("Choose from 39 available Salem hotels & save up to 80% on hotel booking online at Makemytrip. Hotels & resorts price range starts from Rs.510 to 3838 per night ...");
    }
    public static void main(String[] args)
    {

        Hotel Pavi=new Hotel();
        Pavi.Hotels();
        Pavi.DetailsofMeals();//Normal Class
        Pavi.BreakFast();//interface class
        Pavi.Lunch();//interface class
        Pavi.Dinner();//interface class
    }

    @Override
    public void BreakFast()
    {
        System.out.println("Breakfast is the first meal of the day usually eaten in the morning. The word in English refers to breaking the fasting period of the previous night.");
    }

    @Override
    public void Dinner()
    {
        System.out.println("Supper is used especially when the meal is an informal one eaten at home, while dinner tends to be the term chosen when the meal is more formal");
    }

    @Override
    public void Lunch()
    {
        System.out.println("Deli sandwiches.\n" +
                "Poke bowls.\n" +
                "Salads.\n" +
                "Noodle dishes.\n" +
                "Rice dishes.\n" +
                "Fruit dishes.");

    }
}
