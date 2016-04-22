package module;

/**
 * A course that is offered from school.
 *
 * @author EJWang
 */
public class Course {

  private final String courseCode;
  private String courseStatus;
  private double earnedGrade;

  /**
   * Construct a Course.
   *
   * @param courseInfo The array of of course information
   */
  public Course(String[] courseInfo) {
    courseCode = courseInfo[0];
    courseStatus = courseInfo[1];
    earnedGrade = Double.parseDouble(courseInfo[2]);
  }

  /**
   * Get the course code of this course.
   *
   * @return The course code of this course
   */
  public String getCourseCode() {
    return courseCode;
  }

  /**
   * Return true if this course is complete.
   *
   * @return True if this course is complete
   */
  public boolean isCompleted() {
    return courseStatus.equals("COMPLETE");
  }

  /**
   * Get the earned grade of this course.
   *
   * @return The earned grade of this course
   */
  public double getEarnedGrade() {
    return earnedGrade;
  }

}
