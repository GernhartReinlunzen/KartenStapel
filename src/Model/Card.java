package Model;

import java.awt.geom.Rectangle2D;

/**
 * Created by gast06 on 28.11.2016.
 */
public class Card{
    private int color;
    private int worth;

    private Rectangle2D.Double rect;

    public Card(int color, int worth){
        this.color = color;
        this.worth = worth;
    }
}

