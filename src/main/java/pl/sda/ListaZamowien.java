package pl.sda;

import java.util.ArrayList;
import java.util.List;

public class ListaZamowien {

    private List<Zamowienie> zamowienies;

    public ListaZamowien(List<Zamowienie> zamowienies){
        this.zamowienies = new ArrayList<Zamowienie>();
    }

    public void dodajZamowienie(Zamowienie zamowienie){
        this.zamowienies.add(zamowienie);
    }

    public Zamowienie zwrocInfoZam(String msc){
        Zamowienie zamowienie = null;
        for(Zamowienie t: zamowienies){
            if(t.getMsc().equals(msc)){
                zamowienie = t;
            }
        }
        return zamowienie;
    }

}