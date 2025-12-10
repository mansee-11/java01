import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class lect20 {

    static void writeData(String data)
    {
        try
        {
            FileWriter writer=new FileWriter(data); //to overwrite the data
            writer.write(data);
            writer.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    static void AppendData(String data)
    {
        try
        {
            FileWriter writer=new FileWriter("New.txt",true); //to append data after exixting data
            writer.write(data);
            writer.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    static void ReadData()
    {
        try
        {
            FileReader reader=new FileReader("New.txt");
            int ch;
            while ((ch =reader.read())!=-1)     //to read each char one by one
            {
                System.out.print((char)ch);
            }
            reader.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    static void DeleteFile()
    {
        try
        {
            File file=new File("New.txt");
            if(file.delete())
            {
                System.out.println("file deleted");
            }
            else
            {
                System.out.println("not deleted");
            }
        } catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        /*
        try
        {
            File file =new File("New.txt");
            if(file.createNewFile())
            {
                System.out.println("new file created "+file.getName()); //to get name of file
                System.out.println("path of file "+file.getAbsoluteFile()); //to get path
                System.out.println("path of file "+file.getAbsolutePath()); //to get path of file
            }
            else
            {
                System.out.println("file already exists");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        */
        writeData("hello jiii");
        AppendData("\nbyy jii");
        ReadData();
        //DeleteFile();
        // to only delete data
        writeData("");
        ReadData();
    }
}