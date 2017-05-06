/**
 * Created by PaulM on 5/6/2017.
 */

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.CellType;
import java.io.*;

public class Excel {

    // CODE STARTS HERE TO TEST WRITE WORKBOOK FUNCTIONALITY

    private HSSFWorkbook workbookWrite = new HSSFWorkbook();                                                                     // Sets workbook from HSSF class, meaning it works with XLS files, use XSSF for XLSX files
    private HSSFSheet sheetWrite = workbookWrite.createSheet("FirstExcelSheet");                                            // Sets first sheet in workbook and names it accordingly
    private HSSFRow rowWrite = sheetWrite.createRow(0);                                                                       // Sets the row, 0 means it's the first one in the sheet
    private HSSFCell cellWrite = rowWrite.createCell(0);                                                                       // Sets the column, 0 means it's the first one in the sheet

    // Need to add this into the MAIN Program
    //cellWrite.setCellValue("1. Cell");                                                                                   // Sets the value to the cell selected

    public void setCell(HSSFCell cellWrite) {
        this.cellWrite = cellWrite;
    }

    /*
    try {                                                                                                           // Basic Try/Catch block to deal with the IOException of the file not existing
        workbookWrite.write(new FileOutputStream("excel.xls"));                                                    // Creates new excel file
        workbookWrite.close();                                                                                           // Closes the workbook that is created
    } catch (FileNotFoundException e) {                                                                                       // Catches the IOException error thrown
        throw new RuntimeException("This shouldn't happen, It will create the file", e);                            // Tells us that the exception shouldn't be thrown because the sheet is created on the previous lines
    }                                                                                                               // Ends Try/Catch Block for the IOException
    */

    // CODE ENDS HERE TO TEST WRITE WORKBOOK FUNCTIONALITY



}