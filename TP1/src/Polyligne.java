import java.util.ArrayList;

public class Polyligne {
	private ArrayList <Point> Point = new ArrayList();
	
	public Polyligne(ArrayList<Point> point) {
		super();
		Point = point;
	}
	public int NbDePoints() {
		int nb = Point.size();
		return nb;
	}
	public void translate (Vecteur v) {
		Point.add(v.getP());
	}
	public boolean testPolygone() {
		boolean bool = false;
		if (Point.get(0)==Point.get(Point.size()-1)) {
			bool=true;
		}
		return bool;
	}
	public int taillePolyligne() {
		int taille = Point.size();
		return taille;
	}
}
