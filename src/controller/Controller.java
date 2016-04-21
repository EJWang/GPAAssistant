package controller;

import module.Configurator;
import module.Student;

/**
 * The Controller uses to dispatch different part of the system in order to
 * transfer specified data.
 *
 * @author EJWang
 */
public class Controller {

  // The student object which stores all the academic information
  private Student student;

  // The configurator uses to load file or save file
  private Configurator configurator;

  // True if the user has previously used this program
  private boolean isConfigured;

  /**
   * Construct the Controller.
   */
  public Controller() {
    try {
      configurator = new Configurator();
      student = configurator.loadData();
      isConfigured = true;

    } catch (Exception e) {
      isConfigured = false;
    }
  }

  /**
   * Return true if the user has configuration file stored.
   *
   * @return True if user has configuration file stored
   */
  public boolean isConfigured() {
    return isConfigured;
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
