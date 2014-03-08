/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.projectThree.model;

import akhona.projectthree.model.Room;
import org.testng.Assert;
import org.testng.annotations.Test;



/**
 *
 * @author davinci
 */
public class RoomTest {
    
    public RoomTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation() {
        Room obj = new Room.Builder("Presidential suite").roomNumber(2020).build();
        Assert.assertEquals( obj.getRoomType(), "Presidential suite" );
        Assert.assertEquals( obj.getRoomNumber(), 2020 );
    }

    
}
