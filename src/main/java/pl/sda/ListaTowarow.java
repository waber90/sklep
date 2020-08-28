package pl.sda;

import java.util.ArrayList;
import java.util.List;

public class ListaTowarow {

    private List<Towar> towars;

    public ListaTowarow(List<Towar> towar){
        this.towars = new ArrayList<Towar>();
    }

    public void dodajTowar(Towar towar){
        this.towars.add(towar);
    }

}