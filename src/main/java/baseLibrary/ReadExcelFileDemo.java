package baseLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFileDemo {
	
	public static void main(String args[]) throws IOException {
		FileInputStream fis=new FileInputStream(new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Book1.xlsx"));
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();
		for(Row row:sheet) {
			for(Cell cell:row) {
				switch(formulaEvaluator.evaluateInCell(cell).getCellType()) {
				case
					Cell.CELL_TYPE_NUMERIC:
					System.out.print(cell.getNumericCellValue()+ "\n");  
				break;
				case
					Cell.CELL_TYPE_STRING:
					System.out.print(cell.getStringCellValue()+ "\n");  
				break;  
									
				}
			}
			
		}
		
		
				
	}
}
