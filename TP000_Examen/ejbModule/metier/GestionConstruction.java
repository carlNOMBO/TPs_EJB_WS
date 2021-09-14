package metier;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entites.Construction;

@Stateless
public class GestionConstruction implements IGestionConstruction{
	@PersistenceContext(unitName="Construction")
	EntityManager em;
	
	
	@Override
	public void ajouter(Construction construction) {
		// TODO Auto-generated method stub
		em.persist(construction);
	}
	@Override
	public Construction lister(int id) {
		// TODO Auto-generated method stub
		Query requete = em.createQuery("SELECT const FROM Construction const WHERE const.idConstruction = "+id);
		return (Construction)requete.getSingleResult();
	}
	@Override
	public List<Construction> listerTout() {
		// TODO Auto-generated method stub
		Query requete = em.createQuery("SELECT const FROM Construction const");
		return requete.getResultList();
	}
}
