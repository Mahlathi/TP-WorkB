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
public final class Extras {
    private String roomType;
    private String item;
    
    private Extras()
    {}
    
    private Extras( Builder builder )
    {
        roomType = builder.roomType;
        item = builder.item;
    }
    
    public static class Builder
    {
        private String roomType;
        private String item;  
    
        public Builder( String item )
        {
            this.item = item;
        }
        
        public Builder roomType( String value )
        {
            roomType = value;
            return this;
        }
        
        public Extras build()
        {
            return new Extras(this);
        }
    }

    public String getRoomType() {
        return roomType;
    }

    public String getItem() {
        return item;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.roomType);
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
        final Extras other = (Extras) obj;
        if (!Objects.equals(this.roomType, other.roomType)) {
            return false;
        }
        return true;
    }
    
}



