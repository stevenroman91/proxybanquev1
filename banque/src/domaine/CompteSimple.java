package domaine;

public class CompteSimple extends Compte {

	// Attribu

	private float decouvert;

	// Constructeur

	public CompteSimple(float dec) {
		super();
		this.decouvert = dec;

	}

	public void retirer(float mt) {

		if (Math.abs(solde - mt) <= decouvert)
			solde -= mt;
		else
			System.out.println("votre découvert autorisé ne vous permet pas de retirer " + mt + "€.");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + ", decouvert=" + decouvert + " Type de compte = Compte Simple";
	}

}
