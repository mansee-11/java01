import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class notesapp {
    static void Createfile(String data)
    {
        try
        {
            File file =new File(data);
            if(file.createNewFile())
            {
                System.out.println("new file created "+file.getName()); //to get name of file
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
    }
    static void writeData(String name,String data)
    {
        try
        {
            FileWriter writer=new FileWriter(name); //to overwrite the data
            writer.write(data);
            writer.close();
            System.out.println("DONE");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    static void AppendData(String name,String data)
    {
        try
        {
            FileWriter writer=new FileWriter(name,true); //to append data after exixting data
            writer.write(data);
            writer.close();
            System.out.println("DONE");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    static void ReadData(String name)
    {
        try
        {
            FileReader reader=new FileReader(name);
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
    static void DeleteFile(String name)
    {
        try
        {
            File file=new File(name);
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
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);

        System.out.println("1:-create new note");
        System.out.println("2:-create new note and add data in it");
        System.out.println("3:-add data in exixting note");
        System.out.println("4-overwrite in exixting note");
        System.out.println("5-delete note");
        System.out.println("6:-read data in file");
        System.out.println("enter your choice from 1-6:-");
        int c= sc.nextInt();

        switch (c)
        {
            case 1:
            {
                System.out.println("enter file name:-");
                String name= sc.next();
                name+=".txt";
                Createfile(name);
                break;
            }
            case 2:
            {
                System.out.println("enter file name:-");
                String name= sc.next();
                name+=".txt";
                Createfile(name);
                sc.nextLine();
                System.out.println("enter data:-");
                String d=sc.nextLine();
                writeData(name,d);
                break;
            }
            case 3:
            {
                System.out.println("enter name of existing file :-");
                String name= sc.next();
                name+=".txt";
                sc.nextLine();
                System.out.println("enter data to add:-");
                String d=sc.nextLine();
                AppendData(name,d);
                break;
            }
            case 4:
            {
                System.out.println("enter name of exesting file:-");
                String name= sc.next();
                name+=".txt";
                sc.nextLine();
                System.out.println("enter data to overwrite:-");
                String d=sc.nextLine();
                writeData(name,d);
                break;
            }
            case 5:
            {
                System.out.println("enter name of exixting file:-");
                String name= sc.next();
                name+=".txt";
                sc.nextLine();
                DeleteFile(name);
                break;
            }
            case 6:
            {
                System.out.println("enter name of exixting file:-");
                String name= sc.nextLine();
                name+=".txt";
                ReadData(name);
                break;

            }
            default:
                System.out.println("wrong choice input");
        }
    }
}
