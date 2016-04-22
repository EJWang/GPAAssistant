package module;

/**
 * The course part work is a work that is a part of the course.
 * For example, the midterm, assignment, essay are part of the course.
 *
 * @author EJWang
 */
public class CoursePartWork {

  private String name;
  private String category;
  private double weight;

  private double grade = 0;

  private boolean hasGrade;

  /**
   * Construct a CoursePartWork.
   *
   * @param name     The name of this course part work
   * @param category The category may be ATTENDANCE, HOMEWORK, TEST or UNKNOWN
   * @param weight   The weight to the final grade
   */
  public CoursePartWork(String name, String category, double weight) {
    this.name = name;
    this.category = category;
    this.weight = weight;
  }

  /**
   * Get the name of this part work.
   *
   * @return The name of this part work
   */
  public String getName() {
    return name;
  }

  /**
   * Set the name of this part work.
   *
   * @param name The new name of this part work
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Get the category of this part work.
   *
   * @return The category of this part work
   */
  public String getCategory() {
    return category;
  }

  /**
   * Re-evaluate the category of this part work.
   *
   * @param category The new category of this part work
   */
  public void setCategory(String category) {
    this.category = category;
  }

  /**
   * Get the weight of this part work.
   *
   * @return The weight to the final grade
   */
  public double getWeight() {
    return weight;
  }

  /**
   * Modified the weight of this part work.
   *
   * @param weight The new weight of this part work
   */
  public void setWeight(double weight) {
    this.weight = weight;
  }

  /**
   * Get the grade of this part work.
   *
   * @return The grade of this part work
   */
  public double getGrade() {
    return grade;
  }

  /**
   * Modified the grade of this part work.
   *
   * @param grade The new grade of this part work
   */
  public void setGrade(double grade) {
    this.grade = grade;
  }

}