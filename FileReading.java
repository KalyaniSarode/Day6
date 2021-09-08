package fileHandling;
import java.io.FileReader;
import java.io.IOException;

public class FileReading
{

	public static void main(String[] args) 
	{
		try
		
		{
			FileReader reader=new FileReader("output.txt");
			int charactor;
			while( ( charactor =reader.read())!=-1)
			{
				System.out.println((char) charactor);
			}
			reader.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
			
	}
}
