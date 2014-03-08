/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.projectThree.model;

import akhona.projectthree.model.Machines;
import org.testng.Assert;
import org.testng.annotations.Test;



/**
 *
 * @author davinci
 */
public class MachinesTest {
    
    public MachinesTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation() {
        Machines obj = new Machines.Builder("3 months").type("Tumble Dryer").build();
        Assert.assertEquals( obj.getMaintainance(), "3 months");
        Assert.assertEquals( obj.getType(), "Tumble Dryer");
    }

}
