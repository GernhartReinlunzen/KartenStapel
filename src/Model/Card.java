package Model;

import java.awt.geom.Rectangle2D;

/**
 * Created by gast06 on 28.11.2016.
 */
public class Card {
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
        createCard();
    }

    public void createCard(){
        rect = new Rectangle2D.Double(color,worth,xPos,yPos,width,height);
    }
}

