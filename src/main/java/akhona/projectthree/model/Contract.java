/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.projectthree.model;

import java.util.Objects;

/**
 *
 * @author davinci
 */
public final class Contract {
    private int duration;
    private String staffId;
    
    private Contract()
    {}
    
    private Contract( Builder builder )
    {
        duration = builder.duration;
        staffId = builder.staffId;
    }
    
    public static class Builder
    {
       private int duration;
       private String staffId;
       
       public Builder( int duration )
       {
           this.duration = duration;
       }
       
       public Builder staffId( String value )
       {
           staffId = value;
           return this;
       }
       
       public Contract build()
       {
           return new Contract(this);
       }
    }

    public int getDuration() {
        return duration;
    }

    public String getStaffId() {
        return staffId;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.staffId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contract other = (Contract) obj;
        if (!Objects.equals(this.staffId, other.staffId)) {
            return false;
        }
        return true;
    }
    
    
}
