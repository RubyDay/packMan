/**
 * 
 */
package View_Display;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import Model_Objects.PackMan;

/**
 * @author RubyDay
 *
 */
public class PackManGame extends JFrame {

	   // Define constants
	   public static final int CANVAS_WIDTH  = 200;
	   public static final int CANVAS_HEIGHT = 400;
	 
	   // Declare an instance of the drawing canvas,
	   // which is an inner class called DrawCanvas extending javax.swing.JPanel.
	   private DrawCanvas canvas;
	 
	   // Constructor to set up the GUI components and event handlers
	   public PackManGame() {
	      canvas = new DrawCanvas();    // Construct the drawing canvas
	      canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
	 
	      // Set the Drawing JPanel as the JFrame's content-pane
	      Container cp = getContentPane();
	      cp.add(canvas);
	      // or "setContentPane(canvas);"
	 
	      setDefaultCloseOperation(EXIT_ON_CLOSE);   // Handle the CLOSE button
	      pack();              // Either pack() the components; or setSize()
	      setTitle("......");  // "super" JFrame sets the title
	      setVisible(true);    // "super" JFrame show
	   }
	   
	   /**
	    * Define inner class DrawCanvas, which is a JPanel used for custom drawing.
	    */
	   private class DrawCanvas extends JPanel {
	      // Override paintComponent to perform your own painting
	      @Override
	      public void paintComponent(Graphics g) {
	         super.paintComponent(g);     // paint parent's background
	         setBackground(Color.BLACK);  // set background color for this JPanel
	 
	         // Your custom painting codes. For example,
	         // Drawing primitive shapes
	         
	         new PackMan(100,200).draw(g, 30);
	      }
	   }
	 
	   /**
	 * @param args
	 */
	public static void main(String[] args) {
	      // Run the GUI codes on the Event-Dispatching thread for thread safety
	      SwingUtilities.invokeLater(new Runnable() {
	         @Override
	         public void run() {
	            new PackManGame(); // Let the constructor do the job
	         }
	      });
	}

}
