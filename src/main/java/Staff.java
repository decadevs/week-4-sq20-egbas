import java.time.LocalDate;

abstract public class Staff{
    private String staffID;
    private String staffName;
    private String staffGender;
    public Staff() {
    }

    public Staff(String staffID, String staffName, String staffGender) {
        this.staffID = staffID;
        this.staffName = staffName;
        this.staffGender = staffGender;
    }


    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;

    }

    public void setStaffGender(String staffGender) {
        this.staffGender = staffGender;
    }

    public String getStaffID() {
        return staffID;
    }

    public String getStaffName() {
        return staffName;
    }

    public String getStaffGender() {
        return staffGender;
    }

    public abstract void attendsMeeting();
}
