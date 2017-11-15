package coursework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * StockReader Class deal with csv file Take the csv file from StockReaderDemo
 * by constructor And execute by Run method Run method separate each line of csv
 * file and store in appropriate class by it's object
 *
 *
 * @author Meher Khan
 * @version 1.1, December 2016
 */
public class StockReader {

    //String variable
    private final String filename;
    CurtainStockItem obj; //Instance of CurtainStockItem

    /**
     * This constructor take the csv file from StockReaderDemo and throws
     * exception if any problem on csv file
     */
    public StockReader(String filename) throws FileNotFoundException {
        this.filename = filename;

    }

    public void run() throws FileNotFoundException {

        Scanner csvFile = new Scanner(new File(filename));
        csvFile.useDelimiter("\n");
        String dataRow;

        String csv_curtain_id;
        String csv_material;
        String csv_style;
        int csv_price;
        String csv_colour;
        String csv_brand;
        String csv_size;
        int csv_stockLevel;
        int DiscountInPercentage;
        String Rating;
        String Gender;
        String NewArrivals;

        //while is working until csv file has next line
        while (csvFile.hasNextLine()) {
            dataRow = csvFile.nextLine();
            String[] fields = dataRow.split(","); // split method split each line from csv file
            String classtype = fields[1].trim(); // Get rid off white space by trim method
            //check the class to store the value from csv file 
            if (classtype.equals("CurtainStockItem")) {

                csv_curtain_id = fields[0].trim();
                csv_material = fields[2].trim();
                csv_style = fields[3].trim();
                csv_price = Integer.parseInt(fields[4].trim());
                csv_colour = fields[5].trim();
                csv_brand = fields[6].trim();
                csv_size = fields[7].trim();
                csv_stockLevel = Integer.parseInt(fields[8].trim());

                // Instance of CurtainStockItem class that is contain new stock item from csv file
                obj = new CurtainStockItem(csv_curtain_id, csv_material, csv_style, csv_price, csv_colour, csv_brand, csv_size, csv_stockLevel);
                System.out.println(" #########  Stock adding through super class #########\n" + obj.toString());   //Calling toString method from CurtainStockItem

                //check the class to store the value from csv file
            } else if (classtype.equals("Sub_CurtainStockItem1")) {

                csv_curtain_id = fields[0].trim();
                csv_material = fields[2].trim();
                csv_style = fields[3].trim();
                csv_price = Integer.parseInt(fields[4].trim());
                csv_colour = fields[5].trim();
                csv_brand = fields[6].trim();
                csv_size = fields[7].trim();
                csv_stockLevel = Integer.parseInt(fields[8].trim());
                DiscountInPercentage = Integer.parseInt(fields[9].trim());
                Rating = fields[10].trim();

                // Instance of Sub_CurtainStockItem1 class that is contain new stock item from csv file
                Sub_CurtainStockItem1 obj1 = new Sub_CurtainStockItem1(csv_curtain_id, csv_material, csv_style, csv_price, csv_colour, csv_brand, csv_size, csv_stockLevel, DiscountInPercentage, Rating);
                System.out.println("\n ######### Stock adding through sub class1 #########\n" + obj1);

                //check the class to store the value from csv file
            } else if (classtype.equals("Sub_CurtainStockItem2")) {

                csv_curtain_id = fields[0].trim();
                csv_material = fields[2].trim();
                csv_style = fields[3].trim();
                csv_price = Integer.parseInt(fields[4].trim());
                csv_colour = fields[5].trim();
                csv_brand = fields[6].trim();
                csv_size = fields[7].trim();
                csv_stockLevel = Integer.parseInt(fields[8].trim());
                Gender = fields[9].trim();
                NewArrivals = fields[10].trim();

                // Instance of Sub_CurtainStockItem2 class that is contain new stock item from csv file
                Sub_CurtainStockItem2 obj2 = new Sub_CurtainStockItem2(csv_curtain_id, csv_material, csv_style, csv_price, csv_colour, csv_brand, csv_size, csv_stockLevel, Gender, NewArrivals);
                System.out.println("\n ######### Stock adding through sub class2 #########\n" + obj2);

            } else {

                continue;
            }

        }

        csvFile.close();

    }

    public CurtainStockItem getStock() {

        return obj;
    }

}
