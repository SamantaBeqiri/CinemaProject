package Projekt;
import java.util.*;

public class Administrator extends Perdorues {
private ArrayList<Salla>salla;

	public ArrayList<Salla> getSalla() {
	return salla;
}

public void setSalla(ArrayList<Salla> salla) {
	this.salla = salla;
}

	public Administrator() {
		super();
	

	}

	public Administrator(String emer, String email, String pasword,ArrayList<Salla> salla) {
		super(emer, email, pasword);
		this.salla=salla;
		
	}
	
	
	}

	

	
	

