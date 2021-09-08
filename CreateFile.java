package fileHandling;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args)  throws IOException 
	{
		// TODO Auto-generated method stub
	    // Accept a String
		String str ="File Handling in java using " + " FileWriter and FileReader";
		FileWriter fw =new FileWriter(" output.txt");
		
		for(int i=0;i< str.length();i++)
			
			fw.write(str.charAt(i));
			System.out.println("Create File is Successfull");
			
			
	}

}
