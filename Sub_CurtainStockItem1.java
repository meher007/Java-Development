package coursework;

/**
 * This class is a subclass of CurtainStockItem that got two extra fields
 * DiscountInPercentage and Rating
 *
 * @author Meher Khan
 * @version 1.1, December 2016
 */
public class Sub_CurtainStockItem1 extends CurtainStockItem implements Stock {

    // New field of curtain
    private int DiscountInPercentage;
    // New field of curtain
    private String Rating;

    // Constructor with ten @para,two from sub class and eight from super class (CurtainStockItem)      
    public Sub_CurtainStockItem1(String curtain_id, String material, String style,
            int price, String colour, String brand, String size, int stockLevel, int DiscountInPercentage, String Rating) {
        super(curtain_id, material, style, price, colour, brand, size, stockLevel);

        this.DiscountInPercentage = DiscountInPercentage;
        this.Rating = Rating;
    }

// getter and setter method for sub class 
    public void setDiscountInPercentage(int DiscountInPercentage) {
        this.DiscountInPercentage = DiscountInPercentage;
    }

    public int getDiscountInPercentage() {
        return DiscountInPercentage;
    }

    public void setRating(String Rating) {
        this.Rating = Rating;
    }

    public String getRating() {
        return Rating;
    }

    @Override
    public String toString() {
        return (super.toString() + "\n"
                + "(From Sub class1): "
                + "\n" + "DiscountInPercentage :" + this.DiscountInPercentage
                + "\n" + "Rating               :" + this.Rating);
    }

    @Override
    public void addAStockItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getGender() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNewArrivals() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
