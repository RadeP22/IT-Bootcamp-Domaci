package DomaciNedelja7Sreda;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<SastojakRecepta> sastojci = new ArrayList<>();
        SastojakRecepta brasno = new SastojakRecepta("Brašno", 10, 100);
        SastojakRecepta jaja = new SastojakRecepta("Jaja", 15, 3);
        SastojakRecepta mleko = new SastojakRecepta("Mleko", 1, 100);
        sastojci.add(brasno);
        sastojci.add(jaja);
        sastojci.add(mleko);

        Recept palacinke = new Recept("Palacinke", 2, sastojci);

        System.out.println(palacinke);

        SastojakRecepta brasno1 = new SastojakRecepta("Brašno", 10, 100);

        palacinke.ukloniSastojak(brasno1);

        System.out.println(palacinke);

        System.out.println("Ukupna cena je "  + palacinke.ukupnaCena());

        palacinke.skaliranje(25);

        System.out.println("Ukupna cena je "  + palacinke.ukupnaCena());

        palacinke.dodajSastojak(brasno1);

        Recept a = new Recept("a",1, sastojci);
        Recept b = new Recept("b",2, sastojci);
        Recept c = new Recept("c",3, sastojci);
        Recept d = new Recept("d",4, sastojci);
        Recept e = new Recept("e",5, sastojci);
        Recept f = new Recept("f",1, sastojci);
        Recept g = new Recept("g",1, sastojci);
        Recept h = new Recept("h",1, sastojci);

        ArrayList<Recept> recepti = new ArrayList<>();
        recepti.add(a);
        recepti.add(b);
        recepti.add(c);
        recepti.add(d);
        recepti.add(e);
        recepti.add(f);
        recepti.add(g);
        recepti.add(h);

       // System.out.println(Recept.filtrirajRecepte(recepti,1));

        int[] tzn = {1,2};

      //  System.out.println(Recept.filtrirajRecepte(recepti,tzn));
    }
}
