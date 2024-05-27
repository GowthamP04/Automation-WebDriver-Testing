package ExcelSheetDataTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		
		//File-->Workbook-->Sheets-->Rows-->Cells
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");//workbook.getSheetAt(0);
		
		int totalrows=sheet.getLastRowNum();
		int totalcells=sheet.getRow(1).getLastCellNum();
		
		System.out.println("Number of rows:"+totalrows); //5
		System.out.println("Number of cells:"+totalcells);//4
		
		for(int r=0;r<=totalrows;r++)
		{
			XSSFRow currentRow=sheet.getRow(r);
					
			for(int c=0;c<totalcells;c++)
			{
				//XSSFCell cell=currentRow.getCell(c);
				//String value=cell.toString();
				String value=currentRow.getCell(c).toString();
				System.out.print(value+"      ");
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();

	}

}