
import java.awt.Color;
import acm.program.*;
import acm.graphics.*;
/*
 * On some runs of this program you might not see ten circles. Why? 

 * the reason we might not see all 10 circles is that they may overlap one another and get rid of it visually
 * it doesn't mean it doesn't create it though
 */
	
public class randomCircles extends GraphicsProgram{
	 public void run() {
		 for(int i = 0; i<10; i++) {
			 double randomSize =  (Math.random()*(50 - 5) + 5);
			double randomX =  (Math.random()*(getWidth() - 1) + 1);
			double randomY = (Math.random()*(getHeight() - 1) + 1);
			Color color = new Color((int)(Math.random() * 0x1000000));
			
			GOval circles = new GOval(randomX,randomY,randomSize,randomSize);
			circles.setFillColor(color);
			circles.setFilled(true);
			
			
			add(circles);

		 }
		 
	 }
}
