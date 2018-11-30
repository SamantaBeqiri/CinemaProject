package Projekt;

import java.util.ArrayList;
import java.util.Set;

public class Monitor {
	private ArrayList<Film> film;
	ArrayList<Karrike>karrike;
	int id;
	boolean kaFilm;
	public Monitor() {
		super();

	}
	public Monitor(ArrayList<Film> film, ArrayList<Karrike> karrike, int id,boolean kaFilm) {
		
		this.film = film;
		this.karrike = karrike;
		this.id = id;
		this.kaFilm=kaFilm;
	}
	public ArrayList <Film> getFilm() {
		return film;
	}
	public void setFilm(ArrayList <Film> film) {
		this.film = film;
	}
	public ArrayList<Karrike> getKarrike() {
		return karrike;
	}
	public void setKarrike(ArrayList<Karrike> karrike) {
		this.karrike = karrike;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean KaFilm() {
		return kaFilm;
	}
	public void setKaFilm(boolean kaFilm) {
		this.kaFilm = kaFilm;
	}
	

	
	

}
