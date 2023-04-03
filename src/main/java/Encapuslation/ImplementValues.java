package Encapuslation;

public class ImplementValues
{
    public static void main(String[] args)
    {
        ProgrammingFeeStructure fees=new ProgrammingFeeStructure();
        fees.setLanguageName("CoreJAVA");
        fees.setLanguageFees(8000);
        fees.setDuration(2);
        fees.setType('A');
        fees.setItProvideJob(false);

        System.out.println(fees.getLanguageName()+fees.getItProvideJob()+fees.getLanguageFees()+fees.getDuration()+fees.getType()+fees.getItProvideJob());

    }
}
