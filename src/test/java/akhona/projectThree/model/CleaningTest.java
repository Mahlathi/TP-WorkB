/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.projectThree.model;

import akhona.projectthree.model.Cleaning;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author davinci
 */
public class CleaningTest {
    
    public CleaningTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation() {
        Cleaning obj = new Cleaning.Builder("18:58").staffId("7878").build();
        Assert.assertEquals( obj.getTime(), "18:58");
        Assert.assertEquals( obj.getStaffId(), "7878");
    }

    
}
