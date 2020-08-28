package pl.sda;

public class Towar {

    private int ID;
    private double cena;
    private String opis;

    public Towar(int ID, double cena, String opis) {
        this.ID = ID;
        this.cena = cena;
        this.opis = opis;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

}