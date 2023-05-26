package Utils;

import java.io.File;
import java.io.FileInputStream;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadProperties {

	private XSSFWorkbook workbook;
	private XSSFWorkbook workbook2;
	private XSSFWorkbook workbook3;

	public String getregisterusername(int rowno) throws Exception  {
		File file = new File("./src/test/resources/testdataExcel/UserRegistration.xls");
	    FileInputStream fis = new FileInputStream(file);
	    workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);
			String cell0 = sheet.getRow(rowno).getCell(0).getStringCellValue();
			return cell0;
		
	}
	
	public String getregisterpassword(int rowno) throws Exception {
		File file = new File("./src/test/resources/testdataExcel/UserRegistration.xls");
		FileInputStream fis = new FileInputStream(file);
	    workbook2 = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook2.getSheetAt(0);
			String cell1=sheet.getRow(rowno).getCell(1).getStringCellValue();
			return cell1;
		
		
	}
	
	public String getregisterconfirmpassword(int rowno) throws Exception {
		File file = new File("./src/test/resources/testdataExcel/UserRegistration.xls");
		FileInputStream fis = new FileInputStream(file);
	    workbook3 = new XSSFWorkbook(fis);
	    XSSFSheet sheet = workbook3.getSheetAt(0);
		String cell2=sheet.getRow(rowno).getCell(2).getStringCellValue();
		return cell2;	
	}
	public String getloginusername() throws Exception  {
		File file = new File("./src/test/resources/testdataExcel/UserRegistration.xls");
	    FileInputStream fis = new FileInputStream(file);
	    workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(1);
			String cell0 = sheet.getRow(1).getCell(0).getStringCellValue();
			return cell0;
		
	}
	
	public String getloginpassword() throws Exception {
		File file = new File("./src/test/resources/testdataExcel/UserRegistration.xls");
		FileInputStream fis = new FileInputStream(file);
	    workbook2 = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook2.getSheetAt(1);
			String cell1=sheet.getRow(1).getCell(1).getStringCellValue();
			return cell1;
		
		
	}
}



//
//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.LinkedHashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook; 
//import org.apache.poi.ss.usermodel.WorkbookFactory;

//		
//		public int totalRow;
//
//
//		public List<Map<String, String>> getData(String excelFilePath, String sheetName) throws EncryptedDocumentException, IOException
//			{
//						////File file = new File(excelFilePath); // Replace with actual file path
//						//FileInputStream fis = new FileInputStream(file);
//						Workbook workbook = WorkbookFactory.create(new File(excelFilePath));
//						Sheet sheet = workbook.getSheet(sheetName);
//						workbook.close();
//						return readSheet(sheet);
//					
//			}
//
//		private List<Map<String, String>> readSheet(Sheet sheet) {
//
//			Row row;
//			Cell cell;
//
//			totalRow = sheet.getLastRowNum();
//
//			List<Map<String, String>> excelRows = new ArrayList<Map<String, String>>();
//
//			for (int currentRow = 1; currentRow <= totalRow; currentRow++) {
//
//				row = sheet.getRow(currentRow);
//
//				int totalColumn = row.getLastCellNum();
//
//				LinkedHashMap<String, String> columnMapdata = new LinkedHashMap<String, String>();
//
//				for (int currentColumn = 0; currentColumn < totalColumn; currentColumn++) {
//
//					cell = row.getCell(currentColumn);
//
//					String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).getCell(currentColumn)
//							.getStringCellValue();
//
//					columnMapdata.put(columnHeaderName, cell.getStringCellValue());
//				}
//
//				excelRows.add(columnMapdata);
//			}
//
//			return excelRows;
//		}
//
//		public int countRow() {
//
//			return totalRow;
//		}
//
//	}
//
//	public String getregisterusername(int i) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public String getregisterpassword(int i) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//
//}
