import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;

public class drawLines extends GraphicsProgram {
	public void run() {
		addMouseListeners();
		}
	public void mousePressed(MouseEvent e) {
		line = new GLine(e.getX(), e.getY(), e.getX(), e.getY());
		add(line);
	    }
	public void mouseDragged(MouseEvent e){
		line.setEndPoint(e.getX(), e.getY());
	}
    public void mouseReleased(MouseEvent e) {}
	private GLine line;
}