package fileHandling;
import java.io.*;
import org.apache.poi.hssf.usermodel. HSSFSheet;
import org.apache.poi.hssf.usermodel. HSSFWorkbook;
import org.apache.poi.ss.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

public class MyInfor{


public static <HSSFWorkbook> void main(String[] args) {
		// TODO Auto-generated method stub

	FileInputStream fs=new FileInputStream(new File(" C:\\kalyani\\workspace\\Day7"));
	HSSFWorkbook hb =new HSSFWorkbook(fs);
    HSSFSheet hs = hb.getSheetAt(0);	
    for( Row row:hs)
    {
 	   for(Cell cell:row)
 	   {
 		   switch(cell.getCellType())
 		   {
 		   case NUMERIC:
 			   System.out.println( cell.getNumericCellValue());
 	
 			   break;
 		   case STRING:
 			   System.out.println( cell.getStringCellValue());
 			   break;
 			   
 		   
 		   }
 	   }
 	   System.out.println();
    }
    
	}

}

