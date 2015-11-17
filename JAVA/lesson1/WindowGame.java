/**
 * 
 */
package lesson1;


import org.newdawn.slick.*;

import niveaux.Arena;
import personnages.Personnage;
/**
 * @author Irwen
 *
 */
public class WindowGame extends BasicGame {

	/**
	 * @param title
	 */
	public WindowGame(String title) {
		super("Lesson 1 :: WindowGame");
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.newdawn.slick.Game#render(org.newdawn.slick.GameContainer, org.newdawn.slick.Graphics)
	 */
	@Override
	public void render(GameContainer arg0, Graphics arg1) throws SlickException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.newdawn.slick.BasicGame#init(org.newdawn.slick.GameContainer)
	 */
	@Override
	public void init(GameContainer arg0) throws SlickException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.newdawn.slick.BasicGame#update(org.newdawn.slick.GameContainer, int)
	 */
	@Override
	public void update(GameContainer arg0, int arg1) throws SlickException {
		// TODO Auto-generated method stub

	}

	String[] questions = {"Java est un langage", " Java est un langage d´evelopp´e par",
		"La liaison tardive est essentielle pour assurer",	"Pourquoi JAVA?"};
	
	String[][] answers = {
			{
				"(a) Compil´e",
				"(b) Interpr´et´e",
				"(c) Compil´e et interpr´et´e",
				"(d) Ni compil´e ni interpr´et´e"},
			{
				"(a) Hewlett-Packard",
				"(b) Sun Microsystems",
				"(c) Microsoft",
				"(d) Oracle"
			},
			{
				"(a) l’encapsulation",
				"(b) le polymorphisme",
				"(c) l’h´eritage",
				"(d) la marginalisation",
			},
			{
				"JAVA : Junior à vous l'avenir ;)"
			}};
	
	Arena arene = new Arena(questions, answers);
	Personnage boss = new Personnage("Boss", "Simplon");
	
	
	
	
	
	
	
	
	/**
	 * @param args
	 * @throws SlickException 
	 */
	public static void main(String[] args) throws SlickException {
		new AppGameContainer(new WindowGame("test"), 640, 480, false).start();

	}

}
