package zoo;
import static org.junit.Assert.*;

import zoo.Animal;
import zoo.CompareSecteur;
import zoo.Secteur;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class TestCompareSecteur {
	
	@Test
	public void TestCompare() {
		List<Secteur> listTrieSecteur =new ArrayList<Secteur>();
		Secteur s1 = new Secteur("Chat");
		Secteur s2 = new Secteur("Chien");

		
		
		

			Animal a1 = new Animal();
			Animal a2 = new Animal();
			Animal a3 = new Animal();
			Animal a4 = new Animal();
			Animal a5= new Animal();
			
			
			s1.ajouterAnimal(a1);
			s1.ajouterAnimal(a2);
			s1.ajouterAnimal(a3);
			s2.ajouterAnimal(a4);
			s2.ajouterAnimal(a5);
			
			
			
			
			listTrieSecteur.add(s1);
			listTrieSecteur.add(s2);

	        Collections.sort(listTrieSecteur, new CompareSecteur());
	}

}
