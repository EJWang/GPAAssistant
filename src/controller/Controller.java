package controller;

import module.Student;
import view.MainFrame;
import view.NewUserFrame;
import view.OldUserFrame;

/**
 * The Controller uses to dispatch different part of the system in order to
 * transfer specified data.
 *
 * @author EJWang
 */
public class Controller {

  // The student object which stores all the academic information
  private Student student;

  private MainFrame mainFrame;
  private NewUserFrame newUserFrame;
  private OldUserFrame oldUserFrame;

  /**
   * Construct the Controller.
   */
  public Controller() {
    mainFrame = new MainFrame(this);
    mainFrame.setVisible(true);
  }

  public void showMainFrame() {

  }

  public void showOperateFrame() {

  }

  /**
   * Prepare to save the data and exit the program.
   *
   * @return True if everything is settle down
   */
  public boolean actionExit() {
    try {
      // Call configurator to save the data into the configuration file

      return true;

    } catch (Exception e) {
      return false;
    }
  }

}
