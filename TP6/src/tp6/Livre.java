package tp6;

public class Livre extends Article{
    private String nomEditeur;
    public Livre(String titre,int Ident,int nbPages,String nomAuteur,String nomEditeur){
        super(titre,Ident,nbPages,nomAuteur);
        this.nomEditeur=nomEditeur;
    }
   
    public String getNomEditeur() {
        return nomEditeur;
    }
    
    @Override
    public String getType() { return "Livre"; }

    @Override
    public void edition() {
        super.edition();
        System.out.println("Éditeur: " + nomEditeur);
    }
}
