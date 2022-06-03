package DomaciNedelja7Sreda;

public class SastojakRecepta extends Sastojak {

    private double kolicina;

    public SastojakRecepta(String naziv, double cena, double kolicina) {
        super(naziv, cena);
        this.kolicina = kolicina;
    }

    public SastojakRecepta() {
        this.kolicina = 0;
    }

    public double getKolicina() {
        return kolicina;
    }

    public void setKolicina(double kolicina) {
        this.kolicina = kolicina;
    }

    @Override
    public String getNaziv(){
        return super.getNaziv();
    }

    @Override
    public double getCena(){
        return super.getCena();
    }

    public double ukupnaCena(){
        return kolicina * super.getCena();
    }

}



