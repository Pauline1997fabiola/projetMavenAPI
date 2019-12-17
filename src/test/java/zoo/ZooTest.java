package zoo;
import static org.junit.Assert.*;

import org.junit.Test;

import zoo.Zoo;

public class ZooTest {

	@Test
	public void testNouveauVisiteur() throws  MaximumVisiteurException{
		Zoo nb = new Zoo();
		if(nb.visiteurs > nb.getLimiteVisiteur()) {
			throw new MaximumVisiteurException("Le nombre maximum de visiteur a été dépassé.");
		}
		
	}

}
