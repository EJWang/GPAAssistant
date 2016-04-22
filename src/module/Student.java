package module;

import java.util.ArrayList;
import java.util.List;

/**
 * A student whom is focus on academic career.
 *
 * @author EJWang
 */
public class Student {

  private final String studentName;
  private final String schoolName;

  // The list of courses taken by this student
  private List<Course> academicHistory;

  /**
   * Construct a module.Student.
   *
   * @param studentName The name of the student
   * @param schoolName  The name of the school that student attended
   */
  public Student(String studentName, String schoolName) {
    this.studentName = studentName;
    this.schoolName = schoolName;
    academicHistory = new ArrayList<>();
  }

  /**
   * Add a course for this student.
   *
   * @param course The course to be added
   */
  public void addCourse(Course course) {
    academicHistory.add(course);
  }

  /**
   * Get the name of this student.
   *
   * @return The name of the student
   */
  public String getStudentName() {
    return studentName;
  }

  /**
   * Get the school name of this student.
   *
   * @return The name of the school
   */
  public String getSchoolName() {
    return schoolName;
  }

  /**
   * Get the academic history of this student.
   *
   * @return The academic history of this student
   */
  public List<Course> getAcademicHistory() {
    return academicHistory;
  }

}
