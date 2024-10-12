package foreach.cda.Services;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import foreach.cda.Models.Etudiant;
import foreach.cda.Wrappers.EtudiantWrapper;

import java.util.List;

public class EtudiantService {
	private JdbcTemplate jdbcTemplate;

	public EtudiantService(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Etudiant> getAll() {
		String sql = "SELECT * FROM etudiants";
		return this.jdbcTemplate.query(sql, new EtudiantWrapper());
	}

}
