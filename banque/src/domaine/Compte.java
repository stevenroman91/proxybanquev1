package domaine;

public class Compte {
	// Attribus

	private int code;
	protected float solde = 0;
	private static int nbComptes;

	// Constructeur

	public Compte() {
		
		nbComptes++;
		code = 10000 + nbComptes;
		
	}

	// Methodes

	public void verser(float mt) {
		
		solde += mt;
		
	}

	public void retirer(float mt) {
		
		if (solde - mt > 0 )
			solde -= mt;
		else
		  System.out.println("votre solde ne vous permet pas de retirer " + mt +"€.");

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Compte : code=" + code + ", solde=" + solde ;
	}

	
	

}
