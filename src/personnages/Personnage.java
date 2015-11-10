package personnages;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;

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
	public void init(GameContainer container) throws SlickException {
		// TODO Auto-generated method stub
		
	}

	

}
