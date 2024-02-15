package biblio;

public class livre {
	
		private String titre;
		private String auteur ;
		private int anneePublication ;
		
	public livre(String titr , String aut , int a_pub) {
		titre = titr ;
		auteur =aut ;
		anneePublication = a_pub ;
	}
	
	public void  afficher() {
		System.out.println("titre: "+ titre +"auteur:"+auteur +"A.Publication:"+anneePublication );
	}
	public static void main(String[] arg) {
		livre ktab= new livre("book","mee" , 20012);
		ktab.afficher();
		
	}
}

