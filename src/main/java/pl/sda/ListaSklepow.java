package pl.sda;

import java.util.ArrayList;
import java.util.List;

public class ListaSklepow {

    private List<Sklep> skleps;

    public ListaSklepow(List<Sklep> skleps){
        this.skleps = new ArrayList<Sklep>();
    }

    public void dodajSklep(Sklep sklep){
        this.skleps.add(sklep);
    }

}