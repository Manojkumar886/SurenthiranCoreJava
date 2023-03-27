package FundamentalJava.Inheritance.MultilevelInheritance;

public class MEStudent extends  BEStudent
{
    public void MasterDegreeBE()
    {
        System.out.println("Same as BE category peoples,but advance skills are learned");
    }

    public static void main(String[] args)
    {
     MEStudent me=new MEStudent();
     me.MasterDegreeBE();//main class methods name
        me.BEStudentSkillSet();//extends class
        me.BECategory();//already bestudent class is depended by student class so i have used for student class method
    }

}

