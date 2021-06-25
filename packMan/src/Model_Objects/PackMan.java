package Model_Objects;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class PackMan {

	private Integer f_x;
	private Integer f_y;

	public PackMan(Integer x, Integer y) {
		f_x = x;
		f_y = y;
	}
	
	public void moveLeft() {
		f_x--;
	}
	public void moveRight() {
		f_x++;
	}
	public void moveUp() {
		f_y--;
	}
	public void moveDown() {
		f_y++;
	}
	
	public void draw(Graphics g, int r) {
		// PackMan draws himself
        g.setColor(Color.YELLOW);
			  Integer x = f_x-(r/2);
			  Integer y = f_y-(r/2);
			  g.fillOval(x,y,r,r);
	}
}
