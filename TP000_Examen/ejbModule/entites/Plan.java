package entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Plan implements Serializable{

	@Id
	@GeneratedValue
	private int idPlan;
	private String numArchive;
	@ManyToOne@JoinColumn(name="idArchitecte")
	private Architecte architecte;
	
	public Plan() {
		// TODO Auto-generated constructor stub
	}

	public Plan(String numArchive, Architecte architecte) {
		super();
		this.numArchive = numArchive;
		this.architecte = architecte;
	}

	public int getIdPlan() {
		return idPlan;
	}

	public void setIdPlan(int idPlan) {
		this.idPlan = idPlan;
	}

	public String getNumArchive() {
		return numArchive;
	}

	public void setNumArchive(String numArchive) {
		this.numArchive = numArchive;
	}

	public Architecte getArchitecte() {
		return architecte;
	}

	public void setArchitecte(Architecte architecte) {
		this.architecte = architecte;
	}

}
