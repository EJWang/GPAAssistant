package view;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * The Terminator uses to terminate the program once the frame is closing.
 *
 * @author EJWang
 */
public class Terminator extends WindowAdapter {

  /**
   * Terminate all the background program once the frame is close.
   *
   * @param windowEvent The involved window event
   */
  @Override public void windowClosing(WindowEvent windowEvent) {
    System.exit(0);
  }
}
