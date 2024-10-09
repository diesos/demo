package foreach.cda.Models;

public class Cour {

	private int id;
	private Date dateDebut;
	private Date dateFin;
	private Ue ue;
	private Formateur formateur;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public Ue getUe() {
		return ue;
	}

	public void setUe(Ue ue) {
		this.ue = ue;
	}

	public Formateur getFormateur() {
		return formateur;
	}

	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}

}
