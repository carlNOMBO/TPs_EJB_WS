package entites;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Construction implements Serializable {

	@Id
	@GeneratedValue
	private int idConstruction;
	private double superficie;
	
	@OneToOne(cascade={CascadeType.PERSIST, CascadeType.REFRESH})
	private Plan plan;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable (name="participe" , joinColumns= @JoinColumn(name="idConstruction", referencedColumnName="idConstruction" ),
	inverseJoinColumns = @JoinColumn(name="idIntervenant", referencedColumnName="idIntervenant"))
	private List<Intervenant> interv = new LinkedList<Intervenant>();
	
	public Construction() {
		// TODO Auto-generated constructor stub
	}

	public Construction(double superficie, Plan plan, List<Intervenant> interv) {
		super();		
		this.superficie = superficie;
		this.plan = plan;
		this.interv = interv;
	}

	public int getIdConstruction() {
		return idConstruction;
	}

	public void setIdConstruction(int idConstruction) {
		this.idConstruction = idConstruction;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public List<Intervenant> getInterv() {
		return interv;
	}

	public void setInterv(List<Intervenant> interv) {
		this.interv = interv;
	}
	
}
