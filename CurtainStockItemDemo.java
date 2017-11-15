package coursework;

/**
 * CurtainStockItemDemo Class test CurtainStockItem Class
 *
 * @author Meher Khan
 * @version 1.1, December 2016
 */
public class CurtainStockItemDemo {

    /**
     * Generates an instance of CurtainStockItem and feeds @param and display
     * outputs summary of the results in console Check all the methods in
     * CurtainStockItem class main method @param args not used
     *
     * @author Meher Khan, Student ID : 3600539
     * @version 1.1, December 2016
     */
    public static void main(String[] args) {

        CurtainStockItem obj = new CurtainStockItem("M522", "Cotton", "Pencil Pleat", 1200, "GREEN", "John Lewis", "Small", 2);

        //Checks validcode method by some valid and invalid value
        CurtainStockItem.validCode("M523"); // this a valid unique id for curtain item
        CurtainStockItem.validCode("M5236"); // this a invalid unique id for curtain item
        CurtainStockItem.validCode("M22H"); // this a invalid unique id for curtain item

        // Getter and Setter method test, feeds value in setter and get printout from getter
        obj.setMaterial("Cotton Mix");
        System.out.println("Getter and Setter method test: Material value Cotton Mix should be " + obj.getMaterial() + " in the getta");
        // Getter and Setter method test, feeds value in setter and get printout from getter
        obj.setStyle("Eyelet");
        System.out.println("Getter and Setter method test: Style value Eyelet should be " + obj.getStyle() + " in the getta");
        // Getter and Setter method test, feeds value in setter and get printout from getter
        obj.setBrand("Zara");
        System.out.println("Getter and Setter method test: Brand value Zara should be " + obj.getBrand() + " in the getta");

    }
}
