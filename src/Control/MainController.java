package Control;

import View.MainFrame;

/**
 * Created by gast06 on 28.11.2016.
 */
public class MainController {

        private MainFrame frame;
        private StackHandler stackHandler;
        private AblageTop ablageTop;
        private NachziehTop nachziehTop;

        public MainController(MainFrame frame){
            this.frame = frame;
            stackHandler = new StackHandler();
            nachziehTop = new NachziehTop();
            ablageTop = new AblageTop(50,50,500,500);
        }

}
