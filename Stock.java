/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework;

/**
 *
 * @Meher Khan
 */
public interface Stock {
    
    
    public String getCurtain_id(); 

    public String getMaterial(); 
    
    public String getStyle(); 

    public int getPrice();

    public String getColour();

    public String getBrand();

    public String getSize();
    public int getStockLevel();

   
    public void addAStockItem();
    
    public int getDiscountInPercentage();
    public String getRating();
    public String getGender();
    public String getNewArrivals();
        
    
    
    
    
    
}
