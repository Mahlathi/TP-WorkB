/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.projectThree.model;

import akhona.projectthree.model.RoomBooking;
import junit.framework.Assert;
import org.testng.annotations.Test;



/**
 *
 * @author davinci
 */
public class RoomBookingTest {
    
    public RoomBookingTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation() {
        RoomBooking obj = new RoomBooking.Builder("Normal Suite").guestId("878787").build();
        Assert.assertEquals( "Normal Suite", obj.getRoomType() );
        Assert.assertEquals( "878787", obj.getGuestId());
    }
}
