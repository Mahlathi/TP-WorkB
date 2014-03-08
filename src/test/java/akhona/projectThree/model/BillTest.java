/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.projectThree.model;

import akhona.projectthree.model.Bill;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author davinci
 */
public class BillTest {
    
    public BillTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    
    @Test
    public void testCreation() {
        Bill obj = new Bill.Builder(20000.00).guestId(10).build();
        Assert.assertEquals( obj.getAmount(), 20000.00);
        Assert.assertEquals( obj.getGuestId(), 10 );
    }
    
    @Test
    public void testUpdate()
    {
         Bill obj = new Bill.Builder(20000.00).guestId(10).build();
    }

   

   
}
