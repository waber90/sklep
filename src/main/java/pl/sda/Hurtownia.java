package pl.sda;

public class Hurtownia {

    public static void main(String[] args) {
        Sklep sklep1 = new Sklep("6055548","uGosi","Wojska Polskiego",34,17);
        Sklep sklep2 = new Sklep("6054878","Babka","Wesoła",40,3);

        //pl.sda.Hurtownia h1 = new pl.sda.Hurtownia();
        sklep1.zwrocInfo();
        sklep2.zwrocInfo();

        Towar t1 = new Towar(3,3.90,"maka");
        Zamowienie zam1= new Zamowienie(sklep1,"Luty",2006);

        zam1.dodajTowar(t1);

        zam1.zwrocZamowienie();

    }
}