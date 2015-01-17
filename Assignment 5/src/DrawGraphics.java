import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;


public class DrawGraphics {
	BouncingBox box;
	BouncingBox boxa;
	BouncingBox boxb;
	BouncingBox boxc;
	ArrayList<BouncingBox> boxes;

	/** Initializes this class for drawing. */
	public DrawGraphics() {
		box = new BouncingBox(200, 50, Color.RED);
		box.setMovementVector(5, 5);
		//boxes.add(boxa);
		//boxes.add(boxb);
		//boxes.add(boxc);
		boxa= new BouncingBox(50, 200, Color.BLUE);
		boxa.setMovementVector(2, 4);
		boxb = new BouncingBox(75, 75, Color.GREEN);
		boxb.setMovementVector(6, 2);
		boxc = new BouncingBox(205, 205, Color.YELLOW);
		boxc.setMovementVector(-4, -4);
	}

	/** Draw the contents of the window on surface. Called 20 times per second. */
	public void draw(Graphics surface) {
		surface.drawLine(50, 50, 250, 250);
		box.draw(surface);
		boxa.draw(surface);
		boxb.draw(surface);
		boxc.draw(surface);
		surface.drawRect(25, 25, 25, 25);
		surface.drawOval(250, 250, 25, 25);
		surface.drawRect(50, 200, 20, 20);
		surface.drawRect(200, 50, 20, 20);
		surface.drawRect(75, 75, 20, 20);
		surface.drawRect(205, 205, 20, 20);
		/*for(int i=0; i<3; i++){
			boxes.get(i).draw(surface);
		}*/
	}
}
