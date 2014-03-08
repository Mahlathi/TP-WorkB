/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.projectThree.model;

import akhona.projectthree.model.Extras;
import org.testng.Assert;
import org.testng.annotations.Test;



/**
 *
 * @author davinci
 */
public class ExtrasTest {
    
    public ExtrasTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation() {
        Extras obj = new Extras.Builder("Adaptor").roomType("Presidential suite").build();
        Assert.assertEquals( obj.getItem(), "Adaptor");
        Assert.assertEquals( obj.getRoomType(), "Presidential suite");
    }

}
