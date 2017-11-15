package coursework;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author Meher Khan
 * @version 1.1, December 2016
 */
public class LineItem {

    String CurtainIdLineItem;

    static int CurtainQrtLineItem;

    CurtainStockItem currentStock;

    StockReader readStocks;

    int curtainQrt;

    static ArrayList<LineItem> listOfCurtains = new ArrayList<LineItem>();

    LineItem(String curtainID, int curtainQrt) throws FileNotFoundException {

    }

    public String getBillEntry() {
        return ("Curtain ID  : " + currentStock.getCurtain_id() + "\n"
                + "Curtain Name  : " + currentStock.getBrand() + "\n"
                + "Item Quantity  : " + this.curtainQrt + "\n");
    }

    public int getValue() {

        return getValue();
    }

}
