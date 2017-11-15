package coursework;

/**
 * CurtainStockItem Class shows all the variables and methods in Curtains stock
 * system
 *
 * @author Meher Khan
 * @version 1.1, December 2016
 */
public class CurtainStockItem {

    //Declare variables
    private String curtain_id; // Curtain unique id
    private String material;   // Curtain material
    private String style;      // Curtain style i.e Eyelet,Pencil Pleat
    private int price;         // Curtain price per item 
    private String colour;     // Curtain colour
    private String brand;      // Curtain brand
    private String size;       // Curtain Size
    private int stockLevel;     // Curtain stockLevel
    public static final int curId = 4; // value assign four to check curtainid lenght in validcode method 
    //Default Constructor

    public CurtainStockItem() {
    }

    //The Constructor with eight parameter
    //Setup  curtain values and store it into related instance variable
    public CurtainStockItem(String curtain_id, String material, String style,
            int price, String colour, String brand, String size, int stockLevel) {

        this.curtain_id = curtain_id;
        this.material = material;
        this.style = style;
        this.price = price;
        this.colour = colour;
        this.brand = brand;
        this.size = size;
        this.stockLevel = stockLevel;

    }

    /**
     * validcode static method check 1st character alphapet from curtain_id
     * string and rest of character is numeric It also check the lenght is 4 and
     * return true or false
     */
    public static boolean validCode(String vCurtainId) {

        boolean firstLetterOfString = Character.isAlphabetic(vCurtainId.charAt(0));

        if (firstLetterOfString == true && vCurtainId.length() == curId) {

            boolean n1 = Character.isDigit(vCurtainId.charAt(1));
            boolean n2 = Character.isDigit(vCurtainId.charAt(2));
            boolean n3 = Character.isDigit(vCurtainId.charAt(3));

            if (n1 == true && n2 == true && n3 == true) {

                //System.out.println("This is a valid product code ");
                return true;

            } else {

                System.out.println("Enter valid Curtain ID please");

                return false;
            }
        }
        System.out.println("Enter valid Curtain ID please");
        return false;
    }

    // setMaterial method to set any material and expect only alphabet
    public void setMaterial(String material) {

        if (material.matches("[a-z A-Z]+")) {
            this.material = material;
        }
    }

    // setStyle method to set any curtain style
    public void setStyle(String style) {
        this.style = style;
    }

    // setPrice method to set price
    public void setPrice(int price) {
        this.price = price;
    }

    //setColur method to set colour
    public void setColour(String colour) {
        this.colour = colour;
    }

    // setBrand method to set up any curtain brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    //setup size
    public void setSize(String size) {
        this.size = size;
    }

    // setup setstocklevel
    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }

    /**
     * getCurtain_id method to get curtain_id
     *
     * @return curtain id, as a String
     */
    public String getCurtain_id() {

        return curtain_id;
    }

    /**
     * get material
     *
     * @return material, as a String
     */
    public String getMaterial() {
        return material;
    }

    /**
     * get style
     *
     * @return curtain style, as a String
     */
    public String getStyle() {
        return style;
    }

    /**
     * get curtain price
     *
     * @return curtain price, as a int
     */
    public int getPrice() {
        return price;
    }

    /**
     * get colour
     *
     * @return curtain colour, as a String
     */
    public String getColour() {
        return colour;
    }

    /**
     * get curtain Brand
     *
     * @return curtain Brand, as a String
     */
    public String getBrand() {
        return brand;
    }

    /**
     * get size
     *
     * @return curtain size, as a String
     */
    public String getSize() {
        return size;
    }

    /**
     * get Stock level
     *
     * @return curtain Stock level, as a String
     */
    public int getStockLevel() {
        return stockLevel;
    }

    public String toString() {
        return ("Curtain ID    : " + getCurtain_id() + "\n"
                + " Material     : " + getMaterial() + "\n"
                + " style        : " + getStyle() + "\n"
                + " price        : " + getPrice() + "\n"
                + " colour       : " + getColour() + "\n"
                + " brand        : " + getBrand() + "\n"
                + " size         : " + getSize() + "\n"
                + " StockLevel   : " + getStockLevel() + "\n");
    }

}
