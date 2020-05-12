package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student() {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
    }

    public void getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
    }



    public String getName() {
        return name;
    }
    void setName (String aName) {
        System.out.println(this.name);
    }

    public Integer getStudentId() {
        return studentId;
    }
    void setStudentId(Integer aStudentId) {
        System.out.println(this.studentId);
    }

    public Integer getNumberOfCredits() {
        return numberOfCredits;
    }
    void setNumberOfCredits(Integer aNumberOfCredits) {
        System.out.println(this.numberOfCredits);
    }

    public Double getGpa() {
        return gpa;
    }
    void setGpa(String aGpa) {
        System.out.println(this.gpa);
    }
}