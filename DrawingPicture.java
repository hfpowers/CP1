/**
 * Cold winter night
 *
 * @Haley Powers
 * @1/17/19
 */

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import javax.swing.JComponent;
import java.awt.Polygon;

public class DrawingPicture extends JComponent
{
    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D)g;

	g2.setColor(Color.blue);
        Rectangle box = new Rectangle(0, 0, 400, 400);
	g2.fill(box);
        
    g2.setColor(Color.yellow);
	Ellipse2D.Double circle = new Ellipse2D.Double(300, 50, 75, 75);
	g2.fill(circle);
    
 
        
    g2.setColor(Color.black);
        
    Rectangle b = new Rectangle (0, 300, 400 , 100);
        g2.fill(b);
         g2.setColor(Color.black);
    Rectangle rr = new Rectangle (45, 220, 150, 80);
    g2.fill(rr);
        
        g2.setColor(Color.black);
        // x coordinates of vertices
        int x[] = { 45, 195, 120};
        
        // y coordinates of vertices
        int y[] = { 220, 220, 150 };
        
        // number of vertices
        int numberofpoints = 3;
        
        // create a polygon with given x, y coordinates
        Polygon p = new Polygon(x, y, numberofpoints);
        
        // draw the polygon using drawPolygon
        // function using object of polygon class
        g.fillPolygon(p);
        
        g2.setColor(Color.black);
        
        Rectangle j = new Rectangle (290, 280, 20 , 20);
        g2.fill(j);
        g2.setColor(Color.black);
        
        
        // x coordinates of vertices
        int x2[] = { 270, 300, 330 };
        
        // y coordinates of vertices
        int y2[] = { 280, 150, 280 };
        
        // number of vertices
        int numberofpoints2 = 3;
        
        // create a polygon with given x, y coordinates
        Polygon t = new Polygon(x2, y2, numberofpoints2);
        
        // draw the polygon using drawPolygon
        // function using object of polygon class
        g.fillPolygon(t);
        
        Rectangle s = new Rectangle (170, 190, 15, 190);
        g2.fill(s);
        
        Rectangle d = new Rectangle (360, 290, 16 , 16);
        g2.fill(d);
        
        int x3[] = { 368, 350, 386 };
        
        // y coordinates of vertices
        int y3[] = { 215, 290, 290 };
        
        // number of vertices
        int numberofpoints3 = 3;
        
        // create a polygon with given x, y coordinates
        Polygon f = new Polygon(x3, y3, numberofpoints3);
        
        // draw the polygon using drawPolygon
        // function using object of polygon class
        g.fillPolygon(f);
        
        
        
        Rectangle a = new Rectangle (230, 290, 16 , 16);
        g2.fill(a);
        
        int x4[] = { 238, 256, 220 };
        
        // y coordinates of vertices
        int y4[] = { 215, 290, 290 };
        
        // number of vertices
        int numberofpoints4 = 3;
        
        // create a polygon with given x, y coordinates
        Polygon h = new Polygon(x4, y4, numberofpoints4);
        
        // draw the polygon using drawPolygon
        // function using object of polygon class
        g.fillPolygon(h);
    }
}
