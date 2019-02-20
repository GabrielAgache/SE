package com.company;

import java.util.HashSet;
import java.util.Set;

public class GP extends Doctor{
    public Set<Person> pacienti;

    public Set<Person> getAllPacienti() {
        return this.pacienti;
    }

    public GP(String nume, String tara, String specializare,
                      String universitate) {
        this.pacienti=new HashSet<>();
        this.name = nume;
        this.contry = tara;
        this.spec = specializare;
        this.universtity = universitate;
    }

    public  GP (Doctor doctor)
    {
        this.pacienti=new HashSet<>();
        this.name =doctor.name;
        this.contry =doctor.contry;
        this.spec =doctor.spec;
        this.universtity =doctor.universtity;

    }
    @Override
    public  String toString ()
    {
        StringBuilder builder= new StringBuilder();
        builder.append(this.name+" from "+this.contry+" has the pacients :\n");
        for (Person person: pacienti)
        {
            builder.append(person.toString());
            builder.append("\n");
        }
        return  builder.toString();

    }


}
