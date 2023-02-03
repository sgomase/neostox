package excelSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XcelEG4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
          File myFile=new File("C:\\selenium\\20_aug_eve.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet3");
		
		//read all same type of data from excel
		//outer for loop--->rows-->0-1
		
		for(int row=0;row<=1;row++)
		{
			//inner for loop--->cells-->0-2
			for(int cell=0;cell<=2;cell++)
			{
				//read data from sheet
				
				double myValue = mySheet.getRow(row).getCell(cell).getNumericCellValue();
				
				System.out.print(myValue+" ");
			}
			System.out.println();
		}
		
	}

}
