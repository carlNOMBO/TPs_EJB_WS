package entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Architecte implements Serializable{

	@Id
	@GeneratedValue
	private int idArchitecte;
	private String nomArchitecte;
		
	
	public Architecte() {
		// TODO Auto-generated constructor stub
	}


	public Architecte(String nomArchitecte) {
		super();
		this.nomArchitecte = nomArchitecte;
	}


	public int getIdArchitecte() {
		return idArchitecte;
	}


	public void setIdArchitecte(int idArchitecte) {
		this.idArchitecte = idArchitecte;
	}


	public String getNomArchitecte() {
		return nomArchitecte;
	}


	public void setNomArchitecte(String nomArchitecte) {
		this.nomArchitecte = nomArchitecte;
	}

}
