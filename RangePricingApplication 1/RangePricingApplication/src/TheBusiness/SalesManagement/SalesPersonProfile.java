/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.SalesManagement;

import java.util.ArrayList;
import TheBusiness.OrderManagement.Order;
import TheBusiness.Personnel.Person;
import TheBusiness.Personnel.Profile;
import TheBusiness.SolutionOrders.SolutionOrder;

/**
 *
 * @author kal bugrara
 */
public class SalesPersonProfile extends Profile {
    ArrayList<SolutionOrder> salesorders;


    public SalesPersonProfile(Person p) {

        super(p); 
        salesorders = new ArrayList();

    }
    public void addSalesOrder(SolutionOrder o){
        salesorders.add(o);
    }
    @Override
    public String getRole(){
        return  "Sales";
    }

}
