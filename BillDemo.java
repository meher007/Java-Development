package coursework;

import java.io.FileNotFoundException;

/**
 *
 * @author Meher Khan
 * @version 1.1, December 2016
 */
public class BillDemo {

    public static void main(String[] args) throws FileNotFoundException {

        Bill billobj = new Bill(10112004, "Meher", "Khan", "100 Elliot street London", "E1 1UF");

        StockReader reader = new StockReader("stockitem.csv");

    }
}
