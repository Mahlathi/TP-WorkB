/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.projectThree.model;

import akhona.projectthree.model.EventSchedule;
import org.testng.Assert;
import org.testng.annotations.Test;



/**
 *
 * @author davinci
 */
public class EventScheduleTest {
    
    public EventScheduleTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation() {
        EventSchedule obj = new EventSchedule.Builder("Multi-perpose Hall").type("Musical").build();
        Assert.assertEquals( obj.getVenue(), "Multi-perpose Hall");
        Assert.assertEquals( obj.getType(), "Musical");
    }

   
}
