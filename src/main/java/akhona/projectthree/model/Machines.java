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
public final class Machines {
    private String maintainance;
    private String type;
    
    private Machines()
    {}
    
    private Machines( Builder builder )
    {
        maintainance = builder.maintainance;
        type = builder.type;
    }
    
    public static class Builder
    {
        private String maintainance;
        private String type;
        
        public Builder( String maintainance )
        {
            this.maintainance = maintainance;
        }
        
        public Builder type( String value )
        {
            type = value;
            return this;
        }
        
        public Machines build()
        {
            return new Machines(this);
        }
    }

    public String getMaintainance() {
        return maintainance;
    }

    public String getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.type);
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
        final Machines other = (Machines) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }
    
    
}
