/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework;

/**
 * This class is a subclass of CurtainStockItem that got two extra fields Gender
 * and NewArrivals
 *
 * @author Meher Khan
 * @version 1.1, December 2016
 */

public class Sub_CurtainStockItem2 extends CurtainStockItem implements Stock {

    // New field of curtain
    private String Gender;
    // New field of curtain
    private String NewArrivals;

// Constructor with ten @para,two from sub class and eight from super class (CurtainStockItem)
    public Sub_CurtainStockItem2(String curtain_id, String material, String style,
            int price, String colour, String brand, String size, int stockLevel, String Gender, String NewArrivals) {
        super(curtain_id, material, style, price, colour, brand, size, stockLevel);

        this.Gender = Gender;
        this.NewArrivals = NewArrivals;
    }

// getter and setter method for sub class
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getGender() {
        return Gender;
    }

    public void setNewArrivals(String NewArrivals) {
        this.NewArrivals = NewArrivals;
    }

    public String getNewArrivals() {
        return NewArrivals;
    }

    @Override
    public String toString() {
        return (super.toString() + "\n"
                + "(From Sub class2): "
                + "\n" + "Gender         :" + this.Gender
                + "\n" + "NewArrivals    :" + this.NewArrivals);
    }

    @Override
    public void addAStockItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getDiscountInPercentage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getRating() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
