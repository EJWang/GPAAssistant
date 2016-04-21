package driver;

import controller.Controller;
import sun.applet.Main;
import view.MainFrame;

import java.awt.*;

/**
 * The entry-point of the GPAAssistant.
 *
 * @author EJWang
 */
public class GPAAssistant {

  /**
   * The entry-point of the GPAAssistant.
   *
   * @param args The array of arguments pass to this function
   */
  public static void main(String[] args) throws Exception {

    Controller controller = new Controller();
    MainFrame frame = new MainFrame(controller);
    frame.setVisible(true);
  }
}
