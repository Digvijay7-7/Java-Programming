import java.io.*;
class FileCPY
{
	public static void main(String[] args){
		FileInputStream in;
		FileOutputStream out;
		try{
			in=new FileInputStream("input.txt");
			out=new FileOutputStream("output.txt");
			int c;
			while((c=in.read())!=-1){
				out.write(c);
				System.out.println((char)c);
			}
			in.close();
			out.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
