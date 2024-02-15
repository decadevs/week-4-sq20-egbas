import java.time.LocalDate;

public class MySchool {
    String schoolName;
    Address schoolAddress;
    LocalDate schoolEstDate;

    public MySchool() {
    }

    public MySchool(String schoolName, Address schoolAddress, LocalDate schoolEstDate) {
        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
        this.schoolEstDate = schoolEstDate;
    }

    public void classRooms(){
        System.out.println("Blocks of several classrooms");
    }
    public void library(){
        System.out.println("A library for student's study");
    }
    public void schoolOffices(){
        System.out.println("A block of several offices for staff");
    }

}
