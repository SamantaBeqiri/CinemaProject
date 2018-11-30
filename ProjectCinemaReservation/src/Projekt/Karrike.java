package Projekt;

public class Karrike {
	boolean gjendje;
	int numerKarrike;
	
	public Karrike() {
		super();
		
	}

	public Karrike(boolean gjendje, int numerKarrike) {
		
		this.gjendje = gjendje;
		this.numerKarrike = numerKarrike;
	}

	public boolean isGjendje() {
		return gjendje;
	}

	public void setGjendje(boolean gjendje) {
		this.gjendje = gjendje;
	}

	public int getNumerKarrike() {
		return numerKarrike;
	}

	public void setNumerKarrike(int numerKarrike) {
		this.numerKarrike = numerKarrike;
	}
	
	

}
