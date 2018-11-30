package Projekt;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Tester {

	public static void main(String[] args) {
		
		Set <Monitor> monitor=new HashSet <Monitor>();
		Kinema kinema=new Kinema();
		
		ArrayList<Film>film=kinema.getFilm();
	
		
		
	kinema.shtoFilm();
		System.out.println("Filmi i dyte");
	kinema.shtoFilm();
		
		
		
		
		
for(Film f:film ) {
			System.out.println(f.getTitull());
		}
		System.out.println(film.size());       
		
kinema.fshiFilm();
System.out.println(film); 
		
	}


}
