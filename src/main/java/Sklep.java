public class Sklep {

    private String NIP;
    private String nazwa;
    private String ulica;
    private int nr_dom;
    private int nr_lok;

    public Sklep(String NIP, String nazwa, String ulica, int nr_dom, int nr_lok) {
        this.NIP = NIP;
        this.nazwa = nazwa;
        this.ulica = ulica;
        this.nr_dom = nr_dom;
        this.nr_lok = nr_lok;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public int getNr_dom() {
        return nr_dom;
    }

    public void setNr_dom(int nr_dom) {
        this.nr_dom = nr_dom;
    }

    public int getNr_lok() {
        return nr_lok;
    }

    public void setNr_lok(int nr_lok) {
        this.nr_lok = nr_lok;
    }

    public void zwrocInfo(){
        System.out.println("Sklep: '"+getNazwa()+"' znajduje sie na ul."+getUlica()+" "+getNr_dom()+"/"+getNr_lok());
    }

}