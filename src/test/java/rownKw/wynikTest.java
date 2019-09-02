package rownKw;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class wynikTest {
	
	@Test
	public void testWynik() {
		
		wspolczynniki wq = new wspolczynniki("5","15","10");
		wynik t = new wynik(wq);
		

		try {
				assertEquals(-2, t.x1, 0.0001);
				assertEquals(-1, t.x2, 0.0001);
			} 
		catch (AssertionError e) {
			fail("Rozwiazanie rownania nie jest poprawne.");                                     
			}
		}	
	
	@Test
	public void testWynik1() {

		wspolczynniki wq1 = new wspolczynniki("-10","0","8");
		wynik t1 = new wynik(wq1);
		
		try {

				assertEquals(0.89, t1.x1, 0.01);

				assertEquals(-0.89, t1.x2, 0.01);

			} 

		catch (AssertionError e) {

			fail("Rozwiazanie rownania nie jest poprawne.");                                     

			}

		}
		
	}
