import org.example.Course;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Teachers implements Course {

    private String teacherID;
    private String teacherName;
    private String teacherGender;
    private String courseTitle;

    public Teachers(String teacherID, String teacherName, String teacherGender, String courseTitle) {
        this.teacherID = teacherID;
        this.teacherName = teacherName;
        this.teacherGender = teacherGender;
        this.courseTitle = courseTitle;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherGender() {
        return teacherGender;
    }

    public void setTeacherGender(String teacherGender) {
        this.teacherGender = teacherGender;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public Teachers() {

    }

//
//    @Override
//    public String toString() {
//        return "Teachers{" +
//                "courseTitle='" + courseTitle + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return "Teachers{" +
                "teacherID='" + teacherID + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", teacherGender='" + teacherGender + '\'' +
                ", courseTitle='" + courseTitle + '\'' +
                '}';
    }

    public static void readTeachersData(){
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        String line = "";

        List<Teachers> teacherList = new ArrayList<>();
        try {
            FileReader fr = new FileReader(desktopPath + "/teacherList.csv");
            BufferedReader br = new BufferedReader(fr);

            int count = 0;

//            br.readLine();
            while ((line = br.readLine()) != null){
                if (count != 0){
                    String[] teacherRecords = line.split(",");
//                System.out.println(Arrays.toString(studentRecords));
                    Teachers teachers = new Teachers(teacherRecords[0], teacherRecords[1], teacherRecords[2], teacherRecords[3]);
                    teacherList.add(teachers);
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
        for (int i = 0; i < teacherList.size(); i++){
            System.out.println(teacherList.get(i));
        }

    }


//
//    @Override
//    public void attendsMeeting() {
//        System.out.println("Mr. "+ getTeacherName()+ " Attends teachers attend weekly meetings");
//    }


    public String teachCourse(){
        String course = "Teaches";

//        System.out.println(getStaffName() + " teaches "+ courseTitle);
        return course;
    }


    @Override
    public void setAssessment(){
        System.out.println(getTeacherName() + " Sets assessment on "+courseTitle +" for students");
    }

    @Override
    public String teach() {
        return null;
    }

    @Override
    public void courseExams() {

    }

    @Override
    public void performance() {
//        if (courseScore > 70){
//            System.out.println("Student score is Excellent!");
//        } else if (students.courseScore < 70 && students.courseScore >= 50){
//            System.out.println("Student score is Good!");
//        } else {
//            System.out.println("Student score is Poor!");
//        }
    }
}
