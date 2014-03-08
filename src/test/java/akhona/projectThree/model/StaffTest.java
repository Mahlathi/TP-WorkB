/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.projectThree.model;

import akhona.projectthree.model.Staff;
import org.testng.Assert;
import org.testng.annotations.Test;



/**
 *
 * @author davinci
 */
public class StaffTest {
    
    public StaffTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation() throws Exception{
        Staff obj = new Staff.Builder("Akhona").staffId(2021).build();
        Assert.assertEquals( obj.getName(), "Akhona");
        Assert.assertEquals( obj.getStaffId(), 2021);
    }

   
}
