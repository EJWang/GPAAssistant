package module;

import java.util.ArrayList;
import java.util.List;

import module.Course;

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
  private List<CoursePartWork> coursePartWork;

  /**
   * Construct a module.CourseAnalyzer.
   *
   * @param course The course to be analyzed
   */
  public CourseAnalyzer(Course course) {
    this.course = course;
    this.coursePartWork = new ArrayList<CoursePartWork>();
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
    double finalMark = 0.0;
    double restPercentage = 100;
    for(CoursePartWork i: coursePartWork){
      double grade = i.getGrade();
      double partFinalGrade = grade/ i.getWeight() * i.getWeight();
      restPercentage -= i.getWeight();
      finalMark += partFinalGrade;
    };
    return finalMark + restPercentage;
        
  }

  /**
   * Calculate the possible work final mark of this course.
   * Analyze all grade earned from same type of the part works and calculate
   * the  final grade based on the current average of all work.
   *
   * @return The possible worst final mark of this course
   */
  public double calculateAveragePossibleFinalMark() {
    double finalMark = 0.0;
    double restPercentage = 100;
    double tendencyAverage =0.0;
    for(CoursePartWork i: coursePartWork){
      double grade = i.getGrade();
      double partFinalGrade = grade/ i.getWeight() * i.getWeight();
      tendencyAverage += grade;
      restPercentage -= i.getWeight();
      finalMark += partFinalGrade;
    };
    //The prediction of the rest of non-available mark
    tendencyAverage = tendencyAverage / coursePartWork.size() *restPercentage;
    return finalMark + tendencyAverage;
        
  }

  /**
   * Calculate the possible custom analyzed final mark of this course.
   * Allow student to self-define a specified type of work then in order to
   * calculate the possible mark at the end of this course.
   *
   * @return The possible custom analyzed final mark of this course
   */
  public double calculateCustomAnalzyedFinalMark(double mark, double weight) {
    return 0.0;
  }
}
