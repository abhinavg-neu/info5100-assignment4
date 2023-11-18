/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.SolutionOrders;

import TheBusiness.CustomerManagement.CustomerProfile;
import TheBusiness.MarketModel.MarketChannelAssignment;
import TheBusiness.MarketModel.SolutionOffer;

/**
 *
 * @author kal bugrara
 */

public class SolutionOrder {
    
    SolutionOffer selectedsolutionoffer;
    CustomerProfile customerprofile;
    MarketChannelAssignment marketChannelAssignment; 
    int sellingPrice;
    public SolutionOrder(SolutionOffer so,  MarketChannelAssignment mca,int sellingPrice){
        selectedsolutionoffer = so;
        marketChannelAssignment = mca;
        this.sellingPrice= sellingPrice;

    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
    
    public int getSolutionPrice(){
        return selectedsolutionoffer.getSolutionPrice();
    }
    public MarketChannelAssignment getMarketChannelCombo(){
        
        return marketChannelAssignment;
                
    }
    
    public boolean isOrderAboveTotalTarget () {
//        selectedsolutionoffer.get
        return false;
    }

   
}
