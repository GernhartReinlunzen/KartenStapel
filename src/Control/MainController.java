package Control;

import View.MainFrame;

/**
 * Created by gast06 on 28.11.2016.
 */
public class MainController {

        private MainFrame frame;
        private StackHandler stackHandler;

        public MainController(MainFrame frame){
            this.frame = frame;
            stackHandler = new StackHandler();

        }

}
