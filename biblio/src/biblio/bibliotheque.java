package biblio;
import java.util.ArrayList;
import java.util.List;

public class bibliotheque {
	
	
	
	private List<livre> books;

    public bibliotheque() {
        this.books = new ArrayList<>();
    }
    
    public void ajouter(livre book) {
    	books.add(book);
    }
    
    public void afficher() {
    	for(livre livr : books ) {
    		livr.afficher();
    	}
    }
    
    public static void main(String[] arg) {
		livre ktab= new livre("book","mee" , 2012);
		livre ktab1= new livre("book1","mee1" , 2013);
		livre ktab2= new livre("book2","mee2" , 2014);
		bibliotheque bib= new bibliotheque();
		
		bib.ajouter(ktab);
		bib.ajouter(ktab1);
		bib.ajouter(ktab2);
		
		bib.afficher();
		
	}

}
