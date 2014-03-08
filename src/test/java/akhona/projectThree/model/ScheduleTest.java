/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.projectThree.model;

import akhona.projectthree.model.Schedule;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 *
 * @author davinci
 */
public class ScheduleTest {
    
    public ScheduleTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation() {
        Schedule obj = new Schedule.Builder("14:33").date("17-01-2014").build();
        Assert.assertEquals( obj.getTime(), "14:33" );
        Assert.assertEquals( obj.getDate(), "17-01-2014" );
    }

    
}
