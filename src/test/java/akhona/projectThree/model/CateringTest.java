/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.projectThree.model;

import akhona.projectthree.model.Catering;
import junit.framework.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author davinci
 */
public class CateringTest {
    
    public CateringTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation() {
        Catering obj = new Catering.Builder("pizza").roomNumber(20).build();
        Assert.assertEquals( "pizza", obj.getOrder() );
        Assert.assertEquals( 20, obj.getRoomNumber() );
    }

   
}
