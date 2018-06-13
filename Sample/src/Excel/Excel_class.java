package Excel;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel_class {
	
	public static String folderpath="G:\\Selenium softwares\\7oclock_batch\\Sample\\data\\";
	static Workbook wb;
	static Sheet sh;
	public static void excelconnection(String filename,String sheetname)
	{
		try {
			File f=new File(folderpath+filename);
			
			wb=Workbook.getWorkbook(f);
			
			 sh=wb.getSheet(sheetname);
		} catch (Exception e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public static int  rcount()
	{
		int r=sh.getRows();
		return r;
	}
	public static int  ccount()
	{
		int r=sh.getColumns();
		return r;
	}
	public static String readdata(int col,int row)
	{
		String x=sh.getCell(col, row).getContents();
		return x;
	}

}
