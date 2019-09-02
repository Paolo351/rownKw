package rownKw;

public class wynik {
	
	double x1, x2;

	public wynik(wspolczynniki t) {
		
		
		float delta = t.b*t.b - 4*t.a*t.c;
		this.x1 = (-t.b - Math.sqrt(delta))/(2*t.a);
		this.x2 = (-t.b + Math.sqrt(delta))/(2*t.a);
		
		
		
	}
}
