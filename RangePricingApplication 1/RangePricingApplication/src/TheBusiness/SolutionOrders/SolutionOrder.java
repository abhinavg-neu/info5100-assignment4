/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.SolutionOrders;

import TheBusiness.CustomerManagement.CustomerProfile;
import TheBusiness.MarketModel.MarketChannelAssignment;
import TheBusiness.MarketModel.SolutionOffer;
import TheBusiness.SalesManagement.SalesPersonProfile;

/**
 *
 * @author kal bugrara
 */

public class SolutionOrder {
    
    SolutionOffer selectedsolutionoffer;
    CustomerProfile customerprofile;
    MarketChannelAssignment marketChannelAssignment; 
    int sellingPrice;
    String name;
    SalesPersonProfile salesPersonProfile;
    int q1Sol;
    
    public SolutionOrder(SolutionOffer so,  MarketChannelAssignment mca,SalesPersonProfile salesPersonProfile,CustomerProfile customerprofile,int sellingPrice, int size){
        selectedsolutionoffer = so;
        marketChannelAssignment = mca;
        this.sellingPrice= sellingPrice;
        name ="Order"+String.valueOf(size);
        this.salesPersonProfile = salesPersonProfile;
        this.customerprofile = customerprofile;
    }

    public String getName() {
        return name;
    }

    
    public int getSellingPrice() {
        return sellingPrice;
    }
    
    public int getBestNegotiatedSolution(){
        return sellingPrice-selectedsolutionoffer.getSolutionPrice();
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
