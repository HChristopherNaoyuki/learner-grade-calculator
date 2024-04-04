// @author Naoyuki Christopher Higaki [ST10462415]
// Source Packages/main/Main

import javax.swing.JOptionPane;
import learner.Learner;

public class Main {
  public static void main(String[] args) {
    Learner learner = new Learner();
    getLearnerInput(learner);
    displayFinalMark(learner);
  }

  public static void getLearnerInput(Learner learner) {
    String fullName = JOptionPane.showInputDialog("Enter full name:");
    String subject = JOptionPane.showInputDialog("Enter subject:");
    double assignmentMark = Double.parseDouble(JOptionPane.showInputDialog("Enter assignment mark:"));
    double testMark = Double.parseDouble(JOptionPane.showInputDialog("Enter test mark:"));
    double examMark = Double.parseDouble(JOptionPane.showInputDialog("Enter exam mark:"));

    learner.setFullName(fullName);
    learner.setSubject(subject);
    learner.setAssignmentMark(assignmentMark);
    learner.setTestMark(testMark);
    learner.setExamMark(examMark);
  }

  public static void displayFinalMark(Learner learner) {
    double finalMark = learner.calcFinalMark();
    JOptionPane.showMessageDialog(null, "Final Mark: " + finalMark);
  }
}