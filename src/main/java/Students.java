import org.example.Course;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Students implements Course {
    private String studentName;
    private String studentId;
    private String studentGender;
    private int courseScore;
    private boolean payTuition;
    private boolean offence;



    public Students() {
    }

    public Students(String studentName, String studentId, String studentGender, int courseScore, boolean payTuition, boolean offence) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentGender = studentGender;
        this.courseScore = courseScore;
        this.payTuition = payTuition;
        this.offence = offence;
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentName='" + studentName + '\'' +
                ", studentId='" + studentId + '\'' +
                ", studentGender='" + studentGender + '\'' +
                ", courseScore=" + courseScore +
                ", payTuition=" + payTuition +
                ", offence=" + offence +
                '}';
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public boolean isOffence() {
        return offence;
    }

    public void setOffence(boolean offence) {
        this.offence = offence;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public int getCourseScore() {
        return courseScore;
    }

    public void setCourseScore(int courseScore) {
        this.courseScore = courseScore;
    }

    public boolean isPayTuition() {
        return payTuition;
    }

    public void setPayTuition(boolean payTuition) {
        this.payTuition = payTuition;
    }

    public boolean takeCourse(boolean payTuition){
        if (payTuition == true){
//            System.out.println(studentName + " is permitted to take exams");
            return true;
        } else {
//            System.out.println(studentName + " is not eligible to take exams");
        }

        return false;

    }
    public static void readStudentsData(){
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        String line = "";

        List<Students> studentList = new ArrayList<>();
        try {
            FileReader fr = new FileReader(desktopPath + "/studentList.csv");
            BufferedReader br = new BufferedReader(fr);

            int count = 0;

//            br.readLine();
            while ((line = br.readLine()) != null){
                if (count != 0){
                    String[] studentRecords = line.split(",");
//                System.out.println(Arrays.toString(studentRecords));
                    Students students = new Students(studentRecords[0], studentRecords[1], studentRecords[2], Integer.parseInt(studentRecords[3]), Boolean.parseBoolean(studentRecords[4]), Boolean.parseBoolean(studentRecords[5]));
                    studentList.add(students);
                }
                count++;

            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < studentList.size(); i++){
            System.out.println(studentList.get(i));
        }

    }

    @Override
    public void courseExams() {

    }

    @Override
    public void performance() {
        if (courseScore >= 70){
            System.out.println("Excellent!");
        } else if (courseScore < 70 && courseScore >= 50){
            System.out.println("Good!");
        } else {
            System.out.println("Poor!");
        }
    }

    @Override
    public void setAssessment() {

    }

    @Override
    public String teach() {

        return null;
    }

//
//    public void performance(Students students) {
//        if (students.courseScore > 70){
//            System.out.println("Excellent!");
//        } else if (students.courseScore < 70 && students.courseScore >= 50){
//            System.out.println("Good!");
//        } else {
//            System.out.println("Poor!");
//        }
//    }

}
