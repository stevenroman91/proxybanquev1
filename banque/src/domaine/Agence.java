package domaine;

import java.util.Scanner;

public class Agence {
	
	// Attribus 
	
	private String nom;
	
	// Constructeur
	
	public Agence(String nom) {
		
		this.nom = nom;

	}
	
	// M�thodes
	
	public Client ajouterClient(String nom, String prenom){
		
		Client client1=new Client(nom,prenom);
		return client1;
	}
	

}
