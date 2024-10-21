package isen.library;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class PersonTest {

    @Test
    public void testPerson() {
        Person person = new Person();
        assertEquals("unknown", person.getName());
        assertEquals(22, person.getYears());
    }


    @org.junit.jupiter.api.Test
    void setName() {
        Person person = new Person();
        person.setName("test");
        assertEquals("test", person.getName());
    }

    @org.junit.jupiter.api.Test
    void setyears() {
        Person person = new Person();
        person.setYears(22);
        assertEquals(22, person.getYears());
    }
}