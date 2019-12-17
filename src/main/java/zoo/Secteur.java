package zoo;
import java.util.ArrayList;

public class Secteur {

	String typeAnimauxDansSecteur;
	ArrayList<Animal> animauxDansSecteur = new ArrayList<Animal>();

	public Secteur(String typeAnimauxDansSecteur){
		this.typeAnimauxDansSecteur = typeAnimauxDansSecteur;
	}
	
	public void ajouterAnimal(Animal NewAnimal){
		animauxDansSecteur.add(NewAnimal);
	}
	
	public int getNombreAnimaux(){
		return animauxDansSecteur.size();
	}
	
	public String obtenirType(){
		return this.typeAnimauxDansSecteur;
	}
}
