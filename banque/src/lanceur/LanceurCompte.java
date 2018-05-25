package lanceur;

import domaine.Agence;
import domaine.Client;
import domaine.Compte;
import domaine.CompteEpargne;
import domaine.ComptePayant;
import domaine.CompteSimple;

public class LanceurCompte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		// -------- Test Compte Simple
		CompteSimple compteS = new CompteSimple(1000f);
		compteS.verser(1000f);
		System.out.println(compteS);
		compteS.retirer(500f);
		System.out.println(compteS);
		compteS.retirer(1500f);
		System.out.println(compteS);
		compteS.retirer(1f);
		System.out.println(compteS);
		// -------- Test Compte Epargne
		CompteEpargne compteE = new CompteEpargne(0.45f);
		System.out.println(compteE);
		compteE.verser(1000f);
		System.out.println(compteE);
		compteE.calculInterets();
		compteE.verser(1000f);
		System.out.println(compteE);
		compteE.calculInterets();
		compteE.retirer(2013f);
		System.out.println(compteE);
		compteE.retirer(1f);
		System.out.println(compteE);
		// -------- Test Compte Payant
		ComptePayant compteP = new ComptePayant();
		System.out.println(compteP);
		compteP.verser(1000f);
		System.out.println(compteP);
		compteP.retirer(100f);
		System.out.println(compteP);*/
		
		Agence agence = new Agence("caisseDepargne");
		
		Client client1= agence.ajouterClient("Roman", "Steven");
		
		client1.creerCompte();
		
		Compte c=client1.getC();
		
		System.out.println(c);
		
	}

}
