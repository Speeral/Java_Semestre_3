
public class Fraction {
	private int denominateur;
	private int numerateur;

	public static int pgcd(int a, int b) {
		int c;
		while (b != 0) {
			c = a % b;
			a = b;
			b = c;
		}
		return a;
	}

	public Fraction(int num, int den) {
		if (den != 0) {
			this.numerateur = num;
			this.denominateur = den;
		}
	}

	public int getNumerateur() {
		return numerateur;
	}

	public int getDenominateur() {
		return denominateur;
	}

	public void setDenominateur(int denominateur) {

		if (denominateur != 0) {
			this.denominateur = denominateur;
		}
	}

	public void setNumerateur(int numerateur) {
		this.numerateur = numerateur;
	}

	public boolean egaleA(Fraction f) {
		return numerateur * f.getDenominateur() == f.getNumerateur() * denominateur;
	}

	public Fraction ajoute(Fraction f) {
		if (f.denominateur == this.denominateur) {
			this.numerateur = this.numerateur + f.numerateur;
		} else {
			this.numerateur = this.numerateur * f.denominateur;
			f.numerateur = f.numerateur * this.denominateur;
			this.numerateur = this.numerateur + f.numerateur;
			this.denominateur = this.denominateur * f.denominateur;
		}
		this.reduire();
		return new Fraction(this.numerateur, this.denominateur);
	}

	public Fraction soustrait(Fraction f) {
		if (f.denominateur == this.denominateur) {
			this.numerateur = this.numerateur - f.numerateur;
		} else {
			this.numerateur = this.numerateur * f.denominateur;
			f.numerateur = f.numerateur * this.denominateur;
			this.numerateur = this.numerateur - f.numerateur;
			this.denominateur = this.denominateur * f.denominateur;
		}
		this.reduire();
		return new Fraction(this.numerateur, this.denominateur);
	}

	public Fraction multiplier(Fraction f) {
		this.numerateur = this.numerateur * f.numerateur;
		this.denominateur = this.denominateur * f.denominateur;
		this.reduire();
		return new Fraction(this.numerateur, this.denominateur);
	}

	public Fraction diviser(Fraction f) {
		this.numerateur = this.numerateur * f.denominateur;
		this.denominateur = this.denominateur * f.numerateur;
		this.reduire();
		return new Fraction(this.numerateur, this.denominateur);
	}

	public void reduire() {
		int pgcd = pgcd(this.numerateur, this.denominateur);
		this.numerateur = this.numerateur / pgcd;
		this.denominateur = this.denominateur / pgcd;
		if (this.denominateur < 0) {
			this.numerateur *= (-1);
			this.denominateur *= (-1);
		}
	}

	public void multiplierParCoeff(int x) {
		this.numerateur = this.numerateur * x;
	}

	public void inverse() {
		int x = this.numerateur;
		if (this.numerateur != 0) {
			this.numerateur = this.denominateur;
			this.denominateur = x;
		}
	}
}
