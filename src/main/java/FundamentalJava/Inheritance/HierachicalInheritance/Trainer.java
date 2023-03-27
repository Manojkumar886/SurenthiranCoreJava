package FundamentalJava.Inheritance.HierachicalInheritance;

public class Trainer extends Human
{
    public void  TrainerProcess()
        {
            System.out.println(": a person who trains someone or something: such as. : \none whose occupation is to guide or instruct people in fitness and exercise routines.");
    }

    public static void main(String[] args) {
        Trainer trainer=new Trainer();
        trainer.TrainerProcess();
        trainer.HumanTypes();
    }
}
