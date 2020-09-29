import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;

public class drawLines extends GraphicsProgram {
	public void run() {
		addMouseListeners();
		addMouseMotionListener(this);
	}

	public void mouseClicked(MouseEvent e) {
		double x = e.getX();
		double y = e.getY();
		

		line = new GLine(x, y, x, y);
		line.setStartPoint(x, y);
		add(line);
	}

	public void mouseDragged(MouseEvent e){
		double x = e.getX();
		double y = e.getY();

		line.setEndPoint(x, y);
	}

	private GLine line;
}
