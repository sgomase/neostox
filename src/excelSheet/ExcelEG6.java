package excelSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEG6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		
        File myFile=new File("C:\\selenium\\20_aug_eve.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet4");
		
		int totalNoOfRows = mySheet.getLastRowNum();
		System.out.println("Total rows in sheet are "+totalNoOfRows);
		
		short lastCellNum = mySheet.getRow(0).getLastCellNum();
		//System.out.println(lastCellNum);
		int totalNoOfCells=lastCellNum-1;
		
		System.out.println("Total Number of cell in row 1 are "+totalNoOfCells);
		
		for(int row=0;row<=totalNoOfRows;row++)
		{
			for(int cell=0;cell<=totalNoOfCells;cell++)
			{
				Cell myCell = mySheet.getRow(row).getCell(cell);
				
				CellType type = myCell.getCellType();
				
				if(type==CellType.STRING)
				{
					System.out.print(myCell.getStringCellValue()+"");
				}
				else if(type==CellType.NUMERIC)
				{
					System.out.print(myCell.getNumericCellValue());
				}
				else if(type==CellType.BOOLEAN)
				{
					System.out.print(myCell.getBooleanCellValue());
				}
				else if(type==CellType._NONE)
				{
					System.out.println("BLANK");
				
				}
				
				System.out.println();
					
			}
			
		}
	}

}
