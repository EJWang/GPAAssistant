package driver;

import controller.Controller;
import module.Course;
import module.CoursePartWork;
import module.DataConfigurator;
import module.Student;

import java.io.FileReader;
import java.io.IOException;

/**
 * The starting user interface of the GPAAssistant.
 *
 * @author EJWang
 */
public class GPAAssistant {

  private static void DEBUGLoadConfig() throws IOException {

    DataConfigurator configurator = new DataConfigurator("info.conf");
    Student ej = configurator.loadData();
    System.out.println("Student Name: " + ej.getStudentName());
    System.out.println("School: " + ej.getSchoolName());
    System.out.println("Academic History: ");

    for (Course curr : ej.getAcademicHistory()) {
      System.out.println(
          "    Course Code: " + curr.getCourseCode() + " Status: " + curr
              .getStatus() + " Current Grade: " + curr.getEarnedGrade());
      for (CoursePartWork work : curr.getPartWorks()) {
        System.out.println(
            "        " + work.getName() + " Grade: " + work.getGrade()
                + " Weight: " + work.getWeight());
      }
    }
  }

  /**
   * The starting user interface of the GPAAssistant.
   *
   * @param args The array of arguments pass to this function
   */
  public static void main(String[] args) throws IOException {
    DEBUGLoadConfig();
    //new Controller();
  }
}
