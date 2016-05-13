package controller;

import module.DataConfigurator;
import module.Student;
import view.MainFrame;
import view.NewUserFrame;
import view.OldUserFrame;

import java.io.IOException;

import javax.xml.crypto.Data;

/**
 * The Controller uses to dispatch different part of the system in order to
 * transfer specified data.
 *
 * @author EJWang
 */
public class Controller {

  // The student is a consistent object  which stores all the 
  // academic information.
  private Student student;

  private DataConfigurator configurator;

  private MainFrame mainFrame;
  private NewUserFrame newUserFrame;
  private OldUserFrame oldUserFrame;

  /**
   * Construct the Controller.
   */
  public Controller() {
    configurator = new DataConfigurator("info.conf");
    mainFrame = new MainFrame(this);
    mainFrame.setVisible(true);
  }
  /**
   * Parse to the interface of MainFrame and display it to the user
   * 
   */
  public void showMainFrame() {
   this.mainFrame.Display();

  }
  /**
    * Parse to the interface of newUserFrame and display it to the user
   * 
   * @return The interface of newUserFrame;
   */
  public NewUserFrame shownewUserFrame() {
    return newUserFrame;

  }
  /**
  /**
    * Parse to the interface of oldUserFrame and display it to the user
   * 
   * @return The interface of oldUserFrame;
   */
  
  public OldUserFrame showoldUserFrame() {
    return oldUserFrame;

  }

  public void showOperateFrame() throws IOException {
    configurator.loadData();
    

  }

  /**
   * Prepare to save the data and exit the program.
   *
   * @return True if everything is settle down
   */
  public boolean actionExit() {
    try {
      // Call configurator to save the data into the configuration file
      configurator.saveData();

      return true;

    } catch (Exception e) {
      return false;
    }
  }

}
