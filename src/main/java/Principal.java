public class Principal extends Staff {
    public Principal() {
    }

    public Principal(String staffID, String staffName, String staffGender) {
        super(staffID, staffName, staffGender);
    }


    @Override
    public void attendsMeeting() {
        System.out.println("Mr. "+ getStaffName()+ " hosts weekly meetings among staff members");
    }

    public String expel(Students students){
        if (students.isOffence() == true){
//            System.out.println("Principal expel "+ students.getStudentName() + " for gross misconduct");
            String expelled = "Principal expel "+ students.getStudentName() + " for gross misconduct";
            return expelled;
        } else {
//            System.out.println(students.getStudentName() + " is still a member of the school");
            String notExpelled = students.getStudentName() + " is still a member of the school";
            return notExpelled;
        }

    }
    public void admit(Applicants applicants){
        if (applicants.getApplicantAge() > 9 && applicants.applicantScore > 59){
            System.out.println(applicants.applicantName + " Congratulations! you have been offered provincial admission into our school");
        } else {
            System.out.println("Hard luck "+ applicants.getApplicantName() + "you did not meet the entry requirement");
        }

    }
    public void recruit(){
        System.out.println("Recruiting staff for school... ");
    }

}
