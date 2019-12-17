package zoo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CompareSecteur implements Comparator<Secteur> {

	//List<Secteur> ListTrieSecteur =new ArrayList<Secteur>();
	Secteur s1 = new Secteur("Chat");
	Secteur s2 = new Secteur("Chien");
	private static final Logger logger = LogManager.getLogger ( CompareSecteur.class ) ;

	
	
	
	public int compare(Secteur s1, Secteur s2) {
		Animal ani = new Animal();
		logger.info (" Nouvel animal : " +
				ani.getClass().toString () ) ;
		logger.trace (" trace message" ) ;
		logger.debug (" debug message" ) ;
		logger.error (" error message" ) ;
		logger.fatal (" fatal message" ) ;
		logger.warn (" warn message" ) ;

		/*Animal a1 = new Animal();
		Animal a2 = new Animal();
		Animal a3 = new Animal();
		Animal a4 = new Animal();
		Animal a5= new Animal();
		
		
		s1.ajouterAnimal(a1);
		s1.ajouterAnimal(a2);
		s1.ajouterAnimal(a3);
		s2.ajouterAnimal(a4);
		s2.ajouterAnimal(a5);
		
		
		
		
		ListTrieSecteur.add(s1);
		ListTrieSecteur.add(s2);*/
		return s1.getNombreAnimaux() -s2.getNombreAnimaux();
		
	}
}
