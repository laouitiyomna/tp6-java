package tp6;

public class Periodique extends document{
    private String frequence;
    public Periodique(String titre, int Ident,int nbPages, String frequence) {
        super(titre, Ident, nbPages);
        this.frequence=frequence;
    }
    
    public String getFrequence() { return frequence; }

    @Override
    public String getType() { return "Périodique"; }

    @Override
    public void edition() {
        super.edition();
        System.out.println("Fréquence: " + frequence);
    }
}
