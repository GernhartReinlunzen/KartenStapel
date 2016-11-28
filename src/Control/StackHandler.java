package Control;

import Model.Card;
import Model.CardStack;

import javax.print.attribute.standard.MediaSize;

/**
 * Created by gast06 on 28.11.2016.
 */
public class StackHandler {
    private CardStack<Card> NaziStapel;
    private CardStack<Card> AblageStapel;


    public StackHandler(){
        NaziStapel = new CardStack<Card>();
        AblageStapel = new CardStack<Card>();
        for(int i= 0; i<4;i++){
            for(int j = 0;j<13;j++){
                NaziStapel.push(new Card(i,j));
            }
        }
    }

    public void karteUmdrehen(){
        AblageStapel.push(NaziStapel.top());
        NaziStapel.pop();
    }

    public void StapelUmdrehen(){
        if(NaziStapel.top()== null){
            NaziStapel= AblageStapel;
            AblageStapel = new CardStack<Card>();
        }
    }

}
