package domaine;

import java.util.Scanner;

public class Client {
	
	private String nom;
	private String prenom;
	//private static int numeroDeCompte ;
	
	public Client(String nom, String prenom){
		
		this.nom = nom;
		this.prenom = prenom;		
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	// methode
	
public void creerCompte(){
		
		int test =0;
		Scanner sc = new Scanner(System.in);
		int reponse;
		// Je demande le type de compte que le client veut créer
		// Je m'assure que le type de compte donné est bon
		
		do {
		
		System.out.println("Bonjour, quel type de compte voulez vous créer? \n Pour créer un compte simple tapez 0\n Pour créer un compte epargne tapez 1\n Pour créer un compte payant tapez 2");
		reponse = sc.nextInt();
		
		if (reponse>=0 && reponse <=2)
			test = 1;
		else
			System.out.println("Le type de compte que vous avez demandé n'est pas valide.");		
		}while(test==0);
		
		switch (reponse) {
		case 0:
			
			CompteSimple c = new CompteSimple(1000f);

			break;
			
		case 1:
			
			CompteEpargne c1 = new CompteEpargne(0.45f);

			break;
			
		case 2:	
			
			ComptePayant c2 = new ComptePayant();

			break;
		
			
			
		}
		
	}

}
