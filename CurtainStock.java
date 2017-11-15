package coursework;

import java.util.*;

/**
 * CurtainStock Class deal with ArrayList instance to keep the value from
 * CurtainStockDemo class and pass it to CurtainStockitem class by instance
 * variable Also deal addAStockItem method, getStockLevelForProduct method and
 * getTotalValueForProduct method
 *
 * @author Meher Khan
 * @version 1.1, December 2016
 */
public class CurtainStock {

    //ArrayList instance of CurtainStockItem class
    ArrayList<CurtainStockItem> stockObject = new ArrayList<CurtainStockItem>();

    // Take @para from CurtainStockDemo and add @para into CurtainStockItem class
    public void addAStockItem(CurtainStockItem instance) {

        stockObject.add(instance);

    }

    /**
     * Check Stock LevelFor Product by taking a String from CurtainStockDemo
     * return stock level
     */
    public int getStockLevelForProduct(String curtainidForStockLevel) {
        int sizeOfStockObject = stockObject.size();

        String curtainId;
        int stockLevel1;
        int a = sizeOfStockObject - 1;

        if (sizeOfStockObject > 0) {

            for (int i = 0; i < sizeOfStockObject; i++) {

                CurtainStockItem c1 = stockObject.get(i);
                curtainId = c1.getCurtain_id();
                stockLevel1 = c1.getStockLevel();
                if (curtainidForStockLevel == curtainId && stockLevel1 != 0) {

                    i = sizeOfStockObject; // Loop termination
                    return stockLevel1;
                } else if (i == a && curtainId != curtainidForStockLevel) {

                    return -1;

                }

            }
            return -1;
        } else {

            return -1;
        }

    }

    /**
     * Check Total Value For Product by taking a String from CurtainStockDemo
     * return Total Value For Product
     */
    public int getTotalValueForProduct(String curtainidForProductValue) {
        int sizeOfStockObject2 = stockObject.size();

        String curtainId2;
        int proValue;
        int stockLevel2;

        int a2 = sizeOfStockObject2 - 1;

        if (sizeOfStockObject2 > 0) {

            for (int i = 0; i < sizeOfStockObject2; i++) {

                CurtainStockItem c2 = stockObject.get(i);
                curtainId2 = c2.getCurtain_id();
                proValue = c2.getPrice();
                stockLevel2 = c2.getStockLevel();

                if (curtainId2 == curtainidForProductValue && stockLevel2 != 0) {

                    i = sizeOfStockObject2; // Loop termination
                    return proValue * stockLevel2;
                }

                if (i == a2 && curtainId2 != curtainidForProductValue) {

                    return -1;
                }
            }

            return -1;
        } else {

            return -1;
        }

    }

    // Generate and return TotalValueInStock
    public int getTotalValueInStock() {

        int totalValue = 0;

        int sizeOfStockObject1 = stockObject.size();

        if (sizeOfStockObject1 > 0) {

            for (int i = 0; i < sizeOfStockObject1; i++) {

                CurtainStockItem c = stockObject.get(i);

                if (c.getStockLevel() != 0) {
                    totalValue = totalValue + c.getPrice() * c.getStockLevel();

                }

            }

            return totalValue;
        } else {
            return 0;
        }

    }

}
