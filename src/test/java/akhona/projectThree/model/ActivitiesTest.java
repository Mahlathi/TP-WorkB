/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.projectThree.model;

import akhona.projectthree.model.Activities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author davinci
 */
public class ActivitiesTest {
    
    public ActivitiesTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
     @BeforeClass
    public static void setUpClass() throws Exception {
    }
    
    @Test
    public void testCreation() throws Exception {
        Activities obj = new Activities.Builder("Magicshow").ageLimit(18).date("15012014").time("1703").venue("Hall").build();
        Assert.assertEquals( obj.getType(), "Magicshow" );
        Assert.assertEquals( obj.getAgeLimit(), 18 );
        Assert.assertEquals( obj.getDate(), "15012014" );
        Assert.assertEquals( obj.getTime(),  "1703" );
        Assert.assertEquals( obj.getVenue(), "Hall");
        
    }
    
    @Test
    public void testUpdate()
    {
       Activities obj = new Activities.Builder("Magicshow").ageLimit(18).date("15012014").time("1703").venue("Hall").build(); 
    }

}
