package domaine;

public class CompteEpargne extends Compte {
	
	// Attributs
	private float taux;
	
	// Constructeur 
	
	public CompteEpargne(float taux1) {
		
		super();
		
		this.taux = taux1;

	}
	
	// Méthodes
	
	public void calculInterets() {
		
		super.verser(solde*taux/(100f));
		System.out.println("Votre solde a été crédité de " + solde*taux/(100f) + "€. Votre nouveau solde est " + solde);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + ", taux=" + taux + " Type de compte = Compte Epargne";
	}

}
