
public class TestVecteur {
	public static void main(String[] args) {
		Point p = new Point(2,3);
		Vecteur u= new Vecteur("u",p);
		
		
		Point q = new Point (4,6);
		Vecteur v = new Vecteur("v",q);
		//u.afficher();
		//u.additionVecteurs(v));
		//u.multiplierParScalaire(3);
		//u.norme();
		//p.normeVecteur2Points(q);
		//u.colinear(v);
		u.rotation(2);
	}
}
