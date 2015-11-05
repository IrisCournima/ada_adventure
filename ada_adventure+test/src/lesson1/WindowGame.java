/**
 * 
 */
package lesson1;


import org.newdawn.slick.*;
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

	/**
	 * @param args
	 * @throws SlickException 
	 */
	public static void main(String[] args) throws SlickException {
		new AppGameContainer(new WindowGame("test"), 640, 480, false).start();

	}

}
