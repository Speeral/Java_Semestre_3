
public class Segment {
	private Point p1;
	private Point p2;
	
	public Segment() {
		this.p1= new Point();
		this.p2=new Point();
	}
	
	public Segment(Point p1, Point p2) {
		Point sp1 = new Point (p1);
		Point sp2 = new Point (p2);
		this.p1=sp1;
		this.p2=sp2;
	}
	
	public Segment(Segment S) {
		Segment Sp = new Segment(S);
		this.p1=Sp.getP1();
		this.p2=Sp.getP2();
	}
	
	public Segment (int x1, int y1, int x2, int y2) {
		this.p1=new Point(x1,y1);
		this.p2=new Point(x2,y2);
	}

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}
	
	public Segment copy(Segment S) {
		return new Segment(this);
	}
	public String afficheSegment() {
		int x1 = this.getP1().getX();
		int y1 = this.getP1().getY();
		int x2 = this.getP2().getX();
		int y2 = this.getP2().getY();
		return "[ ("+x1+","+y1+") ]"+"[ ("+x2+","+y2+") ]";
	}
	
	
}
