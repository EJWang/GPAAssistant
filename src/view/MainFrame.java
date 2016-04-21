package view;

import controller.Controller;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * The main frame of the GPAAssistant user interface.
 *
 * @author EJWang
 */
public class MainFrame extends JFrame {

  private Controller controller;

  /**
   * Construct a MainFrame.
   */
  public MainFrame(Controller controller) throws Exception {
    this.controller = controller;
    initUI();
  }

  private void initUI() throws Exception {

    setTitle("GPA Assistant");
    setSize(300, 200);
    // Display at the centre of the screen
    setLocationRelativeTo(null);
    // Terminate all background tasks once frame is closing
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    JLabel welcomePrompt = new JLabel("Welcome to use GPA Assistant!");
    BufferedImage myPicture = ImageIO.read(new File("img/backgrounds.jpg"));
    JLabel picLabel = new JLabel(new ImageIcon(myPicture));

    add(welcomePrompt);
    add(picLabel);
  }

}
