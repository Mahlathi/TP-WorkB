/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.projectThree.model;

import akhona.projectthree.model.PayRoll;
import org.testng.Assert;
import org.testng.annotations.Test;



/**
 *
 * @author davinci
 */
public class PayRollTest {
    
    public PayRollTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation() {
            PayRoll obj = new PayRoll.Builder(200.000).staffId(1414).build();
            Assert.assertEquals( obj.getAmount(), 200.000 );
            Assert.assertEquals( obj.getStaffId(), 1414 );
        }
}
