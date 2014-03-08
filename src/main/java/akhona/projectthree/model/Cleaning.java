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
public final class Cleaning {
    private String time;
    private String staffId;
    
    private Cleaning()
    {}
    
    private Cleaning( Builder builder )
    {
        staffId = builder.staffId;
        time = builder.time;
    }
    
    public static class Builder
    {
        private String time;
        private String staffId;
        
        public Builder( String time )
        {
            this.time = time;
        }
        
        public Builder staffId( String value )
        {
            staffId = value;
            return this;
        }
        
        public Cleaning build()
        {
            return new Cleaning(this);
        }
    }

    public String getTime() {
        return time;
    }

    public String getStaffId() {
        return staffId;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.staffId);
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
        final Cleaning other = (Cleaning) obj;
        if (!Objects.equals(this.staffId, other.staffId)) {
            return false;
        }
        return true;
    }
    
    
}
