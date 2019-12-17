package zoo;
import java.util.ArrayList;

public class Zoo {

	int visiteurs;
	String typeSecteur;
	ArrayList<Secteur> secteursAnimaux = new ArrayList<Secteur>();

	public void ajouterSecteur(String typeSecteur) {
		Secteur NouveauSecteur = new Secteur(typeSecteur);
		secteursAnimaux.add(NouveauSecteur);
	}

	public void nouveauVisiteur() throws LimiteVisiteurException {
		if (visiteurs < getLimiteVisiteur())
			visiteurs += 1;
		else {
			throw new LimiteVisiteurException("Nombre de visiteurs atteint");
		}
	}

	public int getLimiteVisiteur() {
		int NbSecteur = secteursAnimaux.size();
		return NbSecteur * 15;
	}

	public void nouvelAnimal(Animal NewAnimal) throws AnimalDansMauvaisSecteurException{
	
			int i=1;
			boolean ajout= false;
			while(i!=secteursAnimaux.size()){
				if(NewAnimal.typeAnimal.equals(secteursAnimaux.get(i).typeAnimauxDansSecteur)){// equals pour comparer les strings
					secteursAnimaux.get(i).animauxDansSecteur.add(NewAnimal);
					ajout = true;
				}
				i++;
			}
			if(ajout == false)
				throw new AnimalDansMauvaisSecteurException("Animal dans mauvais secteur"); 

			

	}

	public int nombreAnimaux() {
		int nbAnimaux = 0;
		int i = 1;
		while (i != secteursAnimaux.size()) {
			nbAnimaux = nbAnimaux + secteursAnimaux.get(i).animauxDansSecteur.size();
			i++;
		}
		return nbAnimaux;
	}
}
