package neoStoxPOMClassesUsingDDF;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class pwd {
  @Test
  public void test() throws EncryptedDocumentException, IOException
  {
	  File myFile = new File("C:\\selenium\\20_aug_eve.xlsx");
	  Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet5");
	  System.out.println((mySheet.getRow(0).getCell(1).getStringCellValue()));
  }
}
