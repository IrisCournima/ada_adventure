package personnages;

public class Personnage {

	private String name;
	private String surname;
	private int vies;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getVies() {
		return vies;
	}
	public void setVies(int vies) {
		this.vies = vies;
	}
	public Personnage(String name, String surname, int vies) {
		super();
		this.name = name;
		this.surname = surname;
		this.vies = vies;
	}

	

}
