package ex2;

public class LivretA extends CompteBancaire {

	public static final int pourcentage = 100;
	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;
	public LivretA(TypeCompte type, double solde, double decouvert, double tauxRemuneration) {
		super(type, solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}

	public void appliquerRemuAnnuelle(){
			setSolde(getSolde() + getSolde()*tauxRemuneration/ pourcentage);
	}

	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}
