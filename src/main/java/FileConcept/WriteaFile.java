package FileConcept;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteaFile
{
    public static void main(String[] args) throws IOException {
        File file=new File("E:\\FundamentalJava\\BasicWriting.txt");
//        file.createNewFile();
//        System.out.println(file.getName()+" has beem created successfully");

        FileOutputStream fos=new FileOutputStream(file);

        Scanner scan=new Scanner(System.in);
        System.out.println("which content you added in this file");
        String mycontent= scan.nextLine();

        fos.write(mycontent.getBytes());

        System.out.println(file.getName()+" has been written successfully added");

        fos.close();

    }
}
