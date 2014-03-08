/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.projectThree.model;

import akhona.projectthree.model.Transport;
import org.testng.Assert;
import org.testng.annotations.Test;



/**
 *
 * @author davinci
 */
public class TransportTest {
    
    public TransportTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation() {
        Transport obj = new Transport.Builder(5858).build();
        Assert.assertEquals( obj.getGuestId(), 5858 );
    }

   
}
