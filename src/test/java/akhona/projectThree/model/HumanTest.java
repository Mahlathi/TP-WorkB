/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.projectThree.model;

import akhona.projectthree.model.Human;
import org.testng.Assert;
import org.testng.annotations.Test;



/**
 *
 * @author davinci
 */
public class HumanTest {
    
    public HumanTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation() {
        Human obj = new Human.Builder(12).name("Simxolele").surname("Nyanga Nukwa").build();
        Assert.assertEquals( obj.getAge(), 12 );
        Assert.assertEquals( obj.getName(), "Simxolele" );
        Assert.assertEquals( obj.getSurname(), "Nyanga Nukwa" );
    }
}
