/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework;

/**
 *
 * @author Meher Khan
 * @version 1.1, December 2016
 */
public class Bill {

    public int billNumber;
    public String cus1stName;
    public String cus2ndName;
    public String cus1stLineAdd;
    public String cusPostCode;

    Bill(int billNumber, String cus1stName, String cus2ndName, String cus1stLineAdd, String cusPostCode) {
        this.billNumber = billNumber;
        this.cus1stName = cus1stName;
        this.cus2ndName = cus2ndName;
        this.cus1stLineAdd = cus1stLineAdd;
        this.cusPostCode = cusPostCode;
    }

    public void addALineItem() {

    }

}
