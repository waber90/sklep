import java.util.ArrayList;

public class Zamowienie {

    private Sklep skleps;
    private ArrayList<Towar> towars;
    private String msc;
    private int rok;

    public Zamowienie(Sklep skleps, String msc, int rok){
        this.skleps = skleps;
        this.towars = new ArrayList<Towar>();
        this.msc = msc;
        this.rok = rok;
    }

    public void dodajTowar(Towar towar){
        this.towars.add(towar);
    }

    public Sklep getSkleps() {
        return skleps;
    }

    public String getMsc() {
        return msc;
    }

    public int getRok() {
        return rok;
    }

    public void zwrocZamowienie(){
        System.out.println("Sklep: "+getSkleps().getNazwa() +" Miesiąc: "+getMsc()+" Rok: "+getRok());
    }

}