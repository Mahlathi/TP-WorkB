/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.projectThree.model;

import akhona.projectthree.model.Laundry;
import org.testng.Assert;
import org.testng.annotations.Test;





/**
 *
 * @author davinci
 */
public class LaundryTest {
    
    public LaundryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    @Test
    public void testCreation()
    {
        Laundry obj = new Laundry.Builder("Jersey").guestId(7878).build();
        Assert.assertEquals( obj.getItems(), "Jersey");
        Assert.assertEquals( obj.getGuestId(), 7878 );
    }
}
