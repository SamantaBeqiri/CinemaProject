package Projekt;

import java.time.LocalDate;

public class Film {
	private String titull;
	private String kategori;
	private int kohezgjatja;
	private String gjuha;
	public Film() {
		super();
		
	}
	public Film(String titull, String kategori, int kohezgjatja,String gjuha) {
		
		this.titull = titull;
		this.kategori = kategori;
		this.kohezgjatja=kohezgjatja;
		this.gjuha=gjuha;
	}
	public String getTitull() {
		return titull;
	}
	public void setTitull(String titull) {
		this.titull = titull;
	}
	public String getKategori() {
		return kategori;
	}
	public void setKategori(String kategori) {
		this.kategori = kategori;
	}
	public int getKohezgjatja() {
		return kohezgjatja;
	}
	public void setKohezgjatja(int kohezgjatja) {
		this.kohezgjatja = kohezgjatja;
	}
	public String getGjuha() {
		return gjuha;
	}
	public void setGjuha(String gjuha) {
		this.gjuha = gjuha;
	}

	
	
	

}
