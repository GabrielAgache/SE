package com.company;

public class Stomatolog extends Doctor
{
    private String adresaCabinet;

    public Stomatolog(String nume, String tara, String spec,
                      String universtity, String adresaCabinet) {
        this.name = nume;
        this.contry = tara;
        this.spec = spec;
        this.universtity = universtity;
        this.adresaCabinet = adresaCabinet;
    }

    public Stomatolog(Doctor doctor, String adresaCabinet) {
        this.name = doctor.name;
        this.contry = doctor.contry;
        this.spec = doctor.spec;
        this.universtity = doctor.universtity;
        this.adresaCabinet = adresaCabinet;

    }


    public String getAdresaCabinet() {
        return adresaCabinet;
    }

    public void setAdresaCabinet(String adresaCabinet) {
        this.adresaCabinet = adresaCabinet;
    }
    @Override
    public  String toString()
    {
        return "Doctor Stomatologist: "+this.name+" from "+this.contry+" with work adress:"+this.adresaCabinet;
    }
}
