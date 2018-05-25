package domaine;

public class ComptePayant extends Compte {
	
	// Constructeurs
	
	public ComptePayant() {
		
		super();

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + " Type de compte = Compte Payant";
	}
	
	// Méthodes
	
public void verser(float mt) {
		
		super.verser(mt*0.99f);
		
		
	}

	public void retirer(float mt) {
		
		if (solde - mt*1.01 > 0 )
			solde -= mt*1.01;
		else
		  System.out.println("votre solde ne vous permet pas de retirer " + mt +"€.");

	}
	
	
	
	
	

}
