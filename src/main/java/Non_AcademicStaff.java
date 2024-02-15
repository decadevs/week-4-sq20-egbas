public class Non_AcademicStaff extends Staff{
    String staffDepartment;

    public Non_AcademicStaff() {
    }

    public Non_AcademicStaff(String staffID, String staffName, String staffGender, String staffDepartment) {
        super(staffID, staffName, staffGender);
        this.staffDepartment = staffDepartment;
    }

    @Override
    public void attendsMeeting() {
        System.out.println("Attend weekly meetings with teachers and principal");
    }
}
