package Projekt;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class Salla {
	
private ArrayList<Monitor>monitor;
private int numriSalles;
private Administrator administrator;

public Salla() {
	super();
	
}

public Salla(ArrayList<Monitor> monitor) {

	this.monitor = monitor;
}

public void konfiguroKarrikeMonitor() {
	Scanner in=new Scanner(System.in);
	System.out.println("Jepni numrin e monitoreve");
	int nrMonitor=in.nextInt();
	System.out.println("Jepni numrin e karrikeve");
	int nrKarrike=in.nextInt();
	int karrikePerRresht=nrKarrike/nrMonitor;
	for(int i=0;i<nrMonitor;i++) {
		monitor.get(i).setId(i+1);
		for(int j=0;j<nrKarrike;j++) {
			monitor.get(i).getKarrike().get(j).setNumerKarrike(j+1);
		}
	}
	
}

public ArrayList<Monitor> getMonitor() {
	return monitor;
}

public void setMonitor(ArrayList<Monitor> monitor) {
	this.monitor = monitor;
}


}
