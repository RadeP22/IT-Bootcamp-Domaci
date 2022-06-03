package DomaciNedelja7Sreda;

import java.util.ArrayList;

public class Recept {

    private String naziv;
    private int težina;
    private ArrayList <SastojakRecepta> sastojci;

   public Recept(String naziv, int težina, ArrayList<SastojakRecepta> sastojci) {
        this.naziv = naziv;
        this.težina = težina;
        this.sastojci = sastojci;
    }

    public Recept(int težina) {
        this.težina = težina;
    }

    public Recept() {
        this.naziv = "";
        this.težina = 0;
        this.sastojci = new ArrayList<>();
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getTežina() {
        return težina;
    }

    public void setTežina(int težina) {
        this.težina = težina;
    }

    public ArrayList<SastojakRecepta> getSastojci() {
        return sastojci;
    }

    public void setSastojak(ArrayList<SastojakRecepta> sastojci) {
        this.sastojci = sastojci;
    }

    public void dodajSastojak(SastojakRecepta x){
        sastojci.add(x);
    }

    public void ukloniSastojak(SastojakRecepta x){
        for (int i = 0; i < sastojci.size(); i++) {
            if(x.getKolicina() == sastojci.get(i).getKolicina()
                    && x.getNaziv() == sastojci.get(i).getNaziv()
                    && x.getCena() == sastojci.get(i).getCena())
                sastojci.remove(sastojci.get(i));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(naziv).append(":").append("\n");
        sb.append("Težina: ");
        switch (težina){
            case 1:
                sb.append("Početni nivo");
                break;
            case 2:
                sb.append("Lak nivo");
                break;
            case 3:
                sb.append("Srednji nivo");
                break;
            case 4:
                sb.append("Težak nivo");
                break;
            case 5:
                sb.append("Majstorski nivo");
                break;
        }
        sb.append("\n").append("Sastojci: ");
        for(int i = 0; i < sastojci.size(); i++){
            sb.append(sastojci.get(i).getNaziv());
            if(i == sastojci.size() - 1)
                break;
            else
                sb.append(", ");
        }
        sb.append("\n");
        return sb.toString();
    }

    public double ukupnaCena(){
       double cena = 0;
       for(SastojakRecepta x : sastojci)
           cena += x.ukupnaCena();
       return cena;
    }

    public void skaliranje(double x){
       for(SastojakRecepta sas : sastojci)
           sas.setKolicina(sas.getKolicina() * (x / 100));
    }

    public static ArrayList<Recept> filtrirajRecepte(ArrayList<Recept> recepti, int težina){
        ArrayList<Recept> r = new ArrayList<>();
           for(Recept x : recepti) {
               if (x.težina == težina)
                   r.add(x);
           }
        return r;
    }

    public static ArrayList<Recept> filtrirajRecepte(ArrayList<Recept> recepti, int[] težina){
        ArrayList<Recept> r = new ArrayList<>();
        for(int x : težina)
            r.addAll(filtrirajRecepte(recepti, x));
        return r;
    }

}
