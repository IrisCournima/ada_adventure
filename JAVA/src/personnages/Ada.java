package personnages;

import org.newdawn.slick.Animation;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

public class Ada extends Personnage{
	private int nbBadges;
	private float posX; 
	private float posY;
	private int direction = 0;
	private boolean moving = false;
	private Animation[] animations = new Animation[8];
			
			
	public Ada(java.lang.String name, java.lang.String surname, int vies) {
		super(name, surname, vies);
		// TODO Auto-generated constructor stub
	}

	
	public Ada(String name, String surname, int vies, int badges) {
		super(name, surname, vies);
		this.nbBadges = badges;
		
	}

	@Override
	public void init(GameContainer container) throws SlickException {
	    SpriteSheet spriteSheet = new SpriteSheet("map/princess.png", 64, 64);
	}
	
}
