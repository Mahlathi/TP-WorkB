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
public final class Human {
    private String name;
    private int age;
    private String surname;
    
    private Human()
    {}
    
    private Human( Builder builder )
    {
        name = builder.name;
        age = builder.age;
        surname = builder.surname;
    }
    
    public static class Builder
    {
        private String name;
        private int age;
        private String surname;
        
        public Builder( int age )
        {
            this.age = age;
        }
        
        public Builder name( String value )
        {
            name = value;
            return this;
        }
        
        public Builder surname( String value )
        {
            surname = value;
            return this;
        }
        
        public Human build()
        {
            return new Human(this);
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.name);
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
        final Human other = (Human) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
}
