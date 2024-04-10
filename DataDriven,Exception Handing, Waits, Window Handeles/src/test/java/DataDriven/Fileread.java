package DataDriven;



import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;


public class Fileread {


    @Test
    public void xlfileTest() throws IOException, CsvValidationException {
//        File src=new File("/home/vikas/IdeaProjects/DataDriven,Exception Handing, Waits, Window Handeles/src/test/java/TestData/postman datadrien testing.csv");
//        CSVReader reader= new CSVReader(new FileReader(src));
//        String[] str = reader.readNext();
//        for(int i=0;i< str.length;i++){
//            System.out.println(str[i]);
//        }
//        File src2 = new File("/home/vikas/IdeaProjects/DataDriven,Exception Handing, Waits, Window Handeles/src/test/java/TestData/testData.xlsx");
//        FileInputStream fis=new FileInputStream(src2);
//        XSSFWorkbook xsf=new XSSFWorkbook(fis);
//        XSSFSheet sheet= xsf.getSheetAt(0);
//        String str1=sheet.getRow(0).getCell(0).getStringCellValue();
//        System.out.println(str1);
//        xsf.close();

        String excelFilePath = "/home/vikas/IdeaProjects/DataDriven,Exception Handing, Waits, Window Handeles/src/test/java/TestData/testData.xlsx";

        try (FileInputStream fis = new FileInputStream(new File(excelFilePath));
             Workbook workbook = WorkbookFactory.create(fis)) {
            // Assuming you are working with the first sheet (index 0)
            Sheet sheet = workbook.getSheetAt(0);
            // Iterate through all rows
            for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
                Row row = sheet.getRow(rowIndex);
                // Iterate through all cells in the row
                for (Cell cell : row) {
                    // Print cell value
                    System.out.print(cell.toString() + "\t");
                }
                // Move to the next line for the next row
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }





    }
}
