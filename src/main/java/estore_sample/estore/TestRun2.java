package estore_sample.estore;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestRun2 {

	public static void main(String args[]) {
		try {
			File myFile = new File("C:\\Users\\alexchen3\\Desktop\\insert.xlsx");
			FileInputStream fis = new FileInputStream(myFile);
			XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);
			XSSFSheet mySheet = myWorkBook.getSheetAt(0);
			Iterator<Row> rowIterator = mySheet.iterator();
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_STRING:
						System.out.println(cell.getStringCellValue());
						break;
					case Cell.CELL_TYPE_NUMERIC:
						BigDecimal bigDecimal = new BigDecimal(cell.getNumericCellValue());
						System.out.println(bigDecimal.toPlainString());
						break;
					}
				}
				System.out.println("--------------");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
