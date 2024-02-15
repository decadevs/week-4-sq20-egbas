abstract public class Courses{
    private String courseTitle;
    private String courseTutor;

    public Courses() {
    }

    public Courses(String courseTitle, String courseTutor) {
        this.courseTitle = courseTitle;
        this.courseTutor = courseTutor;
    }


    public abstract void courseExams();
    public abstract void performance (Students students);
    public abstract void setAssessment();
//        if (students.courseScore > 70){
//            System.out.println("Excellent!");
//        } else if (students.courseScore < 70 && students.courseScore >= 50){
//            System.out.println("Good!");
//        } else {
//            System.out.println("Poor!");
//        }
//    }
}
