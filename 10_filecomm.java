import java.io.*;
import java.util.Scanner;
class FileCLI{
public static void main(String args[])throws IOException
{
        String argument=args[0];
        File f = new File(argument);
        FileReader fr=null;
        FileWriter fw=null;
        if(f.exists()){
        try{
        fr=new FileReader(argument);
            int display;
            while ((display=fr.read()) != -1){
                System.out.print((char)display);
                }
            fr.close();
        }catch(IOException io){
            System.out.print("Sorry, File Not Found");
        }
    Scanner sc=new Scanner(System.in);
    String data="";
    System.out.print("\nDo you want to add data at the end of the file (yes/no) ? : ");
    String a = sc.nextLine();
    if("yes".equals(a)){
        fw=new FileWriter(argument);
        data= sc.nextLine();
        fw.write(data);
        fw.close();
    }
    }
    else{ 
        FileOutputStream fos=new FileOutputStream(argument);
        fos.close();
        System.out.print("File Created Successfully !");
        System.out.print("\nEnter data into file\n");
        Scanner sc=new Scanner(System.in);
        String data="";
        fw=new FileWriter(argument);
        data= sc.nextLine();
        fw.write(data);
        fw.close();
        }
}
}
