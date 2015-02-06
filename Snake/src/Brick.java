import java.awt.Color;
import java.awt.Graphics;
import java.util.Collections;
import java.util.LinkedList;


public class Brick {

	public static LinkedList<Box> body;
	
	public Brick(){
		body = new LinkedList<>();
		Collections.addAll(body, 
				new Box(1, 2),
				new Box(2, 2),
				new Box(3, 2),
				new Box(4, 2)				
				);
	}
	
	public void drawBrick(Graphics g){
		for (Box box : body) {			
			//Draws each brick
			g.setColor(Color.RED);
			g.fillRect(box.x * box.BOX_SIZE, box.y * box.BOX_SIZE, 
					box.BOX_SIZE, box.BOX_SIZE);
			
			//Draws the border of each brick
			g.setColor(Color.black);
			g.drawRect(box.x * box.BOX_SIZE, box.y * box.BOX_SIZE, 
					box.BOX_SIZE, box.BOX_SIZE);
		}
	}
	
}
