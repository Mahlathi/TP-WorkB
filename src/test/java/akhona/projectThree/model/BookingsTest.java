/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.projectThree.model;

import akhona.projectthree.model.Bookings;
import junit.framework.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author davinci
 */
public class BookingsTest {
    
    public BookingsTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
     @Test
     public void testCreation() throws Exception {
         Bookings obj = new Bookings.Builder("Akhona").guestId("10111").build();
         Assert.assertEquals( "Akhona", obj.getGuestName());
         Assert.assertEquals( "10111", obj.getGuestId());
     }
     
}
