package Inheritance.MultilevelInheritance;

public class BEStudent extends Student
{
    public void BEStudentSkillSet()
    {
        System.out.println("BE Catogory peoples are knowledge in Electrical,Programming Knowledge,Building Knowledge........");
    }

    public static void main(String[] args)
    {
        BEStudent be=new BEStudent();
        be.BECategory();//this method is  local variable using other class .that class name is Student
        be.BEStudentSkillSet();//this is also local variable in same class
    }
}
