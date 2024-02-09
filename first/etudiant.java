package first;
import java.util.*; 
public class etudiant {
	
	private int age =0 ;
	private double note = 17.5;
	
	public String nom = "med";
	public String prenom ="khachlaa";
	
	
    
    
	
	public void display() {
		System.out.println("nom=" + nom +"prenom" + prenom + "age=" + age + "note =" + note );
	}
	
	
	public int ajouter_note(int a) {
		note =a ;
		return note ;
	}
	
}
