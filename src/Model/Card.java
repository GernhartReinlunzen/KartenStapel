package Model;

import java.awt.geom.Rectangle2D;

/**
 * Created by gast06 on 28.11.2016.
 */
public class Card{
    private int color;
    private int worth;

    public Card(int color, int worth){
        this.color = color;
        this.worth = worth;
    }

    public int getColor() {
        return color;
    }

    public int getWorth() {
        return worth;
    }

    public String getFront(){
        String output= Integer.toString(getWorth()+1)+ "   "+ Integer.toString(getColor()+1);
        /**if(color == 0){
            if(worth == 0){
                output = "\uF0AD";
            }else if(worth == 1){
                output = "\uF0A1";
            }else if(worth == 1){
                output = "\uF0A2";
            }else if(worth == 1){
                output = "\uF0A3";
            }else if(worth == 1){
                output = "\uF0A4";
            }else if(worth == 1){
                output = "\uF0A5";
            }else if(worth == 1){
                output = "\uF0A6";
            }else if(worth == 1){
                output = "\uF0A7";
            }else if(worth == 1){
                output = "\uF0A8";
            }else if(worth == 1){
                output = "\uF0A9";
            }else if(worth == 1){
                output = "\uF0AA";
            }else if(worth == 1){
                output = "\uF0AB";
            }else if(worth == 1){
                output = "\uF0AC";
            }else if(worth == 1){
                output = "\uF0AE";
            }
        }else if(color == 1){
            if(worth == 0){
                output = "\uF0BD";
            }else if(worth == 1){
                output = "\uF0B1";
            }else if(worth == 1){
                output = "\uF0B2";
            }else if(worth == 1){
                output = "\uF0B3";
            }else if(worth == 1){
                output = "\uF0B4";
            }else if(worth == 1){
                output = "\uF0B5";
            }else if(worth == 1){
                output = "\uF0B6";
            }else if(worth == 1){
                output = "\uF0B7";
            }else if(worth == 1){
                output = "\uF0B8";
            }else if(worth == 1){
                output = "\uF0B9";
            }else if(worth == 1){
                output = "\uF0BA";
            }else if(worth == 1){
                output = "\uF0BB";
            }else if(worth == 1){
                output = "\uF0BC";
            }else if(worth == 1){
                output = "\uF0BE";
            }
        }else if(color == 2){
            if(worth == 0){
                output = "\uF0CD";
            }else if(worth == 1){
                output = "\uF0C1";
            }else if(worth == 1){
                output = "\uF0C2";
            }else if(worth == 1){
                output = "\uF0C3";
            }else if(worth == 1){
                output = "\uF0C4";
            }else if(worth == 1){
                output = "\uF0C5";
            }else if(worth == 1){
                output = "\uF0C6";
            }else if(worth == 1){
                output = "\uF0C7";
            }else if(worth == 1){
                output = "\uF0C8";
            }else if(worth == 1){
                output = "\uF0C9";
            }else if(worth == 1){
                output = "\uF0CA";
            }else if(worth == 1){
                output = "\uF0CB";
            }else if(worth == 1){
                output = "\uF0CC";
            }else if(worth == 1){
                output = "\uF0CE";
            }
        }else if(color == 3){
            if(worth == 0){
                output = "\uF0DD";
            }else if(worth == 1){
                output = "\uF0D1";
            }else if(worth == 1){
                output = "\uF0D2";
            }else if(worth == 1){
                output = "\uF0D3";
            }else if(worth == 1){
                output = "\uF0D4";
            }else if(worth == 1){
                output = "\uF0D5";
            }else if(worth == 1){
                output = "\uF0D6";
            }else if(worth == 1){
                output = "\uF0D7";
            }else if(worth == 1){
                output = "\uF0D8";
            }else if(worth == 1){
                output = "\uF0D9";
            }else if(worth == 1){
                output = "\uF0DA";
            }else if(worth == 1){
                output = "\uF0DB";
            }else if(worth == 1){
                output = "\uF0DC";
            }else if(worth == 1){
                output = "\uF0DE";
            }
        }*/

        return output;
    }
}

