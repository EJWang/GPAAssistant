package operator;

import foundation.Course;

/**
 * The course analyzer uses to analyze the mark that student already earned
 * in a specified course in order to calculate the possible highest mark,
 * possible worst final mark, possible best final mark, and custom analyze
 * final mark.
 *
 * @author EJWang
 */
public class CourseAnalyzer {

  private Course course;

  /**
   * Construct a operator.CourseAnalyzer.
   *
   * @param course The course to be analyzed
   */
  public CourseAnalyzer(Course course) {
    this.course = course;
  }

  /**
   * Calculate the possible maximum final mark of this course.
   * This will simply assume all other incomplete part works will get 100%
   * at the end, then base on current mark to calculate the possible maximum
   * final mark.
   *
   * @return The possible maximum final mark of this course
   */
  public double getPossibleMaximumFinalMark() {
    return 0.0;
  }

  /**
   * Calculate the possible work final mark of this course.
   * Analyze all grade earned from same type of the part works and calculate
   * the worst grade based on the tendency to get the grade that might earned
   * by this student at the end.
   *
   * @return The possible worst final mark of this course
   */
  public double calculatePossibleWorstFinalMark() {
    return 0.0;
  }

  /**
   * Calculate the possible best final mark of this course.
   * Analyze all grade earned from same type of the part works and calculate
   * the best grade based on the tendency to get the grade that might earned
   * by this student at the end.
   *
   * @return The possible worst final mark of this course
   */
  public double calculatePossibleBestFinalMark() {
    return 0.0;
  }

  /**
   * Calculate the possible custom analyzed final mark of this course.
   * Allow student to self-define a specified type of work then in order to
   * calculate the possible mark at the end of this course.
   *
   * @return The possible custom analyzed final mark of this course
   */
  public double calculateCustomAnalzyedFinalMark() {
    return 0.0;
  }
}
