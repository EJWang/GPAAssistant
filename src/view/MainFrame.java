package view;

import controller.Controller;
import javax.swing.*;
import java.awt.*;

/**
 * The main frame of the GPAAssistant user interface.
 *
 * @author EJWang
 */
@SuppressWarnings("serial")
public class MainFrame extends JFrame {

  /**
   * 
   */
  private Controller controller;

  /**
   * Construct a MainFrame.
   */
  public MainFrame(Controller controller) {
    this.controller = controller;
    setTitle("GPA Assistant");
    setSize(400,400);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);

    // Load background image
//    setContentPane(new Background());

    JLabel welcome = new JLabel("Welcome to use GPA Assistant!");
    add(welcome);

  }

  /**
   * Load old user's interface.
   */
  private void oldUser() {
    JButton first = new JButton("1. View Academic History");
    JButton second = new JButton("2. View Specified Course");
    JButton third = new JButton("3. Manage Course");

    add(first);
    add(second);
    add(third);
  }
  /**
   *  Load new user's interface.
   */

  private void newUser() {
    setLayout(new FlowLayout());
    JLabel name = new JLabel("You are new user, please enter your name");
    JTextField studentName = new JTextField(15);

    JLabel school = new JLabel("Please enter your school's name");
    JTextField schoolName = new JTextField(15);
    // Builder design pattern?
    JButton confirm = new JButton("Ok");

    add(name);
    add(studentName);
    add(school);
    add(schoolName);
    add(confirm);
  }
  public void Display(){
    
    
  }
  /**
   * Parse to the process of exiting from the program; User's interface will
   * display
   */
  public void Exit(){
    controller.actionExit();
  }

}
