package first;

import java.util.*;
import java.util.Scanner;

public class first {
	public static void main(String[] args) {
	Scanner o = new Scanner(System.in);
	System.out.println("donner un nombre");
	int nbr = o.nextInt();
	
	int secret=10;
	
	while(nbr!=secret) {
		if (nbr < secret){
		System.out.println("donner un nombre plus grand");
		nbr = o.nextInt();
		}
		else if (nbr > secret) {
			System.out.println("donner un nombre plus petit");
			nbr = o.nextInt();
		}
		else {
			System.out.println("Bravo");
		}
	}
}
}
