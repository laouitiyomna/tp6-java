package tp6;

public class document {
    protected String titre;
    protected int Ident;
    protected int nbPages;

    public document(String titre, int Ident, int nbPages) {
        this.titre = titre;
        this.Ident = Ident;
        this.nbPages = nbPages;
    }
    
    
    public String getTitre() { return titre; }
    public int getNumIdent() { return Ident; }
    public int getNbPages() { return nbPages; }

    public String getType() { return "Document"; }

    public void edition() {
        System.out.println("Type: " + getType() + 
                           " | Titre: " + titre +
                           " | Numéro: " + Ident +
                           " | Pages: " + nbPages);
    }

    
}