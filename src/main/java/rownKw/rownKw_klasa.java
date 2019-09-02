package rownKw;

public class rownKw_klasa {

	public static void main(String[] args) {
				
		wspolczynniki wsp = new wspolczynniki(args[0], args[1], args[2]);
		wynik rezultat = new wynik(wsp);
		
		drukowanie (wsp, rezultat);
			
	}
	
	public static void drukowanie(wspolczynniki wspol, wynik xx) {
		
		System.out.println("Rownanie: " + wspol.a  + "x^2 + " + wspol.b + "x + " + wspol.c + " = 0");
		System.out.printf("x1 = %.2f%n", xx.x1);
		System.out.printf("x2 = %.2f%n", xx.x2);

	}
}
