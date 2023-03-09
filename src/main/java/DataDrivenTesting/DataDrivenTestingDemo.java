package DataDrivenTesting;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataDrivenTestingDemo {

    public static void main (String[] args) throws IOException {

        XSSFWorkbook ExcelWBook = null;
        XSSFSheet ExcelWSheet;
        //XSSFRow Row;
        //XSSFCell Cell;

        //crete an object of file class to open file
        File excelFile = new File("C:\\Users\\rupes\\OneDrive\\Desktop\\TestAuto\\Important_Links_for_Automation.xlsx");

        FileInputStream inputStream = null;
        //create an object of FileInputStread to read data from file

        try {
            inputStream = new FileInputStream(excelFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Create object of XSSFworkbook to handle xlsx file
        try {
            ExcelWBook = new XSSFWorkbook(inputStream);
        }catch (IOException e){
            e.printStackTrace();
        }


        //to access workbook sheet
        ExcelWSheet = ExcelWBook.getSheetAt(0);

        //get total row count
        int ttlRows = ExcelWSheet.getLastRowNum() +1;

        int ttlCells = ExcelWSheet.getRow(0).getLastCellNum();
        
        for(int currentRow = 0; currentRow < ttlRows; currentRow++)
        {
            for(int currentCell = 0; currentCell<ttlCells; currentCell++)
            {
                System.out.println(ExcelWSheet.getRow(currentRow).getCell(currentCell).toString());
                System.out.println("\t");
            }
            System.out.println();
        }
        try {
            ExcelWBook.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
