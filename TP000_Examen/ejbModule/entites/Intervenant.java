package entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Intervenant implements Serializable {

	@Id
	@GeneratedValue
	private int idIntervenant;
	private String nomIntervenant;
	public Intervenant() {
		// TODO Auto-generated constructor stub
	}
	public Intervenant(String nomIntervenant) {
		super();
		this.nomIntervenant = nomIntervenant;
	}
	public int getIdIntervenant() {
		return idIntervenant;
	}
	public void setIdIntervenant(int idIntervenant) {
		this.idIntervenant = idIntervenant;
	}
	public String getNomIntervenant() {
		return nomIntervenant;
	}
	public void setNomIntervenant(String nomIntervenant) {
		this.nomIntervenant = nomIntervenant;
	}
	
}
