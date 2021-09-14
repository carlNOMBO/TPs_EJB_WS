package metier;

import java.util.List;

import javax.ejb.Remote;

import entites.Construction;

@Remote
public interface IGestionConstruction {
	public void ajouter(Construction construction);
	public Construction lister(int id);
	public List<Construction> listerTout();
}
