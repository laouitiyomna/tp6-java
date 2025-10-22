package tp6;

public class TestBibliotheque {
	
	public static void main(String[] args) {
        Bibliotheque biblio = new Bibliotheque(10);

        document d1 = new document("Java", 1, 100);
        document d2 = new document(" BDD", 1, 100);
        Article a1 = new Article("IA ", 2, 15, "Ghofrane");
        Livre l1 = new Livre("POO", 3, 350, "Yomna Laouiti", "siwar");
        Periodique p1 = new Periodique("Periodique ", 4, 40, "Mensuel");

        biblio.AjoutDoc(d1);
        biblio.AjoutDoc(d2);
        biblio.AjoutDoc(a1);
        biblio.AjoutDoc(l1);
        biblio.AjoutDoc(p1);

        System.out.println(" Inventaire complet :");
        biblio.InventaireDoc();
        
        biblio.SuppDoc(d2.Ident);

        System.out.println(" \n Liste des livres :");
        biblio.listlivre().InventaireDoc();

        System.out.println("\n Liste des périodiques :");
        biblio.listperiodique().InventaireDoc();

        System.out.println("\n Liste des articles :");
        biblio.listarticle().InventaireDoc();

        System.out.println("\nListe des documents simples :");
        biblio.listdocssimples().InventaireDoc();
    }

}
