//  @author Naoyuki Christopher Higaki [ST10462415]

package learner;

public class Learner {
  private String fullName;
  private String subject;
  private double assignmentMark;
  private double testMark;
  private double examMark;

  // Default Constructor
  public Learner() {
    fullName = "Tricia Jones";
    subject = "Computer Sciences";
    assignmentMark = 0.0;
    testMark = 0.0;
    examMark = 0.0;
  }

  // Getter Methods
  public String getFullName() {
    return fullName;
  }

  public String getSubject() {
    return subject;
  }

  public double getAssignmentMark() {
    return assignmentMark;
  }

  public double getTestMark() {
    return testMark;
  }

  public double getExamMark() {
    return examMark;
  }

  // Setter Methods
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public void setAssignmentMark(double assignmentMark) {
    this.assignmentMark = assignmentMark;
  }

  public void setTestMark(double testMark) {
    this.testMark = testMark;
  }

  public void setExamMark(double examMark) {
    this.examMark = examMark;
  }

  // Method to calculate Final Mark
  public double calcFinalMark() {
    return (assignmentMark + testMark + examMark) / 3.0;
  }
}