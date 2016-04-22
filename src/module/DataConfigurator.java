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
   * Load student information data from configuration file and get the Student
   * object base on the information.
   *
   * @throws IOException if failed to load data from configuration file
   */
  public Student loadData() throws IOException {
    // Student information read from configuration file
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

    // Establish student object and add course information to the student
    student = new Student(studentName, schoolName);
    for (String[] courseInfo : courseList) {
      student.addCourse(new Course(courseInfo));
    }
    return student;
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
