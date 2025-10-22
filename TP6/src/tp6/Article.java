package tp6;

public class Article extends document{
	protected String nomAuteur;
	
	public Article (String titre, int Ident, int nbPages,String nomAuteur) {
		super(titre,Ident, nbPages);
        this.nomAuteur = nomAuteur;
	}
	
	public String getAuteur() { return nomAuteur; }

    @Override
    public String getType() { return "Article"; }

    @Override
    public void edition() {
        super.edition();
        System.out.println("Auteur: " + nomAuteur);
    }
}
