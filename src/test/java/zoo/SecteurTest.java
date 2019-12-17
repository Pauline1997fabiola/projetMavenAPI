package zoo;
import java.util.ArrayList;

import org.junit.Test;

import zoo.Chien;
import zoo.Zoo;

public class SecteurTest{
	@Test
	public void Test(){
		Chien Animal1 = new Chien();
		Zoo NewZoo = new Zoo();
		int i=1;
		while(i!= NewZoo.secteursAnimaux.size()){
			if(Animal1.typeAnimal.equals(NewZoo.secteursAnimaux.get(i).typeAnimauxDansSecteur)) {// equals pour comparer les strings
				NewZoo.secteursAnimaux.get(i).animauxDansSecteur.add(Animal1);
			}
			i++;
		}
	}
}
