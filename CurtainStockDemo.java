package coursework;

import java.util.*;

/**
 * Generates some instance of CurtainStockItem and then feeds it with a series
 * @Para into the ArrayList of CurtainStock Test all the method in CurtainStock
 * main method @param args not used
 * @author Meher Khan 
 * @version 1.1, December 2016
 */
public class CurtainStockDemo {

    public static void main(String[] args) {

        //Creates some instance CurtainStockItem and taking some @para
        CurtainStockItem additem1 = new CurtainStockItem("M522", "Cotton", "Pencil Pleat", 1200, "GREEN", "John Lewis", "Small", 2);
        CurtainStockItem additem2 = new CurtainStockItem("M523", "Polyester", "Eyelet", 800, "RED", "Next", "Large", 0);
        CurtainStockItem additem3 = new CurtainStockItem("M524", "Fabric", "Pencil Pleat", 1000, "YELLOW", "Zara", "Medium", 4);
        CurtainStockItem additem4 = new CurtainStockItem("M525", "Cotton Mix", "Eyelet", 1500, "GREEN", "John Lewis", "Large", 4);
        CurtainStockItem additem5 = new CurtainStockItem("M526", "Viscose", "Curtain Style", 500, "RED", "Next", "Medium", 2);
        CurtainStockItem additem6 = new CurtainStockItem("M527", "Polyester Mix", "Pencil Pleat", 2000, "YELLOW", "Zara", "Large", 2);

        // Creates an instance CurtainStock
        CurtainStock curtainstock = new CurtainStock();

        //Add stock in addAStockItem method of CurtainItem class
        curtainstock.addAStockItem(additem1);
        curtainstock.addAStockItem(additem2);
        curtainstock.addAStockItem(additem3);
        curtainstock.addAStockItem(additem4);
        curtainstock.addAStockItem(additem5);
        curtainstock.addAStockItem(additem6);

        System.out.println(additem1);
        System.out.println(additem2);
        System.out.println(additem3);
        //System.out.println(additem4);
        //System.out.println(additem5);
        //System.out.println(additem6);
        curtainstock.getStockLevelForProduct("M525");
        curtainstock.getTotalValueForProduct("M522");
        curtainstock.getTotalValueInStock();

        //curtainstock.stockObj.clear();
        //System.out.println("Stock Level For Product is " + curtainstock.getStockLevelForProduct("M525"));
        //System.out.println("Total Value For Product is " + curtainstock.getTotalValueForProduct("M522"));
        //System.out.println("Total Value In Stock is " + curtainstock.getTotalValueInStock());
    }

}
