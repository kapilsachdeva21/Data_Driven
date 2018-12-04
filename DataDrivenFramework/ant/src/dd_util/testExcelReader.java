package dd_util;

public class testExcelReader
{

   public static void main(String[] args)
   {
      Xls_Reader excel = new Xls_Reader("C:\\Book1.xlsx");
      System.out.println(excel.getRowCount("Sheet1"));

   }

}
