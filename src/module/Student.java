package module;

import java.util.ArrayList;
import java.util.List;

/**
 * A student whom is focus on academic career.
 *
 * @author EJWang
 */
public class Student {

  private final String name;
  private List<Course> academicHistory;

  /**
   * Construct a module.Student.
   *
   * @param name The name of the student
   */
  public Student(String name) {
    this.name = name;
    academicHistory = new ArrayList<>();
  }
}
