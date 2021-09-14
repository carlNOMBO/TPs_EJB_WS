package entites;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Hopital extends Construction{

	private String Categorie;
	public Hopital() {
		// TODO Auto-generated constructor stub
		super();
	}
	public Hopital(String categorie, double superficie, Plan plan, List<Intervenant> interv) {
		super(superficie, plan, interv);
		Categorie = categorie;
	}
	public String getCategorie() {
		return Categorie;
	}
	public void setCategorie(String categorie) {
		Categorie = categorie;
	}
	
}
