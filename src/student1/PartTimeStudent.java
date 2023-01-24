package student1;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bhavy
 */
public class PartTimeStudent extends Student1{
    private int numOfCourses;

    /**
     *
     * @param numOfCourses
     */
    
    public PartTimeStudent(int numOfCourses, String studentId, String studentName) {
        super(studentId, studentName);
        this.numOfCourses = numOfCourses;
    }

    public void setNumOfCourses(int numOfCourses) {
        this.numOfCourses = numOfCourses;
    }

    public int getNumOfCourses() {
        return numOfCourses;
    }

    
}
