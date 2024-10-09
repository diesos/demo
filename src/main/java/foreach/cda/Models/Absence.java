package foreach.cda.Models;

import org.apache.commons.lang3.time.DateFormatUtils;

public class Absence {
	private int Id;
	private DateFormatUtils DateDebut;
	private DateFormatUtils DateFin;
	private String Type;
	private int FkEtudiant;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public Date getDateDebut() {
		return DateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		DateDebut = dateDebut;
	}

	public Date getDateFin() {
		return DateFin;
	}

	public void setDateFin(Date dateFin) {
		DateFin = dateFin;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public int getFkEtudiant() {
		return FkEtudiant;
	}

	public void setFkEtudiant(int fkEtudiant) {
		FkEtudiant = fkEtudiant;
	}
}
