import java.util.ArrayList;

public class Enveloppe {
	private ArrayList <Feuille> feuilles = new ArrayList();
	private boolean ouverte;
	
	public void ouvrir() {
		setOuverte(true);
	}
	public void fermer() {
		setOuverte(false);
	}
	public ArrayList<Feuille> getFeuilles() {
		return feuilles;
	}
	public void setFeuilles(ArrayList<Feuille> feuilles) {
		this.feuilles = feuilles;
	}
	public boolean isOuverte() {
		return ouverte;
	}
	public void setOuverte(boolean ouverte) {
		this.ouverte = ouverte;
	}
	public void ajouterfeuille(Feuille f) {
		feuilles.add(f);
	}
	public void lire() {
		if(ouverte==false) {
			ouvrir();
		}else {
			for(int i = 0; i<feuilles.size();i++) {
				feuilles.get(i).toString();
				feuilles.get(i).retourner();
				feuilles.get(i).toString();
			}
		}
	}
}
