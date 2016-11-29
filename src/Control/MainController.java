package Control;

import View.MainView;

import Model.Card;

/**
 * Created by gast06 on 28.11.2016.
 */
public class MainController {

        private StackHandler stackHandler;

        public MainController(){
            stackHandler = new StackHandler();
        }

    public boolean naziLehr(){
        if(stackHandler.naziLehr()){
            return true;
        }
        return false;
    }

    public Card flipCard(){
        Card output;
        output = stackHandler.karteUmdrehen();
        return output;
    }

    public String shuffle(){
        return stackHandler.shuffle();
    }

    public void stapelUmdrehen(){
        stackHandler.stapelUmdrehen();
    }

}
