package FileConcept;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class WriteinEncrept
{
    public static void main(String[] args) throws IOException
    {
        File file=new File("E:\\Emcrptfile.txt");

        FileOutputStream fos=new FileOutputStream(file);

        DeflaterOutputStream dos=new DeflaterOutputStream(fos);

        Scanner scan=new Scanner(System.in);
        System.out.println("which content you added in this file");
        String mycontent= scan.nextLine();

        dos.write(mycontent.getBytes());

        System.out.println(file.getName()+" has written in success");
        dos.close();
        fos.close();


    }
}
