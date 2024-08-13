package news;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;
	
	public static String getStringdata(int a,int b)throws IOException
	{
	f=new FileInputStream("C:\\Users\\MY PC\\OneDrive\\Desktop\\ExcelRead.xlsx");
	w=new XSSFWorkbook(f);
	sh=w.getSheet("sheet1");
	Row r=sh.getRow(a);
	Cell c=r.getCell(b);
	return c.getStringCellValue();
	
	//return c.getNumericCellValuue();for intergers
	}
}


