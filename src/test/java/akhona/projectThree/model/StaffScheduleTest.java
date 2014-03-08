/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.projectThree.model;

import akhona.projectthree.model.StaffSchedule;
import org.testng.Assert;
import org.testng.annotations.Test;



/**
 *
 * @author davinci
 */
public class StaffScheduleTest {
    
    public StaffScheduleTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation() {
        StaffSchedule obj = new StaffSchedule.Builder("15-01-2014").time("12:22").build();
        Assert.assertEquals( obj.getDate(), "15-01-2014");
        Assert.assertEquals( obj.getTime(), "12:22");
        
    }

}
