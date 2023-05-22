package FileConcept;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadinganFile
{
    public static void main(String[] args) throws IOException {
        File file=new File("E:\\FundamentalJava\\Variable.txt");

        FileInputStream fis=new FileInputStream(file);
//        int size=fis.available();
        byte [] getttingAnValues=new byte[fis.available()];

        fis.read(getttingAnValues);
        String obj=new String(getttingAnValues);
        System.out.println(obj);

    }
}
