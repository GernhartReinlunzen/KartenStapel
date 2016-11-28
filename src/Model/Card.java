package Model;

import View.DrawingPanel;
import View.InteractableObject;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;

/**
 * Created by gast06 on 28.11.2016.
 */
public class Card implements InteractableObject{
    private char color;
    private int worth;
    private double xPos, yPos, width, height;

    private Rectangle2D.Double rect;

    public Card(char color, int worth, double xPos, double yPos, double width, double height){
        this.color = color;
        this.worth = worth;
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        rect = new Rectangle2D.Double(xPos,yPos,width,height);
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void draw(DrawingPanel dp, Graphics2D g2d) {

    }

    @Override
    public void update(double dt) {

    }
}

