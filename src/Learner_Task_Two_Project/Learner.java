package Learner_Task_Two_Project;

// The Learner class represents a student with information about their name, subject, and marks.
public class Learner 
{
    // Private member variables to store learner's information.
    private String fullName;      // Full name of the learner
    private String subject;       // Subject the learner is studying
    private double assignmentMark; // Marks obtained in assignments
    private double testMark;      // Marks obtained in tests
    private double examMark;      // Marks obtained in exams

    // Default Constructor
    // Initializes the learner with default values.
    public Learner() 
    {
        fullName = "Tricia Jones";      // Default name
        subject = "Computer Sciences";   // Default subject
        assignmentMark = 0.0;            // Default assignment mark
        testMark = 0.0;                  // Default test mark
        examMark = 0.0;                  // Default exam mark
    }

    // Getter Methods
    // Returns the full name of the learner.
    public String getFullName() 
    {
        return fullName;
    }

    // Returns the subject of the learner.
    public String getSubject() 
    {
        return subject;
    }

    // Returns the assignment mark of the learner.
    public double getAssignmentMark() 
    {
        return assignmentMark;
    }

    // Returns the test mark of the learner.
    public double getTestMark() 
    {
        return testMark;
    }

    // Returns the exam mark of the learner.
    public double getExamMark() 
    {
        return examMark;
    }

    // Setter Methods
    // Sets the full name of the learner.
    public void setFullName(String fullName) 
    {
        this.fullName = fullName;
    }

    // Sets the subject of the learner.
    public void setSubject(String subject) 
    {
        this.subject = subject;
    }

    // Sets the assignment mark of the learner.
    public void setAssignmentMark(double assignmentMark) 
    {
        this.assignmentMark = assignmentMark;
    }

    // Sets the test mark of the learner.
    public void setTestMark(double testMark) 
    {
        this.testMark = testMark;
    }

    // Sets the exam mark of the learner.
    public void setExamMark(double examMark) 
    {
        this.examMark = examMark;
    }

    // Method to calculate Final Mark
    // Calculates the average of the assignment, test, and exam marks.
    public double calcFinalMark() 
    {
        return (assignmentMark + testMark + examMark) / 3.0; // Returns the average mark
    }
}
