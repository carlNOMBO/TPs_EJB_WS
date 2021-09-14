package data;

public class Contact {
	
private int idcontact;
private String nom;
private String prenom;
public Contact(int idcontact, String nom, String prenom) {
	super();
	this.idcontact = idcontact;
	this.nom = nom;
	this.prenom = prenom;
}
public int getIdcontact() {
	return idcontact;
}
public void setIdcontact(int idcontact) {
	this.idcontact = idcontact;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public Contact() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Contact [idcontact=" + idcontact + ", nom=" + nom + ", prenom=" + prenom + "]";
}


}
