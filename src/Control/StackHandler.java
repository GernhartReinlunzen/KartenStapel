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


    public StackHandler() {
        NaziStapel = new CardStack<Card>();
        AblageStapel = new CardStack<Card>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                NaziStapel.push(new Card(i, j));
            }
        }
        //shuffle();
    }

    public boolean naziLehr() {
        if (NaziStapel.isEmpty()) {
            return true;
        }
        return false;
    }

    public Card karteUmdrehen() {
        Card output = NaziStapel.top();
        AblageStapel.push(NaziStapel.top());
        NaziStapel.pop();
        return output;
    }

    public void stapelUmdrehen() {
        if (NaziStapel.top() == null) {
            NaziStapel = AblageStapel;
            //shuffle();
            AblageStapel = new CardStack<Card>();
        }
    }

    public String shuffle() {
        Card[] help = new Card[52];
        for (int i = 0; i < 52; i++) {
            help[i] = NaziStapel.top();
        }
        Card[] shuffled = new Card[52];
        for (int i = 52; i >= 0; i--) {
            int x = (int) Math.random() * 52;
            while (help[x] != null) {
                x= (int) Math.random() * 52;
            }

            if (help[x] != null) {
                shuffled[i] = help[x];
                help[x] = null;
            }
        }
        NaziStapel = new CardStack<>();
        for(int i = 0; i<52;i++){
            NaziStapel.push(help[i]);
        }
        return "gemischt";
    }
}
