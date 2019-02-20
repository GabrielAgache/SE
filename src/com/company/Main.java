package com.company;



public class Main {

    public static void main(String[] args)
    {
        Person gigi = new Person("Gigi", "Romania");
        Person lili = new Person("Lili", "France");
        Person hans = new Person("Hans", "Deutschland");
        Person gabi = new Person("Gabi","Romania");


        Doctor doc_gigi = new Doctor(gigi,"Stomatolog","UMF" );
        Doctor doc_lili=  new Doctor(lili,"Doctor de familie","UBB");
        //Test
        System.out.println(doc_gigi);

        Stomatolog stomato_gigi= new Stomatolog(doc_gigi,"Str. Ion Creanga");
        System.out.println(stomato_gigi);
        GP gp_lili= new GP(doc_lili);
        gp_lili.pacienti.add(hans);
        gp_lili.pacienti.add(gabi);
        gp_lili.pacienti.add(gigi);
        System.out.println(gp_lili);
    }
}
