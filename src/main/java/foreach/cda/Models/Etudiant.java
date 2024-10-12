package foreach.cda.Models;

public class Etudiant {

	private int Id;
	private String Nom;
	private String Prenom;
	private String Email;
	private String Telephone;

	public Etudiant(int id, String nom, String prenom, String email, String telephone) {
		Id = id;
		Nom = nom;
		Prenom = prenom;
		Email = email;
		Telephone = telephone;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getTelephone() {
		return Telephone;
	}

	public void setTelephone(String telephone) {
		Telephone = telephone;
	}

}
