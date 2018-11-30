package Projekt;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Kinema {
	private ArrayList<Film> film;
	private ArrayList<Administrator>administrator;
	private ArrayList<Salla>salla;

	public Kinema() {
		super();
		film=new ArrayList<Film>();

	}

	public Kinema(ArrayList <Film> film) {

		this.film = film;
	}

	public void   shtoFilm() {
		Scanner in = new Scanner(System.in);
		Film filmIShtuar =null;
		System.out.println("Jepni titullin e filmit");
		String titulli = in.next();
		System.out.println("Jepni kategorine e filmit");
		String kategori = in.next();
		System.out.println("Jepni kohezgjatjen e filmit");
		int kohezgjatja = in.nextInt();
		System.out.println("Ne cfare gjuhe do te trasmetohet filmi");
		String gjuha=in.next();
		boolean filmINjejte=false;
		for(int i=0;i<film.size();i++) {
			if(film.get(i).getTitull().equals(titulli)&&film.get(i).getKategori().equals(kategori)&&film.get(i).getKohezgjatja()==kohezgjatja&&film.get(i).getGjuha().equals(gjuha)) {
				filmINjejte=true;
				break;
			}
		}
		if(!filmINjejte) {
		 filmIShtuar = new Film(titulli, kategori, kohezgjatja,gjuha);
		System.out.println(filmIShtuar.getTitull());
		System.out.println("Perfundoi");
		film.add(filmIShtuar);
		
		}
		
	}
	public void fshiFilm() {
		System.out.println("Jepni titullin e filmit qe doni te hiqni");
		Scanner in = new Scanner(System.in);
		String titulli=in.next();
		for(Film f:film ) {
			if(f.getTitull().equals(titulli)) {
				System.out.println(true);
				film.remove(f);
				break;
			}
			else {
				System.out.println("Filmi nuk gjendet");
			}
		}
		
		
	}
	
	
	
	public ArrayList<Film> getFilm() {
		return film;
	}

	public void setFilm(ArrayList<Film> film) {
		this.film = film;
	}

}
