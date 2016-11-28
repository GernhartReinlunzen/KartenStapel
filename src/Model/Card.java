package Model;

import java.awt.geom.Rectangle2D;

/**
 * Created by gast06 on 28.11.2016.
 */
public class Card{
    private char color;
    private int worth;

    private Rectangle2D.Double rect;

    public Card(char color, int worth){
        this.color = color;
        this.worth = worth;
    }
}

