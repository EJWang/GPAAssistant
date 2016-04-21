package module;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * The configurator uses to load configuration file or collect information
 * from student object then write it to file.
 *
 * @author EJWang
 */
public class Configurator {

  private Student student;

  /**
   * Construct the configurator.
   */
  public Configurator() {
  }

  /**
   * Load data from the configuration data.
   *
   * @return The student object which is converted from configuration file
   * @throws Exception if failed to load data from configuration file
   */
  public Student loadData() throws Exception {
    // Open the configuration file
    BufferedReader br = new BufferedReader(new FileReader("info.conf"));

    String line;
    while ((line = br.readLine()) != null) {

    }
    return student;
  }

  /**
   * Save data then write the information into file and named info.conf.
   */
  public void saveData() throws Exception {
    FileWriter fileWriter = new FileWriter("info.conf");
  }
}
