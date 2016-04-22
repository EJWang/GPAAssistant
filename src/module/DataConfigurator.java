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

  private Student student;
  private File config;

  /**
   * Construct a DataConfigurator.
   */
  public DataConfigurator(Student student) {
    config = new File("info.conf");
  }

  /**
   * Load data from configuration file.
   *
   * @throws IOException if failed to load data from configuration file
   */
  public Student loadData() throws IOException {
    // Information read from file
    String studentName = "";
    String schoolName = "";
    List<String[]> courseList = new ArrayList<>();

    // Read lines from configuration file
    BufferedReader br = new BufferedReader(new FileReader(config));
    String line;
    while ((line = br.readLine()) != null) {
      if (line.startsWith("STUDENT_NAME:")) {
        studentName = line.substring(line.indexOf(":") + 1);
      } else if (line.startsWith("SCHOOL_NAME:")) {
        schoolName = line.substring(line.indexOf(":") + 1);
      } else if (line.startsWith("COURSE:")) {
        courseList.add(line.substring(line.indexOf(":") + 1).split(","));
      }
    }
    br.close();

    // Create student object and add course information
    student = new Student(studentName, schoolName);
    updateCourseInformation(courseList);
    return student;
  }

  /**
   * Add course information into the student object.
   *
   * @param courseList The list of course information
   */
  private void updateCourseInformation(List<String[]> courseList) {
    Course course;
    String courseCode;
    boolean isCompleted;

    for (String[] info : courseList) {
      courseCode = info[0];
      isCompleted = info[1].equals("COMPLETE");
    }
  }

  /**
   * Save data into the configuration file.
   *
   * @throws IOException if failed to save data info the configuration file
   */
  public void saveData() throws IOException {
    FileWriter fileWriter = new FileWriter(config);
    fileWriter.write("STUDENT_NAME:" + student.getStudentName() + "\n");
    fileWriter.write("SCHOOL_NAME:" + student.getSchoolName() + "\n");

    fileWriter.close();
  }
}
