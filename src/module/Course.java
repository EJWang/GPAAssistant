package module;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * A course that is offered from school.
 *
 * @author EJWang
 */
public class Course {

  private String courseCode;
  private String status;
  private double earnedGrade;

  private List<CoursePartWork> partWorks;

  /**
   * Construct a Course.
   *
   * @param courseInfo The array of of course information
   */
  public Course(String[] courseInfo) {
    courseCode = courseInfo[0];
    status = courseInfo[1];
    earnedGrade = Double.parseDouble(courseInfo[2]);

    partWorks = new ArrayList<>();
    for (int i = 3; i < courseInfo.length; i++) {
      String[] workInfo = courseInfo[i].split(":");
      String workName = workInfo[0];
      String category = workInfo[1];
      String grade = workInfo[2];
      double weight = Double.parseDouble(workInfo[3]);

      // Create CoursePartWork object then add it into partWorks
      partWorks.add(new CoursePartWork(workName, category, grade, weight));
    }
  }

  // ------------ Getter and Setters --------------

  /**
   * Get the course code of this course.
   *
   * @return The course code of this course
   */
  public String getCourseCode() {
    return courseCode;
  }

  /**
   * Modified the course code of this course.
   *
   * @param courseCode The fixed course code of this course
   */
  public void setCourseCode(String courseCode) {
    this.courseCode = courseCode;
  }

  /**
   * Get the status of this course
   *
   * @return The status of this course
   */
  public String getStatus() {
    return status;
  }

  /**
   * Modified the status of this course.
   *
   * @param status The status of this course
   */
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Get the earned grade of this course.
   *
   * @return The earned grade of this course
   */
  public double getEarnedGrade() {
    return earnedGrade;
  }

  /**
   * Modified the earned grade.
   *
   * @param earnedGrade The new earned grade
   */
  public void setEarnedGrade(double earnedGrade) {
    this.earnedGrade = earnedGrade;
  }

  /**
   * Get the list of the part works of this course.
   *
   * @return The list of the part work
   */
  public List<CoursePartWork> getPartWorks() {
    return partWorks;
  }

}
