package com.company;

import java.util.Objects;

public class Person {

    protected String name;
    protected String contry;

    public Person(String name, String contry) {
        this.name = name;
        this.contry = contry;
    }

    public Person() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getContry() {
        return contry;
    }

    public void setContry(String contry) {
        this.contry = contry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(contry, person.contry);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, contry);
    }
    @Override
    public String toString(){
        return this.name+" from "+this.contry;
    }
}
