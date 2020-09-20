
public class Point {

	private int x;
	private int y;
	private static int NbPoint =0;
	
	public Point() {
		NbPoint++;
		this.y=0;
		this.x=0;
	}
	public Point (int x, int y) {
		NbPoint++;
		this.x=x;
		this.y=y;
	}
	public Point (Point p) {
		NbPoint++;
		this.x=p.getX();	//this.x=p.x;
		this.y=p.getY();
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public Point copy() {
		return new Point(this);
	}
	
	public Point translate (Point i) {
		this.x=this.x+i.x;
		this.y=this.x+i.y;
		return new Point(this.x,this.y);
	}
	public Point translate (int i, int j) {
		this.x=this.x+i;
		this.y=this.x+j;
		return new Point(this.x,this.y);
	}
	
	public void SymetrieHorizontale() {
		this.y=-this.y;
	}
	public void SymetrieVerticale() {
		this.x=-this.x;
	}

	public boolean Confondu(Point p) {
		boolean bool = false;
		if (this.x == p.x && this.y==p.y) {
			bool = true;
		}
		return bool;
	}
	
	public double distance (Point p) {
		double dist = ((this.x-p.x)+(this.y-p.y))*0.5;
		return dist;
	}
	
	public void normeVecteur2Points(Point other) {
		double normeVecteur2Points = Math.sqrt(Math.pow((double)(other.getX()-this.getX()), 2)+Math.pow((double)other.getY()-this.getY(), 2));
		System.out.println("A("+this.getX()+";"+this.getY()+") B("+other.getX()+";"+other.getY()+")\n ||AB|| = "+normeVecteur2Points);
	}
}
