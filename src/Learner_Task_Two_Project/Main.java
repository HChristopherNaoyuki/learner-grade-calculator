package Learner_Task_Two_Project;

import javax.swing.JOptionPane; // Importing JOptionPane for dialog windows

// The Main class is the entry point for the application.
public class Main 
{
    // Main method to run the program.
    public static void main(String[] args) 
    {
        // Create an instance of the Learner class.
        Learner learner = new Learner();
        
        // Get user input for the learner's details.
        getLearnerInput(learner);
        
        // Display the final mark calculated from the learner's details.
        displayFinalMark(learner);
    }

    // Method to gather learner input through dialog boxes.
    public static void getLearnerInput(Learner learner) 
    {
        // Prompt the user to enter the learner's full name.
        String fullName = JOptionPane.showInputDialog("Enter full name:");
        
        // Prompt the user to enter the subject.
        String subject = JOptionPane.showInputDialog("Enter subject:");
        
        // Prompt the user to enter the assignment mark and parse it to double.
        double assignmentMark = Double.parseDouble(JOptionPane.showInputDialog("Enter assignment mark:"));
        
        // Prompt the user to enter the test mark and parse it to double.
        double testMark = Double.parseDouble(JOptionPane.showInputDialog("Enter test mark:"));
        
        // Prompt the user to enter the exam mark and parse it to double.
        double examMark = Double.parseDouble(JOptionPane.showInputDialog("Enter exam mark:"));

        // Set the gathered input into the learner object.
        learner.setFullName(fullName);
        learner.setSubject(subject);
        learner.setAssignmentMark(assignmentMark);
        learner.setTestMark(testMark);
        learner.setExamMark(examMark);
    }

    // Method to display the final mark to the user.
    public static void displayFinalMark(Learner learner) 
    {
        // Calculate the final mark using the learner's details.
        double finalMark = learner.calcFinalMark();
        
        // Display the final mark in a message dialog.
        JOptionPane.showMessageDialog(null, "Final Mark: " + finalMark);
    }
}
