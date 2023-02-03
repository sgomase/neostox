package excelSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcleEG2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myFile=new File("C:\\selenium\\20_aug_eve.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		//String cell type
		
		Cell myCell1 = mySheet.getRow(0).getCell(0);
		System.out.println(myCell1.getCellType());
		String myvalue1 = myCell1.getStringCellValue();
		System.out.println(myvalue1);
		
		System.out.println("==============================");
		
		//Boolean cell type
		Cell myCell2 = mySheet.getRow(0).getCell(2);
		System.out.println(myCell2.getCellType());
		boolean myValue2 = myCell2.getBooleanCellValue();
		System.out.println(myValue2);
		System.out.println("==============================");
		
		//Numeric ceii type
		
		Cell myCell3 = mySheet.getRow(0).getCell(1);
		System.out.println(myCell3.getCellType());
		
		double myValue3 = myCell3.getNumericCellValue();
		System.out.println(myValue3);
		System.out.println("==============================");
		
		System.out.println(mySheet.getRow(0).getCell(3).getCellType());
	}

}
