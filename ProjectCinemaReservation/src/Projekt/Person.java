package Projekt;

public class Person {
	private String emri;
	private int mosha;
	public Person() {
		super();
	}
	public Person(String emri, int mosha) {
		
		this.emri = emri;
		this.mosha = mosha;
	}
	public String getEmri() {
		return emri;
	}
	public void setEmri(String emri) {
		this.emri = emri;
	}
	public int getMosha() {
		return mosha;
	}
	public void setMosha(int mosha) {
		this.mosha = mosha;
	}
	

}
