package FileConcept;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class DemoSecureRead
{
    public static void main(String[] args) throws IOException
    {
        File file=new File("E:\\Emcrptfile.txt");
        FileInputStream fis=new FileInputStream(file);
        InflaterInputStream iis=new InflaterInputStream(fis);

        byte[] temp=new byte[fis.available()];
        iis.read(temp);
        System.out.println(new String(temp));

        iis.close();
        fis.close();
    }
}