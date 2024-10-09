package foreach.cda.Models;

public class Suivre {
	private int FkEtudiants;
	private int FkCours;

	public int getFkEtudiants() {
		return FkEtudiants;
	}

	public void setFkEtudiants(int fkEtudiants) {
		FkEtudiants = fkEtudiants;
	}

	public int getFkCours() {
		return FkCours;
	}

	public void setFkCours(int fkCours) {
		FkCours = fkCours;
	}

}
