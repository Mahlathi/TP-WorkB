/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.projectThree.model;

import akhona.projectthree.model.EventBooking;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author davinci
 */
public class EventBookingTest {
    
    public EventBookingTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation() {
        EventBooking obj = new EventBooking.Builder("Stand-up comedy").date("15012014").build();
        Assert.assertEquals( obj.getEvent(), "Stand-up comedy");
        Assert.assertEquals( obj.getDate(), "15012014");
    }

   
}
