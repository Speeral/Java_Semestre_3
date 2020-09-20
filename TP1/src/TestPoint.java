
public class TestPoint {
    
    public static void main(String[]args) {
		(new TestPoint()).run();
	}
    public void run () {
    	
    	Point origine = new Point();
    	if(origine.getX()==0) {
    		System.out.println("Test origine.getX() [ok]");
    		
    	}else {
    		System.out.println("error");
    	}
		if(origine.getY()==0) {
			System.out.println("test origine.getY() [ok]");
			
		}else {
			System.out.println("error");
		}
		Point newPoint = new Point(3,2);
		 if (newPoint.getX()==3) {
			 System.out.println("OK");
		 }
		 else {
			 System.out.println("error");
		 }
		 if (newPoint.getY()==2) {
			 System.out.println("OK");
		 }else {
			 System.out.println("error");
		 }
		Point copie= newPoint.copy();
		if (copie.getX()==newPoint.getX()) {
			System.out.println("ok");
		}else {
			System.out.println("error");
		}
		origine.setX(4);
		if (origine.getX()==4) {
			System.out.println("ok");
			
		}else {
			System.out.println("error");
		}
		origine.setY(7);
		if (origine.getY()==7) {
			System.out.println("ok");
		}else {
			System.out.println("error");
		}
		
    }
    
	
}
