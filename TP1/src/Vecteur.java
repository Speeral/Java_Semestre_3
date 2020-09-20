import java.text.DecimalFormat;
public class Vecteur {
	private String nom;
	private Point p ;
	
	public Vecteur(String nom, Point p) {
		super();
		this.nom = nom;
		this.p = p;
	}
	
	public void afficher() {
		int x = this.p.getX();
		int y = this.p.getY();
		System.out.println(this.nom + "=("+x+";"+y+") ");
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Point getP() {
		return p;
	}
	public void setP(Point p) {
		this.p = p;
	}
	public void additionVecteurs(Vecteur other) {
		Point P = new Point (other.getP().getX(),other.getP().getY());
		int x  = P.getX()+this.p.getX();
		int y = P.getY()+this.p.getX();
		System.out.println(this.getNom()+"("+this.p.getX()+";"+this.p.getY()+ ")+"+other.getNom()+"("+other.getP().getX()+";"+other.getP().getY() +") = w("+x+";"+y+")");
	}
	public void multiplierParScalaire(int X) {
		int x = this.p.getX() * X;
		int y = this.p.getY() * X;
		System.out.println(this.getNom()+"("+this.p.getX()+";"+this.p.getY()+") * "+X+" = "+this.getNom()+"("+x+";"+y+")");
	}
	public void norme() {
		
		double norme = Math.sqrt(Math.pow((double)(this.p.getX()), 2)+Math.pow((double)this.p.getY(), 2));
		System.out.println(this.getNom()+"("+this.p.getX()+";"+this.p.getY()+")\n||"+this.getNom()+"|| = "+norme);
	}
	public void normeVecteur2Points(Point other) {
		double normeVecteur2Points = Math.sqrt(Math.pow((double)(other.getX()-this.p.getX()), 2)+Math.pow((double)other.getY()-this.p.getY(), 2));
		System.out.println("A("+this.p.getX()+";"+this.p.getY()+") B("+other.getX()+";"+other.getY()+")\n ||AB|| = "+normeVecteur2Points);
	}
	public void colinear(Vecteur other) {
		
		Point P=new Point (other.getP().getX(),other.getP().getY());
		if (this.p.getX()*P.getY()-this.p.getY()*P.getX() == 0) {
			System.out.println("Les vecteur "+this.getNom()+"("+this.p.getX()+";"+this.p.getY()+ ") et "+other.getNom()+"("+other.getP().getX()+";"+other.getP().getY() +")"+" sont colineaires");
		}else {
			System.out.println("Les vecteur "+this.getNom()+" et "+other.getNom()+" ne sont pas colineaires");			
		}
	}
	
	public void rotation(double angle) {
		double x = this.p.getX()*Math.cos(angle)-this.p.getY()*Math.sin(angle);
		double y = this.p.getX()*Math.sin(angle)+this.p.getY()*Math.cos(angle);
		
		System.out.println("Le vecteur "+this.getNom()+"("+this.p.getX()+";"+this.p.getY()+ "), avec une rotation de "+(int)angle+"°"+" a pour coordonnée : ("+x+";"+y+")");
	}
}
