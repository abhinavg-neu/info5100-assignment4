/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MarketAnalytics;

import TheBusiness.SolutionOrders.SolutionOrder;
import java.util.Comparator;

/**
 *
 * @author admin
 */


public class BestCustomerComparator implements Comparator<SolutionOrder> {
    @Override
    public int compare(SolutionOrder obj1, SolutionOrder obj2) {
        return Integer.compare(obj1.getSellingPrice(),obj2.getSellingPrice());
    }
    
    
    
}
