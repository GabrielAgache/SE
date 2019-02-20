package com.company;

public class Doctor extends Person
{
    protected String spec;
    protected String universtity;

    public Doctor(String nume, String tara, String spec, String universtity) {
        this.name = nume;
        this.contry = tara;
        this.spec = spec;
        this.universtity = universtity;
    }

    public Doctor() {}

    public Doctor(Person person, String spec, String universitate) {
        this.name = person.name;
        this.contry = person.contry;
        this.spec = spec;
        this.universtity = universitate;

    }


    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getUniversitate() {
        return universtity;
    }

    public void setUniversitate(String universitate) {
        this.universtity = universitate;
    }
    @Override
    public String toString() {
        return "Doctor "+this.name + " from " + this.contry + " with spcialty in "+this.spec+" at "+this.universtity;
    }
}
