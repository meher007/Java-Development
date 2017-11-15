package coursework;

import java.io.FileNotFoundException;

/**
 * StockReaderDemo class pass the csv file into StockReader class and runs run
 * method
 *
 * @author Meher Khan
 * @version 1.1, December 2016
 */
public class StockReaderDemo {

    public static void main(String[] args) throws FileNotFoundException {

        StockReader reader = new StockReader("stockitem.csv");

        reader.run();

    }

}
