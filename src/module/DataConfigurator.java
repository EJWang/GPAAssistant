package module;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * The DataConfigurator uses to load data or save data from configuration file.
 *
 * @author EJWang
 */
public class DataConfigurator {

  public File config;

  /**
   * Construct a DataConfigurator.
   */
  public DataConfigurator() {
    config = new File("info.conf");
  }

  /**
   * Load data from configuration file.
   *
   * @throws IOException if failed to load data from configuration file
   */
  public void loadData() throws IOException {
    // Information read from file
    String studentName;
    String schoolName;
    List<String[]> courses = new ArrayList<>();

    // Read lines from configuration file
    BufferedReader br = new BufferedReader(new FileReader(config));
    String line;
    while ((line = br.readLine()) != null) {
      if (line.startsWith("STUDENT_NAME:")) {
        studentName = line.substring(line.indexOf(":") + 1);
      } else if (line.startsWith("SCHOOL_NAME:")) {
        schoolName = line.substring(line.indexOf(":") + 1);
      } else if (line.startsWith("COURSE:")) {
        courses.add(line.substring(line.indexOf(":") + 1).split(","));
      }
    }

    Student student = new Student(studentName, schoolName);
  }

  /**
   * Save data into the configuration file.
   *
   * @throws IOException
   */
  public void saveData() throws IOException {
    FileWriter fileWriter = new FileWriter(config);
  }
}
