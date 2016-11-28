package Control;

import View.DrawingPanel;
import View.InteractableObject;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;


/**
 * Created by gast06 on 28.11.2016.
 */
public class AblageTop implements InteractableObject {
    private Rectangle2D.Double rectangle;
    private double xPos, yPos, width, height;

    public AblageTop(double xPos, double yPos, double width, double height) {
        super();

        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        rectangle =new Rectangle2D.Double(xPos,yPos,width,height);
    }

    @Override
    public void draw(DrawingPanel dp, Graphics2D g2d) {
        g2d.setColor(new Color(0,255,0));
        g2d.fill(rectangle);
        g2d.setColor(new Color(240,128,128));
        g2d.draw(rectangle);
        rectangle.setFrame(50,50,500,500);
    }

    @Override
    public void update(double dt) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }
}
