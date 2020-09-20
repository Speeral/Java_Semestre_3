
public class Feuille {
	private String recto;
	private String verso;
	private boolean visible;
	
	public Feuille(String recto, boolean visible) {
		super();
		this.recto = recto;
		this.visible = visible;
	}

	@Override
	public String toString() {
		return "Feuille [recto=" + recto + ", visible=" + visible + "]";
	}
	
	public void retourner() {
		visible = !visible;
	}
	
	
}
