package tp6;

public class Bibliotheque {
	private document[] listDoc;
    private int nbdocuments;
    private int capacite;
    
    public Bibliotheque(int capacite) {
        this.listDoc = new document[capacite];
        this.capacite = capacite;
    }
    public int getCapacite() {
        return capacite;
    }
    
    void AjoutDoc(document d) {
        if(nbdocuments>capacite){
            System.out.println("Bibliotheque pleine");
            return;
        }
        else if (nbdocuments==0) {
            listDoc[0]=d;
            nbdocuments++;
            return;
        }
        else {
            int i=0;
            while(i<nbdocuments && listDoc[i].Ident<d.Ident){
                i++;
            }
            for(int j=nbdocuments;j>i;j--) {
                listDoc[j]=listDoc[j-1];
            }
            listDoc[i]=d;
            nbdocuments++;
        }
    }
    
    public void SuppDoc(int num){
        for  (int i=0; i<nbdocuments; i++){
            if (num==listDoc[i].Ident){
                for (int j=i; j<nbdocuments; j++){
                    listDoc[j]=listDoc[j+1];
                }
                listDoc[nbdocuments-1]=null;
                nbdocuments--;
            }
        }
    }
    public void InventaireDoc(){
        for  (int i=0; i<nbdocuments; i++){
            listDoc[i].edition();
        }
    }
    
    public int getNbdocuments(){
        return nbdocuments;
    }
    public Bibliotheque listlivre(){
        Bibliotheque biblio1 = new Bibliotheque(capacite);
        for  (int i=0; i<nbdocuments; i++){
            if (listDoc[i] instanceof Livre){
            	biblio1.AjoutDoc(listDoc[i]);
            }
        }
        return biblio1;
    }
    public Bibliotheque listarticle(){
        Bibliotheque biblio2 = new Bibliotheque(capacite);
        for  (int i=0; i<nbdocuments; i++){
            if (listDoc[i] instanceof Article){
            	biblio2.AjoutDoc(listDoc[i]);
            }
        }
        return biblio2;
    }
    public Bibliotheque listdocssimples(){
        Bibliotheque biblio3 = new Bibliotheque(capacite);
        for  (int i=0; i<nbdocuments; i++){
            if (listDoc[i] instanceof document){
            	biblio3.AjoutDoc(listDoc[i]);
            }
        }
        return biblio3;
    }
    public Bibliotheque listperiodique(){
        Bibliotheque biblio4 = new Bibliotheque(capacite);
        for  (int i=0; i<nbdocuments; i++){
            if (listDoc[i] instanceof Periodique){
            	biblio4.AjoutDoc(listDoc[i]);
            }
        }
        return biblio4;
    }
    
}
