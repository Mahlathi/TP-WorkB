/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.projectthree.model;

/**
 *
 * @author davinci
 */
public final class Staff {
    private int staffId;
    private String name;
    
    private Staff()
    {}
    
    private Staff( Builder builder )
    {
        staffId = builder.staffId;
        name = builder.name;
    }
    
    public static class Builder
    {
        private int staffId;
        private String name;
        
        public Builder( String name )
        {
            this.name = name;
        }
        
        public Builder staffId( int value )
        {
            staffId = value;
            return this;
        }
        
        public Staff build()
        {
            return new Staff(this);
        }
    }

    public int getStaffId() {
        return staffId;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + this.staffId;
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
        final Staff other = (Staff) obj;
        if (this.staffId != other.staffId) {
            return false;
        }
        return true;
    }
    
    
}
