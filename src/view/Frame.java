package view;

import javax.swing.*;

/**
 * The main frame of the GPAAssistant user interface.
 *
 * @author EJWang
 */
public class Frame extends JFrame {

  /**
   * Construct a Frame.
   */
  public Frame() {
    setTitle("GPAAssistant V1.0 by EJWang");
    setSize(300, 200);
    setLocation(250, 250);

    // Terminate all background tasks once frame is closing
    addWindowListener(new Terminator());
  }

}
