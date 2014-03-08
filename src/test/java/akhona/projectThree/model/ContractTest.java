/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.projectThree.model;

import akhona.projectthree.model.Contract;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author davinci
 */
public class ContractTest {
    
    public ContractTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testCreation() {
         Contract obj = new Contract.Builder(6).staffId("556556").build();
         Assert.assertEquals( obj.getDuration(), 6 );
         Assert.assertEquals( obj.getStaffId(), "556556");
     }

}
