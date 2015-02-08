import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;


public class Apple {
	private Random randGenerator;
	private Box appleBox;
	
	public Apple() {
		appleBox = createApple(Game.snake);
	}
	
	private Box createApple(Snake s){
		randGenerator = new Random();
		
		int x = randGenerator.nextInt(Game.COLS);
		int y = randGenerator.nextInt(Game.ROWS);
		
		Box b = new Box(x, y);
		
		if (s.body.contains(b)) {
			return createApple(s);
		}
		
		return b;	
	}
	
	public void drawApple(Graphics g){
		int boxSize = appleBox.BOX_SIZE;
		g.setColor(Color.red);
		g.fillOval(appleBox.x * boxSize, 
				appleBox.y * boxSize, boxSize, boxSize);
	}
	
	public Box getAppleBox(){
		return appleBox;
	}
}