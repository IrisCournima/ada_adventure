/**
 * 
 */
package lesson1;


import javax.swing.plaf.synth.SynthSplitPaneUI;

import org.newdawn.slick.*;
import org.newdawn.slick.tiled.TiledMap;
/**
 * @author Irwen
 *
 */
public class WindowGame extends BasicGame {

	private GameContainer container;
	private TiledMap map;

	
	private int nbBadges;
	private float x = 310; 
	private float y = 310;

	private float xCamera = x, yCamera = y;
	private int direction = 0;
	private boolean moving = false;
	private Animation[] animations = new Animation[8];
	/**
	 * @param title
	 */
	public WindowGame(String title) {
		super("Niveau 1 :Labyrinthe");
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.newdawn.slick.Game#render(org.newdawn.slick.GameContainer, org.newdawn.slick.Graphics)
	 */
	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		g.translate(container.getWidth() / 2 - (int) xCamera, container.getHeight() / 2
				- (int) yCamera);
	
	    this.map.render(0, 0);
	    //ombre personnage : couleur puis emplacement
	    g.setColor(new Color(0, 0, 0, .5f));
		g.fillOval(x - 305, y -150, 32, 16);
	    g.drawAnimation(animations[direction + (moving ? 4 : 0)], x-300, y-200);
	}

	/* (non-Javadoc)
	 * @see org.newdawn.slick.BasicGame#init(org.newdawn.slick.GameContainer)
	 */
	@Override
	public void init(GameContainer container) throws SlickException {
	    this.container = container;
	    this.map = new TiledMap("map/labyrinthe1.tmx");
	    SpriteSheet spriteSheet = new SpriteSheet("map/princess.png", 64, 64);
	    this.animations[0] = loadAnimation(spriteSheet, 0, 1, 0);
	    this.animations[1] = loadAnimation(spriteSheet, 0, 1, 1);
	    this.animations[2] = loadAnimation(spriteSheet, 0, 1, 2);
	    this.animations[3] = loadAnimation(spriteSheet, 0, 1, 3);
	    this.animations[4] = loadAnimation(spriteSheet, 1, 9, 0);
	    this.animations[5] = loadAnimation(spriteSheet, 1, 9, 1);
	    this.animations[6] = loadAnimation(spriteSheet, 1, 9, 2);
	    this.animations[7] = loadAnimation(spriteSheet, 1, 9, 3);
	}

	private Animation loadAnimation(SpriteSheet spriteSheet, int startX, int endX, int y) {
		Animation animation = new Animation();
		for (int x = startX; x < endX; x++) {
			animation.addFrame(spriteSheet.getSprite(x, y), 100);
		}
		return animation;
	}

/**
 * Quand on relâchera une de ces touches on arrêtera 
 * le déplacement en repassant le booléen à faux
 * **/	
	@Override
	public void keyReleased(int key, char c) {
		this.moving = false;
		if (Input.KEY_ESCAPE == key) {
			this.container.exit();
		}
	}

	
	/**Directions personnage**/
	@Override
	public void keyPressed(int key, char c) {
	    switch (key) {
	        case Input.KEY_UP:    this.direction = 0; this.moving = true; break;
	        case Input.KEY_LEFT:  this.direction = 1; this.moving = true; break;
	        case Input.KEY_DOWN:  this.direction = 2; this.moving = true; break;
	        case Input.KEY_RIGHT: this.direction = 3; this.moving = true; break;
	    }
	}
	

	/* (non-Javadoc)
	 * @see org.newdawn.slick.BasicGame#update(org.newdawn.slick.GameContainer, int)
	 */
	@Override
	public void update(GameContainer container, int delta) throws SlickException {
		updateCharacter(delta);
		updateCamera(container);
	}
	
	private void updateCamera(GameContainer container) {
		//suivre personnage au 1/4 de l'ecran
		int w = container.getWidth() / 4;
		if (this.x > this.xCamera + w) {
			this.xCamera = this.x - w;
		} else if (this.x < this.xCamera - w) {
			this.xCamera = this.x + w;
		}
		int h = container.getHeight() / 4;
		if (this.y > this.yCamera + h) {
			this.yCamera = this.y - h;
		} else if (this.y < this.yCamera - h) {
			this.yCamera = this.y + h;
		}
	}

	private void updateCharacter(int delta) {
		if (this.moving) {
			switch (this.direction) {
			case 0:
				this.y -= .1f * delta;
				break;
			case 1:
				this.x -= .1f * delta;
				break;
			case 2:
				this.y += .1f * delta;
				break;
			case 3:
				this.x += .1f * delta;
				break;
			}
		}
	}

	/**
	 * @param args
	 * @throws SlickException 
	 */
	public static void main(String[] args) throws SlickException {
		//System.out.println("tetetet");
		new AppGameContainer(new WindowGame("test"), 640, 480, false).start();

	}
	
	
}
