/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness;

import MarketAnalytics.BestSolutionComparator;
import TheBusiness.Business.Business;
import TheBusiness.SolutionOrders.MasterSolutionOrderList;
import TheBusiness.SolutionOrders.SolutionOrder;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class RangePricingApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        //populate Data from files
       Business business = ConfigureABusiness.initializeMarkets();
       
       //1.Our top 3 best negotiated solutions (meaning solutions that sell above target) broken
       //down by market segments.
       
        MasterSolutionOrderList mastersolutionorderlist = business.getMasterSolutionOrderList();
        ArrayList<SolutionOrder> solutionOrders = mastersolutionorderlist.getSolutionorderlist();
        solutionOrders.sort(new BestSolutionComparator());
        
        System.out.println("Q1------------");
        System.out.println("Best negotiated solutions are");
        for(int i=0;i<solutionOrders.size();i++) {
            System.out.println(solutionOrders.get(i).getName()+" with cost difference of:"+ solutionOrders.get(i).getBestNegotiatedSolution()); 
        }
        
        
                
         
    }

}

