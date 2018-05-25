package domaine;

import java.util.Scanner;

public class Client {

	private String nom;
	private String prenom;
	private Compte c;
	// private static int numeroDeCompte ;

	public Client(String nom, String prenom) {

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
	 * @param nom
	 *            the nom to set
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
	 * @param prenom
	 *            the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the c
	 */
	public Compte getC() {
		return c;
	}

	/**
	 * @param c
	 *            the c to set
	 */
	public void setC(Compte c) {
		this.c = c;
	}

	// methode

	public void creerCompte() {

		int test = 0;
		Scanner sc = new Scanner(System.in);
		int reponse;
		// Je demande le type de compte que le client veut cr�er
		// Je m'assure que le type de compte donn� est bon

		do {

			System.out.println(
					"Bonjour, quel type de compte voulez vous cr�er? \n Pour cr�er un compte simple tapez 0\n Pour cr�er un compte epargne tapez 1\n Pour cr�er un compte payant tapez 2");
			reponse = sc.nextInt();

			if (reponse >= 0 && reponse <= 2)
				test = 1;
			else
				System.out.println("Le type de compte que vous avez demand� n'est pas valide.");
		} while (test == 0);

		switch (reponse) {
		case 0:

			c = new CompteSimple(1000f);

			break;

		case 1:

			c = new CompteEpargne(0.45f);

			break;

		case 2:

			c = new ComptePayant();

			break;

		}

	}

}
