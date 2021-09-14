package entites;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Ecole extends Construction{

	private int nbreSalle;
	public Ecole() {
		// TODO Auto-generated constructor stub
		super();
	}
	public Ecole(int nbreSalle, double superficie, Plan plan, List<Intervenant> interv) {
		super(superficie, plan, interv);
		this.nbreSalle = nbreSalle;
	}
	public int getNbreSalle() {
		return nbreSalle;
	}
	public void setNbreSalle(int nbreSalle) {
		this.nbreSalle = nbreSalle;
	}

}
