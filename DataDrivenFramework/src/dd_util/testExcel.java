package dd_util;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class testExcel
{

   public static void main(String[] args) throws IOException
   {
      FileInputStream fis = new FileInputStream("C:\\Book1.xlsx");

      XSSFWorkbook workbook = new XSSFWorkbook(fis);

      XSSFSheet sheet = workbook.getSheetAt(0);

      XSSFRow row = sheet.getRow(0);

      for(int i=0;i<row.getLastCellNum();i++){
         System.out.println(row.getCell(i));
      }

   }

}
