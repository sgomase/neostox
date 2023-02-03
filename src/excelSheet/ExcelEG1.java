package excelSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEG1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myFile = new File("C:\\selenium\\20_aug_eve.xlsx");
	   String Value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
	   System.out.println("Value is "+Value);
	}

}
