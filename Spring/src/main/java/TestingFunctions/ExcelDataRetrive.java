package TestingFunctions;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ExcelDataRetrive {
    public static final String SAMPLE_XLSX_FILE_PATH = "C:\\Users\\Mohan\\Desktop\\Book1.xlsx";

    public static void main(String[] args) throws IOException, EncryptedDocumentException, InvalidFormatException {

        // Creating a Workbook from an Excel file (.xls or .xlsx)
        Workbook workbook = WorkbookFactory.create(new File(SAMPLE_XLSX_FILE_PATH));

        // Retrieving the number of sheets in the Workbook
        System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");

        /*
           =============================================================
           Iterating over all the sheets in the workbook (Multiple ways)
           =============================================================
        */

        // 2. Or you can use a for-each loop
        System.out.println("Retrieving Sheets using for-each loop");
        for(Sheet sheet: workbook) {
            System.out.println("=> " + sheet.getSheetName());
        }


        /*
           ==================================================================
           Iterating over all the rows and columns in a Sheet (Multiple ways)
           ==================================================================
        */

        // Getting the Sheet at index zero
        Sheet sheet = workbook.getSheetAt(0);

        // Create a DataFormatter to format and get each cell's value as String
        DataFormatter dataFormatter = new DataFormatter();

        

        // 2. Or you can use a for-each loop to iterate over the rows and columns
        List<String> header=new ArrayList<>();
        List<Map<String,String>> data=new ArrayList<>();
        Map<String,String> map;
        int t=1;
        System.out.println("\n\nIterating over Rows and Columns using for-each loop\n");
        for (Row row: sheet) {
        	map=new HashMap<>();
        	int index=0;
            for(Cell cell: row) {
                String cellValue = dataFormatter.formatCellValue(cell);
                if(t==1)
                header.add(cellValue);
                else
                {
					map.put(header.get(index++), cellValue);
                	
                }
            }
            if(t!=1)
            data.add(map);
            t++;
            System.out.println("Map values are"+map);
        }
        System.out.println(data);
       
        System.out.println("Printing values using map and list");
        for(int i=0;i<data.size();i++)
        {
        	for(int j=0;j<header.size();j++)
        	{
        		System.out.print(data.get(i).get(header.get(j)));
        	}
        	System.out.println();
        }
        
        workbook.close();
    }
}