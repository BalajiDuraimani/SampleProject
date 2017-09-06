package exceldataprovider;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class Exceldata {
	@Test
	public Object[][] excelinputs() throws InvalidFormatException, IOException
	{
		//File filename = new File("./data/ceatelead.xlsx");
		//Opening the file
		File filename = new File("./data/Createlead.xlsx");
		//Shift to workbook
		XSSFWorkbook wb = new XSSFWorkbook(filename);

		//shift to sheet
		XSSFSheet wbsheet= wb.getSheet("Sheet1");


		//Findrowcount

		int rowcount = wbsheet.getLastRowNum();
		int coloumncount= wbsheet.getRow(0).getLastCellNum();
Object[][] newobj = new Object[rowcount][coloumncount];

                    for (int i = 1; i <= rowcount; i++) {
				XSSFRow rowval = wbsheet.getRow(i);
				
			for (int j = 0; j <coloumncount; j++) {
				XSSFCell coloumvalue = rowval.getCell(j);
		newobj[i-1][j] = coloumvalue.getStringCellValue();
		//	System.out.println(coloumvalue.getStringCellValue());
						}				
                                   
                    }
                    return newobj;
                    
	}
}





