package FileConcept;

import java.io.*;

public class SerializationFiles
{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file=new File("E:\\SurendaranCoreJava\\src\\main\\java\\FileConcept\\Object.doc");
//        file.createNewFile();
//        System.out.println(file.getName()+" has been created successfully");
//        FileOutputStream fos=new FileOutputStream(file);
//        ObjectOutputStream oos=new ObjectOutputStream(fos);
//        StudentDetails student1=new StudentDetails();
//        student1.Studentname="Manojkumar";
//        student1.Fathername="Madheswaran";
//        student1.Age=21;
//        student1.Salary=2.4;
//        oos.writeObject(student1);
//        oos.close();
//        fos.close();
        FileInputStream fis=new FileInputStream(file);

        ObjectInputStream ois=new ObjectInputStream(fis);

        StudentDetails student1=(StudentDetails) ois.readObject();

        System.out.println(student1.Studentname+"\t-Studentname\n"+student1.Age+"\t-Age\n"+student1.Salary+"\t-Salary\n"+student1.Fathername+"\t-Fathername\n");
    }
}
class StudentDetails implements Serializable
{
    String Studentname;
    String Fathername;
    int Age;
    double Salary;
}