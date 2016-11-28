package View;

/**
 * Created by Jean-Pierre on 15.11.2016.
 */

import java.awt.event.MouseEvent;

/**
 * Interface für Objekte, die gezeichnet, programm-steuerbar
 * UND nutzerinteragierbar sein müssen.
 */
public interface InteractableObject extends DrawableObject{

    void mouseReleased(MouseEvent e);


}
